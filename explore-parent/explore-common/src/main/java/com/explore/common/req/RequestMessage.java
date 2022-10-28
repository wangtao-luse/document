package com.explore.common.req;

public class RequestMessage {
private RequestHead requestHead;
private RequestBody body;
public RequestHead getRequestHead() {
	return requestHead;
}
public void setRequestHead(RequestHead requestHead) {
	this.requestHead = requestHead;
}
public RequestBody getBody() {
	return body;
}
public void setBody(RequestBody body) {
	this.body = body;
}
}
