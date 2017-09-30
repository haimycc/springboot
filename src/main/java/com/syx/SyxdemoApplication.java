package com.syx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.syx.mapper")
public class SyxdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyxdemoApplication.class, args);
	}
}
