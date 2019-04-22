package com.goomo.restWS.RestfulWS;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfulWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWsApplication.class, args);
	}

	// Code for Internationalization
		@Bean
		public LocaleResolver localeResolver() {

			AcceptHeaderLocaleResolver sessionLocaleResolver = new AcceptHeaderLocaleResolver();
			sessionLocaleResolver.setDefaultLocale(Locale.US);
			return sessionLocaleResolver;
		}

		@Bean
		public ResourceBundleMessageSource messageSource() {
			ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
			messageSource.setBasename("messages");
			return messageSource;
		}

	
}
