package com.spring.restful.contacts.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.contacts.app.common.ContactURIs;
import com.spring.restful.contacts.app.model.Contact;
import com.spring.restful.contacts.app.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	private ContactService service;

	@RequestMapping(value = ContactURIs.CONCT_API_ROOT, method = RequestMethod.POST)
	public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
		contact = service.createContact(contact);
		return new ResponseEntity<Contact>(contact, HttpStatus.CREATED);

	}

	@RequestMapping(value = ContactURIs.CONCT_API_ROOT, method = RequestMethod.GET)
	public ResponseEntity<List<Contact>> getAllContacts() {
		List<Contact> contacts = service.getAllContacts();
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);

	}

	@RequestMapping(value = ContactURIs.CONCT_API_URI_BY_ID, method = RequestMethod.GET)
	public ResponseEntity<Contact> getContactById(@PathVariable("id") String id) {
		Contact contact = service.getContactById(Long.valueOf(id));
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);
	}

	@RequestMapping(value = ContactURIs.CONCT_API_URI_BY_ID, method = RequestMethod.PUT)
	public ResponseEntity<Contact> updateContactById(@PathVariable("id") String id, @RequestBody Contact contact) {
		contact = service.updateContactById(contact, Long.valueOf(id));
		contact = service.getContactById(Long.valueOf(id));
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);

	}

	@RequestMapping(value = ContactURIs.CONCT_API_ROOT_BATCH, method = RequestMethod.POST)
	public ResponseEntity<List<Contact>> createContactBatch(@RequestBody List<Contact> contacts) {
		contacts = service.createContactBatch(contacts);
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.CREATED);
	}

	@RequestMapping(value = ContactURIs.CONCT_API_URI_BY_ID, method = RequestMethod.DELETE)
	public ResponseEntity<Contact> deleteContact(@PathVariable("id") String id) {
		service.deleteContactById(Long.valueOf(id));
		Contact contact = new Contact();
		contact.setId(Long.valueOf(id));
		return new ResponseEntity<Contact>(contact, HttpStatus.GONE);
	}

}
