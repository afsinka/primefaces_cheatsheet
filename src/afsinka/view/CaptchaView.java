package afsinka.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.ActionEvent;

import afsinka.datatype.Applicant;

@ManagedBean
public class CaptchaView {

	@ManagedProperty(value = "#{applicant}")
	private Applicant applicant;

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public void submit(ActionEvent actionEvent) {

		System.out.println(applicant);
	}

}
