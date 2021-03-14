package com.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;
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
		LOG.info("Eureka地址：http://127.0.0.1:{}", environment.getProperty("server.port"));
	}

}
