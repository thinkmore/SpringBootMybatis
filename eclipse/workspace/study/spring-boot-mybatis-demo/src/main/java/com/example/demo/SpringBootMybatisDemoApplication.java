package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootMybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisDemoApplication.class, args);
		/*for(int i=2;i<16;)
		{
			i*=2;
			System.out.println(i);
		}*/
	}
}
