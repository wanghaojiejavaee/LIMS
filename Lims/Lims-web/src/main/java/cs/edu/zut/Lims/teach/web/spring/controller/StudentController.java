package cs.edu.zut.Lims.teach.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs.edu.zut.Lims.teach.service.StudentManager;
import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.dream.teach.domain.Student;

@Controller
@RequestMapping("/teach/student")
public class StudentController extends GenericController<Student, Long, StudentManager> {

	StudentManager studentManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/student/index";
		return result;
	}

	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
		this.manager = this.studentManager;
	}

}
