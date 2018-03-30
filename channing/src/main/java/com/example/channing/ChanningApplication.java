package com.example.channing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class ChanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChanningApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void process(String data) {
		System.out.println(data);
	}
}
