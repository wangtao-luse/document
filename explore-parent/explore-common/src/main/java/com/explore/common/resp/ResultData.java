package com.explore.common.resp;

import java.util.HashMap;
import java.util.Map;

public class ResultData {
	private String resultCode;
	private String resultMsg;
	private HashMap<String, Object> returnResult;
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
	public Map getReturnResult() {
		return returnResult;
	}
	public void setReturnResult(HashMap<String, Object> returnResult) {
		this.returnResult = returnResult;
	}
}
