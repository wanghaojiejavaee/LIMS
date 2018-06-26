package cs.edu.zut.Lims.customer.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cs.edu.zut.Lims.customer.service.CustomerManager;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.customer.domain.Customer;

public class CustomerManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {

	CustomerManager customerManager;

	public CustomerManagerTest() {
		super(Customer.class);
	}

	@Autowired
	public void setCustomerManager(CustomerManager customerManager) {
		this.customerManager = customerManager;
		this.manager = this.customerManager;
	}

	@Override
	public void setUp() throws Exception {
		Customer customer = new Customer();
		customer.setFullname("张三");
		customer.setAddress("河南省郑州市");
		customer.setPostcode("450007");
		this.entity = this.manager.save(customer);
	}

	@Test
	public void testFindByFullname() {
		List<Customer> result = this.customerManager.findByFullname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getFullname());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getPostcode();
		List<Customer> result = this.customerManager.findByPostcode(postcode);
		assertEquals(postcode, result.get(0).getPostcode());

	}

}
