package afsinka.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.ActionEvent;

import afsinka.datatype.Applicant;

@ManagedBean
public class FormView {

	@ManagedProperty(value = "#{applicant}")
	private Applicant applicant;

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public void firstStepSubmitAction(ActionEvent actionEvent) {
		// if fail in validation do NOT reach here

		System.out.println(applicant);
	}

}
