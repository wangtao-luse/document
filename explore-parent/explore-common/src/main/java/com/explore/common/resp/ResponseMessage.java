package com.explore.common.resp;

public class ResponseMessage {
private String resultCode;
private String resultMsg;
private Object resultData;
public ResponseMessage(String resultCode, String resultMsg) {
	this.resultCode = resultCode;
	this.resultMsg = resultMsg;
}
public ResponseMessage(String resultCode, String resultMsg,Object resultData) {
	this.resultCode = resultCode;
	this.resultMsg = resultMsg;
	this.resultData = resultData;
}
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
public Object getResultData() {
	return resultData;
}
public void setResultData(Object resultData) {
	this.resultData = resultData;
}
public static ResponseMessage success() {
	return new ResponseMessage(ResultCode.SUCESS.getCode(), ResultCode.SUCESS.getMsg());
}
public static ResponseMessage success(Object obj) {
	return new ResponseMessage(ResultCode.SUCESS.getCode(), ResultCode.SUCESS.getMsg(),obj);
}
public static ResponseMessage fail() {
	return new ResponseMessage(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg());
}
public static ResponseMessage fail(Object obj) {
	return new ResponseMessage(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg(),obj);
}



}