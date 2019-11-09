package com.spring.restful.contacts.app.dao;

import java.util.List;

import com.spring.restful.contacts.app.model.Contact;

public interface ContactDao {
	public int createContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getContactById(Long id);
	public int updateContactById(Contact contact, Long id);
	public int deleteContactById(Long id);
	public int[] createContactBatch(List<Contact> contacts);
}
