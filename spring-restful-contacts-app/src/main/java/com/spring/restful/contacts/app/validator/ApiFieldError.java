package com.spring.restful.contacts.app.validator;

public class ApiFieldError {
	private String name;
	private String message;
	public ApiFieldError() {
	}
	public ApiFieldError(String name, String message) {
		this.name = name;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ApiFieldError [name=" + name + ", message=" + message + "]";
	}
	

}
