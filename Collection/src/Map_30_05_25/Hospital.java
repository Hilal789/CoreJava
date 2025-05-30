package Map_30_05_25;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatments;
	private String contactPerson;
	private String contactNumber;
	private static int hCode = 99;   //for changing the hospital code automatic

	public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber) {
		super();
		Hospital.hCode++;
		this.hospitalCode = hCode;
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
	}

	public int getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}

	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
				+ listOfTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + "]\n";
	}
}
