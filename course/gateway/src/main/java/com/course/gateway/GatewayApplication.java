package com.course.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@EnableEurekaClient
@SpringBootApplication
public class GatewayApplication {
	public static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);
	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
		SpringApplication app = new SpringApplication(GatewayApplication.class);
		ConfigurableEnvironment environment = app.run(args).getEnvironment();
		LOG.info("启动 Eureka");
		LOG.info("gateway地址：http://127.0.0.1:{}", environment.getProperty("server.port"));
	}

}
