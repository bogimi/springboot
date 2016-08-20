package com.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.boot")
@EnableWebMvc
public class AppConfig {

	public UrlBasedViewResolver urlResolver() {
		UrlBasedViewResolver resolver =
				new UrlBasedViewResolver();
		resolver.setPrefix("/views");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
}
