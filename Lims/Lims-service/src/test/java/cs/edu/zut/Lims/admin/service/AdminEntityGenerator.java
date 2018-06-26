package cs.edu.zut.Lims.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cs.edu.zut.Lims.admin.service.GroupManager;
import cs.edu.zut.Lims.admin.service.RoleManager;
import cs.edu.zut.Lims.admin.service.UserManager;
import edu.zut.cs.javaee.dream.admin.domain.Group;
import edu.zut.cs.javaee.dream.admin.domain.User;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

public class AdminEntityGenerator extends GenericGenerator {

    @Autowired
    GroupManager groupManager;

    @Autowired
    RoleManager roleManager;

    @Autowired
    UserManager userManager;

    @Test
    public void gen_group() {
        for (int i = 0; i < 10; i++) {
            Group g = new Group();
            g.setName("group_" + i);
            this.groupManager.save(g);
            for (int j = 0; j < 10; j++) {
                Group group = new Group();
                group.setName("group_" + i + "_" + j);
                group.setParent(g);
                g = this.groupManager.save(group);
                this.gen_user(g);
            }
        }
    }

    public void gen_user(Group g) {
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setUsername("username_" + i);
            u.setPassword("password_" + i);
            u.setGroup(g);
            this.userManager.save(u);
        }
    }

}
