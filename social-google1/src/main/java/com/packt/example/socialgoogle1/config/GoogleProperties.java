package com.packt.example.socialgoogle1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.social.google")
public class GoogleProperties {
	private String appId;
	private String appSecret;
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
}
