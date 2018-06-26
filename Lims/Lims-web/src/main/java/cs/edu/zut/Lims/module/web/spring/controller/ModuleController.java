package cs.edu.zut.Lims.module.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.edu.zut.Lims.module.service.ModuleManager;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericTreeController;
import edu.zut.cs.javaee.dream.module.domain.Module;

@Controller
@RequestMapping("/module")
public class ModuleController extends GenericTreeController<Module, Long, ModuleManager> {

    ModuleManager moduleManager;

    @Autowired
    public void setModuleManager(ModuleManager moduleManager) {
        this.moduleManager = moduleManager;
        this.manager = this.moduleManager;
        this.treeManager = this.moduleManager;
    }

}
