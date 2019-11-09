package com.spring.restful.contacts.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restful.contacts.app.dao.ContactDao;
import com.spring.restful.contacts.app.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactDao dao;

	@Override
	public Contact createContact(Contact contact) {
		int count = dao.createContact(contact);
		return contact;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = dao.getAllContacts();
		return contacts;
	}

	@Override
	public Contact getContactById(Long id) {
		Contact contact = dao.getContactById(id);
		return contact;
	}

	@Override
	public Contact updateContactById(Contact contact, Long id) {
		int count = dao.updateContactById(contact, id);
		return contact;
	}

	@Override
	public Contact deleteContactById(Long id) {
		int count = dao.deleteContactById(id);
		Contact contact = new Contact();
		contact.setId(id);
		return contact;

	}

	@Override
	public List<Contact> createContactBatch(List<Contact> contacts) {
		int count[] = dao.createContactBatch(contacts);
		return contacts;
	}

}
