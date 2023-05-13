package com.java5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java5.model.Account;
import com.java5.utils.XCookie;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	private static final int MAX_AGE_SECONDS = 60 * 60 * 24; // 24h in seconds
	@Autowired
	ServletContext application;
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpServletResponse response;
	@RequestMapping("/index.php")
	public String index(Model model) {
		model.addAttribute("message", "Welcome to Spring MVC! Welcome to Java5 Course!");
		return "index";
	}
	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("message", "Welcome to the first Springboot Application!");
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		String username = XCookie.get("username", request);
		String password = XCookie.get("password", request);
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		return "login";
	}
	@PostMapping("/user")
	public String user() {
	Account account = new Account();
	String username = request.getParameter("username");
	String password=request.getParameter("password");
	if(username.equals("")||password.equals("")){
		return "login";
	}
	else {
		XCookie.add(username, username, 1, response);
		XCookie.add(password, password, 1, response);
		account.setUsername(username);
		account.setPassword(password);
		session.setAttribute("user", account);
	}
		return "user";
	}
}
