package com.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * springboot2.4以后版本不支持zuul
 * @author wwang
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApp {
public static void main(String[] args) {
	SpringApplication.run(ZuulApp.class, args);
}
}
