package com.explore.common;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.explore.common.resp.ResponseData;
import com.explore.common.resp.ResultData;
import com.explore.common.tool.StringTool;


public class TestResultObj {
	@Test
public void testStr() {
	String str  = new String();
	Member m = new Member();
	System.out.println("str： "+str);
	System.out.println("m： "+m);
	
}
	@Test
public void testresult() {
		ResponseData selectOne = TestResultObj.selectOne();
		ResultData queryOne = TestResultObj.queryOne();
		if(!StringTool.isEmpty(selectOne) &&!StringTool.isEmpty(selectOne.getReturnResult())) {
			System.out.println(selectOne.getReturnResult());
		}
		if(!StringTool.isEmpty(queryOne) &&!StringTool.isEmpty(queryOne.getReturnResult())) {
			System.out.println(queryOne.getReturnResult());
		}
		System.out.println("执行完成");
}
public static ResponseData selectOne() {
	ResponseData responseData = new ResponseData();
	String str = new String();
	HashMap<String, Object> map = new HashMap<String, Object>();
	responseData.setReturnResult(map);
	return responseData;
}
public static ResultData queryOne() {
	ResultData resultData = new ResultData();
	HashMap<String, Object> map = new HashMap<String, Object>();
	resultData.setReturnResult(map);
	return resultData;
}
}
