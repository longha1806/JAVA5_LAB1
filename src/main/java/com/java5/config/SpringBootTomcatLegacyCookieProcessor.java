package com.java5.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootTomcatLegacyCookieProcessor {
	@Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<TomcatServletWebServerFactory>() {
            @Override
            public void customize(TomcatServletWebServerFactory factory) {
                TomcatServletWebServerFactory tomcat = (TomcatServletWebServerFactory) factory;
//                tomcat.addContextCustomizers(context -> context.setCookieProcessor(new LegacyCookieProcessor()));
                
            }
        };
    }

}
