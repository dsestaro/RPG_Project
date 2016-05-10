package com.br.sestaro.configuration.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Class to start the Spring Boot server.
 * 
 * @author davidson.sestaro
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.br.sestaro")
public class SpringInit {

    /**
     * Method to init spring boot application.
     * 
     * @param args				- Initial parameters
     */
    public static void main(final String[] args) {
	SpringApplication.run(SpringInit.class, args);
    }
}
