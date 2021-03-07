package com.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;


@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	public static final Logger LOG = LoggerFactory.getLogger(EurekaApplication.class);
	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
		SpringApplication app = new SpringApplication(EurekaApplication.class);
		ConfigurableEnvironment environment = app.run(args).getEnvironment();
		LOG.info("启动 Eureka");
		LOG.info("Eureka端口号{}", environment.getProperty("server.port"));
	}

}
