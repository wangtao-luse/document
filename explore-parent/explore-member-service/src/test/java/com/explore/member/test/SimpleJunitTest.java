package com.explore.member.test;

import java.io.File;

import org.junit.jupiter.api.Test;

public class SimpleJunitTest {
@Test
public void testPath() {
	//获取项目目录
		String absolutePath = System.getProperty("user.dir");
		String location= new File(System.getProperty("user.dir")).getParent();
		System.out.println(absolutePath);
		System.out.println(location);
}

}
