package com.explore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.explore.member.api.MemberTestApi;

@Controller
public class TestController {
	@Autowired
RestTemplate restTemplate;
@Autowired
MemberTestApi memberTestApi;
@RequestMapping("/show")
@ResponseBody
public String show() {
	return "springboot 2.7.5";
}
@RequestMapping("/restObject")
@ResponseBody
public String testRest() {
	
	//使用别名方式,使用别名方式取从注册中心上获取对应的服务调用地址。使用rest方式别名方式调用依赖ribbon负载均衡器
	String forObject = restTemplate.getForObject("http://explore-member-service/member/hello", String.class);
	return forObject;
}
@RequestMapping("/hello")
@ResponseBody
public String hello(String name) {
	String hello = memberTestApi.hello(name);
	return hello;
}
}
