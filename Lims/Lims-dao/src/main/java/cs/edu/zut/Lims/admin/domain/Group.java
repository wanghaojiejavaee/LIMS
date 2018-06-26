package cs.edu.zut.Lims.admin.domain;

import cs.edu.zut.Lims.base.domain.BaseTreeEntity;

import javax.persistence.*;
import java.util.Set;

@Table(name = "T_ADMIN_GROUP")
@Entity
@NamedQueries({ @NamedQuery(name = "Group.getRoot", query = "select g from Group g where g.parent is null") })
public class Group extends BaseTreeEntity<Group> {

	/**
	 *
	 */
	private static final long serialVersionUID = -1751952224371998469L;

	@Column(name = "NAME")
	String name;

	@OneToMany(mappedBy = "group", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	Set<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
