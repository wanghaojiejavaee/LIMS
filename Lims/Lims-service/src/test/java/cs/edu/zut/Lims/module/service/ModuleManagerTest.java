package cs.edu.zut.Lims.module.service;

import org.springframework.beans.factory.annotation.Autowired;

import cs.edu.zut.Lims.customer.service.CustomerManager;
import cs.edu.zut.Lims.module.service.ModuleManager;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.customer.domain.Customer;

public class ModuleManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {

    @Autowired
    ModuleManager moduleManager;

    public ModuleManagerTest() {
        super(Customer.class);
    }

}
