package com.zohocrmapp.Service;

import java.util.List;

import com.zohocrmapp.Entity.Contact;

public interface ContactService {
public void SaveContact(Contact contact) ;

public List<Contact> getContacts();

public  Contact getContactById(long id) ;
	




	

}
