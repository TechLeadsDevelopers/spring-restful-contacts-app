package com.spring.restful.contacts.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.restful.contacts.app.common.DbQueries;
import com.spring.restful.contacts.app.model.Contact;

@Repository
public class ContactDaoImpl implements ContactDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int createContact(Contact contact){
		
		Object[] params = { contact.getMobile(), contact.getEmail(), contact.getStatus(), new java.util.Date(),
				new java.sql.Timestamp(new java.util.Date().getTime()) };
		int count = jdbcTemplate.update(DbQueries.INSERT_CONCT, params);
		return count;
	}

	@Override
	public List<Contact> getAllContacts(){
		List<Contact> contacts = null;
		contacts = jdbcTemplate.query(DbQueries.GET_ALL_CONCTS, new BeanPropertyRowMapper<Contact>(Contact.class));
		return contacts;
	}

	@Override
	public Contact getContactById(Long id){
		Object[] params= {id};
		Contact contact = jdbcTemplate.queryForObject(DbQueries.GET_CONCT_BY_ID,
				new BeanPropertyRowMapper<Contact>(Contact.class),params);
		return contact;
	}

	@Override
	public int updateContactById(Contact contact, Long id){
		int count = 0;
		Object[] params = { 
				contact.getMobile(), 
				contact.getEmail(),
				contact.getStatus(),
				new java.sql.Timestamp(new Date().getTime()), 
				id };
		count = jdbcTemplate.update(DbQueries.UPDATE_CONCT_BY_ID, params);
		return count;
	}

	@Override
	public int deleteContactById(Long id){
		int count = 0;
		Object[] params = { id };
		count = jdbcTemplate.update(DbQueries.DELETE_CONCT_BY_ID, params);
		return count;
	}

	@Override
	public int[] createContactBatch(List<Contact> contacts) {
		int count[] = null;
		count = jdbcTemplate.batchUpdate(DbQueries.INSERT_CONCT, new ConctBatchSetter(contacts));
		return count;
	}

	

}
