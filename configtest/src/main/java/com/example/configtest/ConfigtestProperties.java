package com.example.configtest;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by sanandan on 7/19/18.
 */
@ConfigurationProperties("configit")
public class ConfigtestProperties {
	private String fooToOverride = "foo it is!";

	public String getFooToOverride() {
		return fooToOverride;
	}

	public void setFooToOverride(String fooToOverride) {
		this.fooToOverride = fooToOverride;
	}
}
