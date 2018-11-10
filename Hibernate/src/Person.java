import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@Column(name = "personID")
	int personID;

	@Column(name = "name")
	String name;

	@Column(name = "fatherName")
	String fatherName;

	@Column(name = "organization")
	String organization;

	@Column(name = "mobile")
	String mobile;

	Person(int personID, String name, String fatherName, String organization, String mobile) {
		this.personID = personID;
		this.name = name;
		this.fatherName = fatherName;
		this.organization = organization;
		this.mobile = mobile;

	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", name=" + name + ", fatherName=" + fatherName + ", organization="
				+ organization + ", mobile=" + mobile + "]";
	}

}
