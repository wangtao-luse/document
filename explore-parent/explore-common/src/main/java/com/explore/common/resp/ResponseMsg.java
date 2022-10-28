package com.explore.common.resp;

import java.util.List;

public class ResponseMsg<T> {
	private Boolean success;  //请求是否成功
	private List<T> list;    //结果的集合
	private int total;     //结果的总条数
	private Object obj;
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
