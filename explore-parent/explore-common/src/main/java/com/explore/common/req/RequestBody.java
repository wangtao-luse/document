package com.explore.common.req;

import com.alibaba.fastjson.JSONObject;

public class RequestBody {
private JSONObject content;
private String uId;
private String oauthId;
private String oauthType;
private String nickname;
private String avatar;
public JSONObject getContent() {
	return content;
}
public void setContent(JSONObject content) {
	this.content = content;
}
public String getuId() {
	return uId;
}
public void setuId(String uId) {
	this.uId = uId;
}
public String getOauthId() {
	return oauthId;
}
public void setOauthId(String oauthId) {
	this.oauthId = oauthId;
}
public String getOauthType() {
	return oauthType;
}
public void setOauthType(String oauthType) {
	this.oauthType = oauthType;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
public String getAvatar() {
	return avatar;
}
public void setAvatar(String avatar) {
	this.avatar = avatar;
}
}
