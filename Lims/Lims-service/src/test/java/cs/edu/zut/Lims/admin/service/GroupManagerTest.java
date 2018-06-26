package cs.edu.zut.Lims.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import cs.edu.zut.Lims.admin.service.GroupManager;
import edu.zut.cs.javaee.dream.admin.domain.Group;
import edu.zut.cs.javaee.dream.base.service.GenericTreeManagerTestCase;

public class GroupManagerTest extends GenericTreeManagerTestCase<Long, Group, GroupManager> {

    GroupManager groupManager;

    public GroupManagerTest() {
        super(Group.class);
    }

    @Autowired
    public void setGroupManager(GroupManager groupManager) {
        this.groupManager = groupManager;
        this.manager = this.groupManager;
    }

}
