package cs.edu.zut.Lims.module.dao;

import edu.zut.cs.javaee.dream.base.dao.GenericTreeDaoTestCase;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cs.edu.zut.Lims.module.dao.ModuleDao;
import cs.edu.zut.Lims.module.domain.Module;

import java.util.List;

import static org.junit.Assert.assertEquals;

;

public class ModuleDaoTest extends GenericTreeDaoTestCase<Long, Module, ModuleDao> {

	@Autowired
	ModuleDao moduleDao;

	@Test
	public void testGetRoot() {
		int root_size = 10;
		for (int i = 0; i < root_size; i++) {
			Module module = new Module();
			module.setEntityName("module" + i);
			for (int j = 0; j < 10; j++) {
				Module m = new Module();
				m.setEntityName("module" + i + "_" + j);
				m.setParent(module);
			}
			this.moduleDao.save(module);
		}
		List<Module> roots = this.moduleDao.getRoot();
		assertEquals(root_size, roots.size());
		if (logger.isInfoEnabled()) {
			logger.info("testGetRoot() - List<Module> roots=" + roots); //$NON-NLS-1$
		}

	}
}
