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

	private static final String[] places = { "Adana", "Adýyaman", "Afyonkarahisar", "Aðrý", "Amasya", "Ankara",
			"Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa",
			"Çanakkale", "Çankýrý", "Çorum", "Denizli", "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum",
			"Eskiþehir", "Gaziantep", "Giresun", "Gümüþhane", "Hakkâri", "Hatay", "Isparta", "Mersin", "Ýstanbul",
			"Ýzmir", "Kars", "Kastamonu", "Kayseri", "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya",
			"Manisa", "Kahramanmaraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize", "Sakarya",
			"Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon", "Tunceli", "Þanlýurfa", "Uþak", "Van",
			"Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn",
			"Ardahan", "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce" };

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
