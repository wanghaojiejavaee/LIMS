package cs.edu.zut.Lims.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.edu.zut.Lims.admin.service.UserManager;
import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/user")
public class UserController extends GenericController<User, Long, UserManager> {

    UserManager userManager;

    @RequestMapping("/index")
    public String index() {
        return "user/index";
    }

    @Autowired
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
        this.manager = this.userManager;
    }
}
