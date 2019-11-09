package com.spring.restful.contacts.app.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import com.spring.restful.contacts.app.model.Contact;

public class ConctBatchSetter implements BatchPreparedStatementSetter {
	List<Contact> contacts;
	public ConctBatchSetter(List<Contact> contacts) {
		this.contacts = contacts;
	}
	@Override
	public void setValues(PreparedStatement ps, int i) throws SQLException {
		ps.setString(1, contacts.get(i).getMobile());
		ps.setString(2, contacts.get(i).getEmail());;
		ps.setString(3, contacts.get(i).getStatus());
		ps.setDate(4,new java.sql.Date(new java.util.Date().getTime()));
		ps.setTimestamp(5,new Timestamp(new java.util.Date().getTime()));
	}

	@Override
	public int getBatchSize() {
		int batchSize=contacts.size();
		return batchSize;
	}

}
