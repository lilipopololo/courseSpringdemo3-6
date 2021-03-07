package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaApplication {
	//将course的注册文件添加到Eureka子项目中
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
