package afsinka.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "utils")
public class Utils {

	private static final String[] places = { "Adana", "Ad�yaman", "Afyonkarahisar", "A�r�", "Amasya", "Ankara",
			"Antalya", "Artvin", "Ayd�n", "Bal�kesir", "Bilecik", "Bing�l", "Bitlis", "Bolu", "Burdur", "Bursa",
			"�anakkale", "�ank�r�", "�orum", "Denizli", "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum",
			"Eski�ehir", "Gaziantep", "Giresun", "G�m��hane", "Hakk�ri", "Hatay", "Isparta", "Mersin", "�stanbul",
			"�zmir", "Kars", "Kastamonu", "Kayseri", "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya",
			"Manisa", "Kahramanmara�", "Mardin", "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize", "Sakarya",
			"Samsun", "Siirt", "Sinop", "Sivas", "Tekirda�", "Tokat", "Trabzon", "Tunceli", "�anl�urfa", "U�ak", "Van",
			"Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n",
			"Ardahan", "I�d�r", "Yalova", "Karab�k", "Kilis", "Osmaniye", "D�zce" };

	private static final String[] officeList = { "Oslo", "Reykjavik", "Helsinki", "Stockholm", "Copenhagen" };

	private static final String NOT_NULL = "Cannot be empty!";

	public String getNotNullMessage() {
		return NOT_NULL;
	}

	private List<String> offices = new ArrayList<String>();

	public List<String> completeDateOfBirth(String query) {
		List<String> placeList = new ArrayList<String>();
		for (String city : places) {
			if (city.toUpperCase().startsWith(query.toUpperCase())) {
				placeList.add(city);
			}
		}
		return placeList;
	}

	@PostConstruct
	public void init() {
		for (String city : officeList) {
			offices.add(city);
		}

	}

	public List<String> getOffices() {
		return offices;
	}

	public void gpaValidator(FacesContext ctx, UIComponent component, Object value) throws ValidatorException {
		Double gpa = Double.valueOf(value.toString());
		if (gpa < 0 || gpa > 4) {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Must be a number between 0.0 and 4.0", null));
		}

	}

}
