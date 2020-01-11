package com.capgemini.retailermaintenance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.UserDAO;
import com.capgemini.retailermaintenance.dto.OrderBean;
import com.capgemini.retailermaintenance.dto.ProductBean;
import com.capgemini.retailermaintenance.dto.UserBean;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public boolean createProfile(UserBean bean) {
		return dao.createProfile(bean);
	}

	@Override
	public UserBean login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public ProductBean getProduct(int productId) {
		return dao.getProduct(productId);
	}

	@Override
	public boolean updatePassword(int userId, String password) {
		return dao.updatePassword(userId, password);
	}

	@Override
	public List<OrderBean> getOrders(int userId) {
		return dao.getOrders(userId);
	}

}
