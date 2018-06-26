package cs.edu.zut.Lims.base.dao;

import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;

import cs.edu.zut.Lims.base.BaseAbstractTestCase;
import cs.edu.zut.Lims.base.domain.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author liuxiaoming
 *
 * @param <PK>
 * @param <T>
 * @param <D>
 */
@ContextConfiguration(locations = { "classpath:/applicationContextTest-resources.xml",
		"classpath:/applicationContext-dao.xml" })
public class GenericDaoTestCase<PK extends Serializable, T extends BaseEntity, D extends GenericDao<T, PK>>
		extends BaseAbstractTestCase {

	protected D dao;

	protected T entity;

	protected PK id;

	protected List<T> list;

	@Before
	public void setUp() throws Exception {

	}
}
