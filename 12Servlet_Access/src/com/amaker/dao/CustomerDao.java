package com.amaker.dao;

import java.util.List;

import com.amaker.bean.Customer;

public interface CustomerDao {

	public void save(Customer c);
	public List list();
}
