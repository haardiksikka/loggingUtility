package com.viva.aspectjdemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Response {
	private String success;
	private String req;
	private String code;
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
