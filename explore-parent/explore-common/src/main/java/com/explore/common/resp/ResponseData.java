package com.explore.common.resp;

public class ResponseData {
private String resultCode;
private String resultMsg;
private Object returnResult;
public String getResultCode() {
	return resultCode;
}
public void setResultCode(String resultCode) {
	this.resultCode = resultCode;
}
public String getResultMsg() {
	return resultMsg;
}
public void setResultMsg(String resultMsg) {
	this.resultMsg = resultMsg;
}
public Object getReturnResult() {
	return returnResult;
}
public void setReturnResult(Object returnResult) {
	this.returnResult = returnResult;
}

}
