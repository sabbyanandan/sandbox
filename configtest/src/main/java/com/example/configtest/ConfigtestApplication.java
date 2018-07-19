package com.example.configtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
@EnableBinding(Source.class)
@EnableConfigurationProperties({ ConfigtestProperties.class })
public class ConfigtestApplication {

	@Autowired
	private ConfigtestProperties properties;

	public static void main(String[] args) {
		SpringApplication.run(ConfigtestApplication.class, args);
	}

	@Bean
	@InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "10000"))
	public MessageSource<String> timerMessageSource() {
		return () -> new GenericMessage<>("Config value is: " + properties.getFooToOverride());
	}
}
