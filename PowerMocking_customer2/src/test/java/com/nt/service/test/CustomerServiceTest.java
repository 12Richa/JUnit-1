package com.nt.service.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nt.service.CustomerDao;
import com.nt.service.CustomerService;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.nt.*")
public class CustomerServiceTest {
	
	@Test
	public void test_findCustomer() {

		CustomerDao MockDao = PowerMockito.mock(CustomerDao.class);
    PowerMockito.when(MockDao.fetchNameById(12)).thenReturn("raja");
    PowerMockito.when(MockDao.fetchNameById(1)).thenReturn("richa");
    PowerMockito.when(MockDao.fetchNameById(2)).thenReturn("priya");
    PowerMockito.when(MockDao.fetchNameById(3)).thenReturn("rani");

		
         
		// inject mock into service class

		CustomerService service = new CustomerService();
		
		service.setDao(MockDao);
		String name = service.findCustomer(12);
		assertNotNull(name);
		

	}
}

