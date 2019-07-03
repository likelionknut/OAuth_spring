package com.packt.example.socialgoogle1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.google.connect.GoogleConnectionFactory;

@Configuration @EnableSocial
@EnableConfigurationProperties(GoogleProperties.class)
public class GoogleConfigurerAdapter extends SocialConfigurerAdapter {
	@Autowired
	private GoogleProperties properties;
	
	@Override
	public void addConnectionFactories(ConnectionFactoryConfigurer configurer, Environment environment) {
		GoogleConnectionFactory factory = new GoogleConnectionFactory(this.properties.getAppId(), this.properties.getAppSecret());
		configurer.addConnectionFactory(factory);
	}
}
