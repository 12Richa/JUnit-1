package com.nt.service;

public class CustomerService {
	private CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	public String findCustomer(Integer cid) {
		String name = dao.fetchNameById(cid);
		return name;

	}

}
