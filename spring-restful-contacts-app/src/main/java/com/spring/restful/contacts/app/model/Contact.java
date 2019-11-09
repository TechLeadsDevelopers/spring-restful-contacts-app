package com.spring.restful.contacts.app.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String mobile;
	private String email;
	private String status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "IST")
	private Date createdate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SS", timezone = "IST")
	private Timestamp lastmodified;
	
	public Contact() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Timestamp getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", mobile=" + mobile + ", email=" + email + ", status=" + status + ", createdate="
				+ createdate + ", lastmodified=" + lastmodified + "]";
	}
	

}
