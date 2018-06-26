package cs.edu.zut.Lims.student.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cs.edu.zut.Lims.admin.service.UserManagerTest;
import cs.edu.zut.Lims.teach.service.StudentManager;
import edu.zut.cs.javaee.dream.base.service.GenericGenerator;
import edu.zut.cs.javaee.dream.teach.domain.Gender;
import edu.zut.cs.javaee.dream.teach.domain.Student;

/**
 *  Entity Generator for teach package.
 * @author liuxiaoming
 *
 */
public class TeachEntityGenerator extends GenericGenerator {

	List<Student> studentList;

	StudentManager studentManager;

	@Autowired
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	@Before
	public void setUp() throws Exception {
		this.studentList = new ArrayList<Student>();
		InputStream input = UserManagerTest.class.getResourceAsStream("/javaee_student_software.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Student s = new Student();
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					cell.setCellType(CellType.STRING);
					String value = row.getCell(j).getStringCellValue().trim();
					if (j == 1)
						s.setGrade(value);
					if (j == 2)
						s.setMajor(value);
					if (j == 3)
						s.setClazz(value);
					if (j == 5)
						s.setCode(value);
					if (j == 6)
						s.setFullName(value);
					if (j == 7)
						if (StringUtils.equalsIgnoreCase("男", value)) {
							s.setGender(Gender.Male);
						} else if (StringUtils.equalsIgnoreCase("女", value)) {
							s.setGender(Gender.Female);
						}
				}
			}
			this.studentList.add(s);
		}
	}

	@Test
	public void test() {
		this.studentManager.save(this.studentList);
		List<Student> result = this.studentManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}

}
