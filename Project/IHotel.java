package com.maven.dao;

import java.util.List;

import com.maven.model.HotelManagement;

public interface IHotel {
	void saveCustomer(HotelManagement customer);

	void updateCustomer(HotelManagement customer);

	HotelManagement getCustomerById(int id);
	
	List<HotelManagement> getAllCustomer();

	void deleteCustomer(int id);
}
