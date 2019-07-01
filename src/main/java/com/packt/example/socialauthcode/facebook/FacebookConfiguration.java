package com.packt.example.socialauthcode.facebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.social.SocialAutoConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactory;

public class FacebookConfiguration extends SocialAutoConfigurerAdapter {
	@Autowired
	private EnhancedFacebookProperties properties;
	
	@Override
	protected ConnectionFactory<?> createConnectionFactory() {
		return new CustomFacebookConnectionFactory(this.properties.getAppId(),
				this.properties.getAppSecret(), this.properties.getApiVersion());
	}
}
