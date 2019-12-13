package com.cg.phonesimulator.factory;

import com.cg.phonesimulator.dao.ContactDAO;
import com.cg.phonesimulator.dao.ContactDAOImpl;
import com.cg.phonesimulator.services.ContactServices;
import com.cg.phonesimulator.services.ContactServicesImpl;

public class ContactFactory {
	public static ContactDAO instanceOfContactDAOImpl()
	{
		ContactDAO dao=new ContactDAOImpl();
		return dao;
	}
	public static ContactServices instanceOfContactServicesImpl()
	{
		ContactServices services=new ContactServicesImpl();
		return services;
	}
}
