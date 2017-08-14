package com.websystique.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.websystique.springboot.configuration.JpaConfiguration;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;


@Import(JpaConfiguration.class)
@ImportResource("/hello/integration.xml")
@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootCRUDApp {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(SpringBootCRUDApp.class, args);

		ConfigurableApplicationContext ctx = new SpringApplication(SpringBootCRUDApp.class).run(args);
		System.out.println("Hit Enter to terminate");
		System.in.read();
		ctx.close();

	}
}
