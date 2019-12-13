package com.cg.phonesimulator.controller;

import java.util.List;
import java.util.Scanner;

import com.cg.phonesimulator.bean.ContactBean;
import com.cg.phonesimulator.dao.ContactDAOImpl;
import com.cg.phonesimulator.factory.ContactFactory;
import com.cg.phonesimulator.services.ContactServices;

public class ContactMain {
	public static void main(String[] args) {
		ContactServices services=ContactFactory.instanceOfContactServicesImpl();

		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search for contact");
		System.out.println("Press 3 to operate on contact");

		System.out.println("Enter your choice...");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			List <ContactBean> list=services.showAllContacts();
			if(list!=null)
			{
				for (ContactBean user : list) {
					System.out.println(user);
				}
			}
			break;

		case 2:
			System.out.println("Enter name to be searched");

			String name=sc.next();
			ContactBean bean1=services.searchContact(name);
			System.out.println(bean1);
			break;

		case 3:
			boolean check=services.operateContact();
			System.out.println(check);
			break;
		default:
			break;
		}
	}
}
