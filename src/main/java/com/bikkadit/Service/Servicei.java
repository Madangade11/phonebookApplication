package com.bikkadit.Service;

import java.util.List;

import com.bikkadit.model.Contact;

public interface Servicei {
boolean Addcontact(Contact contact);
	List<Contact>getallcontact();
	Contact getcontactById(Integer id);
	public boolean updatecontact(Contact contact);
	public boolean deleteById(Integer id);
	
}

