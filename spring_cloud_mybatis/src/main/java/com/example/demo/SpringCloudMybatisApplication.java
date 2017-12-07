package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.crady.bean.SystemParams;

@MapperScan("com.crady.dao")
@EnableConfigurationProperties({SystemParams.class})
@SpringBootApplication
public class SpringCloudMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMybatisApplication.class, args);
	}
}
