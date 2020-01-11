package com.capgemini.retailermaintenance.dao;

import java.util.List;

import com.capgemini.retailermaintenance.dto.OrderBean;
import com.capgemini.retailermaintenance.dto.ProductBean;
import com.capgemini.retailermaintenance.dto.UserBean;

public interface UserDAO {

	public boolean createProfile(UserBean bean);

	public UserBean login(String email, String password);

	public ProductBean getProduct(int productId);

	public boolean updatePassword(int userId, String password);

	public List<OrderBean> getOrders(int userId);

}
