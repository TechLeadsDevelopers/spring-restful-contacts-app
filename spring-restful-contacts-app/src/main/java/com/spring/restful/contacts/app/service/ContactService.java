package com.spring.restful.contacts.app.service;

import java.util.List;

import com.spring.restful.contacts.app.model.Contact;

public interface ContactService {
	public Contact createContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getContactById(Long id);
	public Contact updateContactById(Contact contact, Long id);
	public Contact deleteContactById(Long id);
	public List<Contact> createContactBatch(List<Contact> contacts);
}
