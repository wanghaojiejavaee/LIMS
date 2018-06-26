package cs.edu.zut.Lims.customer.domain;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "T_CUSTOMER")
@Entity
public class Customer extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = -6172780675713487492L;

	@Column(name = "ADDRESS")
	String address;

	@Column(name = "FULLNAME")
	String fullname;

	@Column(name = "POSTCODE")
	String postcode;

	public String getAddress() {
		return address;
	}

	public String getFullname() {
		return fullname;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}
