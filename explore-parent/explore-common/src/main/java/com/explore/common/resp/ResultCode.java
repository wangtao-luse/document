package com.explore.common.resp;

public enum ResultCode {
FAIL("00","操作失败！"),
SUCESS("10","操作成功！");

private String code;
private String msg;
private ResultCode(String code, String msg) {
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
}
