package com.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SecurityApp {
public static void main(String[] args) {
	SpringApplication.run(SecurityApp.class, args);
}
//1.将RestTemplate注册到Spring容器中
//2.使用rest方式别名方式调用依赖负载均衡器,@LoadBalanced能让RestTemplate在请求时拥有客户端负载均衡的作用
@Bean
@LoadBalanced
RestTemplate restTemplate() {
return new RestTemplate();	
}
}
