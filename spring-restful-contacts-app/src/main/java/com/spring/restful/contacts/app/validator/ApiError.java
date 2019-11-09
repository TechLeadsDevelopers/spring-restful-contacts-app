package com.spring.restful.contacts.app.validator;

import java.util.List;
public class ApiError {
	private String code;
	private List<String> messages;
	public ApiError() {
	}
	public ApiError(String code, List<String> messages) {
		this.code = code;
		this.messages = messages;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	@Override
	public String toString() {
		return "ApiError [code=" + code + ", messages=" + messages + "]";
	}
	
	

}
