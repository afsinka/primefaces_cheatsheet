package afsinka.datatype;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "applicant")
@ApplicationScoped
public class Applicant {

	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String placeOfBirth;
	private String selectedOffice;
	private Double gpa;

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public String getSelectedOffice() {
		return selectedOffice;
	}

	public void setSelectedOffice(String selectedOffice) {
		this.selectedOffice = selectedOffice;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getDateOfBirthAsString() {
		if (dateOfBirth == null) {
			return "";
		} else {
			SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
			return formatter.format(dateOfBirth);
		}
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FirstName=").append(firstName).append(",");
		sb.append("LastName=").append(lastName).append(",");
		sb.append("DateOfBirth=").append(dateOfBirth == null ? "" : dateOfBirth.toString()).append(",");
		sb.append("PlaceOfBirth=").append(placeOfBirth).append(",");
		sb.append("GPA=").append(gpa).append(",");
		sb.append("Office=").append(selectedOffice);

		return sb.toString();
	}


}
