package com.java5;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootAppApplication.class, args);
		Runtime rt = Runtime.getRuntime();
   try {
           rt.exec("cmd /c start chrome.exe http://localhost:8080");
      } catch (IOException e) {
           e.printStackTrace();
       }
		
	}

	
	
}
