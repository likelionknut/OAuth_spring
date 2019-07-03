package com.packt.example.socialgoogle1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;

@Configuration @EnableSocial
@EnableConfigurationProperties(GoogleProperties.class)
public class GoogleConfigurerAdapter extends SocialConfigurerAdapter {
	@Autowired
	private GoogleProperties properties;
}
