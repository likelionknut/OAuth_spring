package com.packt.example.rdbmserver.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class OAuth2AuthorizationServer {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
		String clientId = "clientapp";
		String clientSecret = "123456";
		clientSecret = encoder.encode(clientSecret);
		System.out.println(clientId);
		System.out.println(clientSecret);
	}
}
