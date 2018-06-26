package cs.edu.zut.Lims.teach.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Entity
@Table(name = "T_STUDENT")
public class Student extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4475744750767977852L;

	@Column
	String address;

	@Column
	String clazz;

	@Column
	String code;

	@Column
	String fullName;

	@Column
	Gender gender;

	@Column
	String grade;

	@Column
	String major;

	public String getAddress() {
		return address;
	}

	public String getClazz() {
		return clazz;
	}

	public String getCode() {
		return code;
	}

	public String getFullName() {
		return fullName;
	}

	public Gender getGender() {
		return gender;
	}

	public String getGrade() {
		return grade;
	}

	public String getMajor() {
		return major;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
