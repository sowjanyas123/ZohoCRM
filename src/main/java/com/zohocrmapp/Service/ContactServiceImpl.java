package com.zohocrmapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.Entity.Contact;
import com.zohocrmapp.Repositary.ContactRepositary;
@Service
public class ContactServiceImpl implements ContactService {
@Autowired
private ContactRepositary contrepo;
	@Override
	public void SaveContact(Contact contact) {
		contrepo.save(contact);
	}
	@Override
	public List<Contact> getContacts() {
		List<Contact> contacts=contrepo.findAll();
		return contacts;
	}
	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contrepo.findById(id);
		Contact contact=findById.get();
		return contact;
	}

}
