package com.cjc.main.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableMethodSecurity
@Configuration
public class WebSecurityConfig {
	
	
	@Bean
	SecurityFilterChain securityFilterChai(HttpSecurity http) throws Exception
	{
		
		http.csrf().disable()
		     .authorizeHttpRequests(authRequest->authRequest.anyRequest().authenticated())
		     .httpBasic(Customizer.withDefaults());
		
		
		return http.build();
	}
	

}
