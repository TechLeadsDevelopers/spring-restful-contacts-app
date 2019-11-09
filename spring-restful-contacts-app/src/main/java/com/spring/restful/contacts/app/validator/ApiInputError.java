package com.spring.restful.contacts.app.validator;

import java.util.List;

public class ApiInputError {
	private String code;
	private List<ApiFieldError> errros;
	
	public ApiInputError() {
	}
	
	public ApiInputError(String code, List<ApiFieldError> errros) {
		this.code = code;
		this.errros = errros;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<ApiFieldError> getErrros() {
		return errros;
	}
	public void setErrros(List<ApiFieldError> errros) {
		this.errros = errros;
	}

	@Override
	public String toString() {
		return "ApiInputError [code=" + code + ", errros=" + errros + "]";
	}
	

}
