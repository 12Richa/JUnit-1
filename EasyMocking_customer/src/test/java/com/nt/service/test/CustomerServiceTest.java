package com.nt.service.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.nt.service.CustomerDao;
import com.nt.service.CustomerService;

public class CustomerServiceTest {
	
	@Test
	public void test_findCustomer() {

		// create mock for dao
		CustomerDao dao = EasyMock.createMock(CustomerDao.class);
		// define behaviour for mock
		EasyMock.expect(dao.fetchNameById(101)).andReturn("raja");
		EasyMock.expect(dao.fetchNameById(102)).andReturn("rani");
		EasyMock.expect(dao.fetchNameById(103)).andReturn("Hk");
		EasyMock.expect(dao.fetchNameById(104)).andReturn("Murli");

		EasyMock.replay(dao);
         
		// inject mock into service class

		CustomerService service = new CustomerService();
		service.setDao(dao);
		String name = service.findCustomer(101);
		assertNotNull(name);
		

	}
}

