package com.packt.example.socialauthcode.facebook;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "facebook")
public class EnhancedFacebookProperties {
	private String appId;
	private String appSecret;
	private String apiVersion;
}
