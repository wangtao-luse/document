package com.explore.member.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name="explore-member-service")
public interface MemberTestApi {
@RequestMapping("/hello")
String hello( String name);
}
