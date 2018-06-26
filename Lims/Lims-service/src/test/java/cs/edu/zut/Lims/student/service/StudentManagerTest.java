package cs.edu.zut.Lims.student.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cs.edu.zut.Lims.teach.service.StudentManager;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.teach.domain.Student;

public class StudentManagerTest extends GenericManagerTestCase<Long, Student, StudentManager> {

	StudentManager studentManager;

	public StudentManagerTest() {
		super(Student.class);
	}

	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
		this.manager = this.studentManager;
	}

	@Before
	public void setUp() throws Exception {
		Student student = new Student();
		student.setFullName("张三");
		student.setAddress("河南省郑州市");
		student.setCode("450007");
		this.entity = this.manager.save(student);
	}

	@Test
	public void testFindByFullname() {
		List<Student> result = this.studentManager.findByFullname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getFullName());
	}

	@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getCode();
		List<Student> result = this.studentManager.findByCode(postcode);
		assertEquals(postcode, result.get(0).getCode());

	}

}
