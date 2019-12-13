package com.cg.phonesimulator.services;

import java.util.List;

import com.cg.phonesimulator.bean.ContactBean;

public interface ContactServices {
	public List<ContactBean> showAllContacts();
	public ContactBean searchContact(String name);
	public boolean operateContact();
}
