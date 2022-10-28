package com.explore.member.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
@RequestMapping("/hello")
public Map<String,String> hello(){
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("Msg", "hello");
	return map;
}
}
