package com.packt.example.socialgoogle1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.google.api.Google;
import org.springframework.social.google.connect.GoogleConnectionFactory;

@Configuration @EnableSocial
@EnableConfigurationProperties(GoogleProperties.class)
public class GoogleConfigurerAdapter extends SocialConfigurerAdapter {
	@Autowired
	private GoogleProperties properties;
	
	@Bean
	@Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
	public Google google(final ConnectionRepository repository) {
		final Connection<Google> connection = repository.findPrimaryConnection(Google.class);
		return connection != null ? connection.getApi() : null;
	}
	
	@Override
	public void addConnectionFactories(ConnectionFactoryConfigurer configurer, Environment environment) {
		GoogleConnectionFactory factory = new GoogleConnectionFactory(this.properties.getAppId(), this.properties.getAppSecret());
		configurer.addConnectionFactory(factory);
	}
}
