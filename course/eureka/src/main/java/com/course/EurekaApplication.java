package com.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	public static final Logger LOG  = LoggerFactory.getLogger(EurekaApplication.class);
	//将course的注册文件添加到Eureka子项目中
//	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
//
//	}
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EurekaApplication.class);
		ConfigurableEnvironment env = app.run(args).getEnvironment();
		LOG.info("启动成功");
		LOG.info("Eureka地址：\t http://127.0.0.1:{}",env.getProperty("server.port"));
	}

}
