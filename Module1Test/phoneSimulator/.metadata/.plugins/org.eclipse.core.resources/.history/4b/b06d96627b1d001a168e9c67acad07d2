package com.cg.phonesimulator.services;

import java.util.List;
import com.cg.phonesimulator.bean.ContactBean;
import com.cg.phonesimulator.dao.ContactDAO;
import com.cg.phonesimulator.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices{
	
	ContactDAO dao=ContactFactory.instanceOfContactDAOImpl();
	@Override
	public List<ContactBean> showAllContacts() {

		return dao.showAllContacts();
	}

	@Override
	public ContactBean searchContact(String name) {
		return dao.searchContact(name);		
	}

	@Override
	public boolean operateContact() {
		return dao.operateContact();
	}



}
