package com.explore.common.resp;
//https://www.jb51.net/article/193946.htm
public class ResultMsg<T> {
private String code;
	  
private String msg;
	  
private T data;

public ResultMsg(String code, String msg) {
	super();
	this.code = code;
	this.msg = msg;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}
public static <T>ResultMsg<T> sucess() {
	return new ResultMsg<T>("10", "操作成功");
	
	
}
}
