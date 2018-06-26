package cs.edu.zut.Lims.teach.service;

import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import edu.zut.cs.javaee.dream.teach.domain.Student;
/**
 * 
 * @author liuxiaoming
 *
 */
public interface StudentManager extends GenericManager<Student, Long> {

	/**
	 * get student list by given code
	 *
	 * @param code
	 * @return
	 */
	List<Student> findByCode(String code);

	/**
	 * 
	 * @param fullname
	 * @return
	 */
	List<Student> findByFullname(String fullname);
}
