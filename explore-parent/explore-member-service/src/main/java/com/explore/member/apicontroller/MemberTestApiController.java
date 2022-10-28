package com.explore.member.apicontroller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.explore.member.api.MemberTestApi;

@RestController
public class MemberTestApiController implements MemberTestApi {

	@Override
	public String hello(@RequestBody String name) {
		// TODO Auto-generated method stub
		return "hello "+name;
	}

}
