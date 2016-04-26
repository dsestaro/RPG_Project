package com.br.sestaro.configuration.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.br.sestaro.controller")
public class SpringInit {
	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringInit.class, args);
    }
}
