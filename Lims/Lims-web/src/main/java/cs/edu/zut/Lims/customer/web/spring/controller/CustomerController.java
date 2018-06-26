package cs.edu.zut.Lims.customer.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.edu.zut.Lims.customer.service.CustomerManager;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.dream.customer.domain.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController extends GenericController<Customer, Long, CustomerManager> {

    CustomerManager customerManager;

    @Autowired
    public void setCustomerManager(CustomerManager customerManager) {
        this.customerManager = customerManager;
        this.manager = this.customerManager;
    }

}
