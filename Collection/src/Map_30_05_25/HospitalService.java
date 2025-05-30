package Map_30_05_25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService {

	ArrayList<Hospital> hos = new ArrayList<Hospital>();

	public int addHospital(String hospitalName, List<String> listOfTreatments, String contactPerson,
			String contactNumber, String location) {
		Hospital h = new Hospital(hospitalName, listOfTreatments, contactPerson, contactNumber);
		hos.add(h);
		return h.getHospitalCode();
	}

	Map<Integer, String> h = new HashMap<Integer, String>();

	public Map<Integer, String> getHospitals() {

		for (Hospital hh : hos) {
			h.put(hh.getHospitalCode(), hh.getHospitalName());
		}
		return h;
	}

	public Hospital getHospitalDetails(int code) {
		for (Hospital hospital : hos) {
			if (hospital.getHospitalCode() == code)
				return hospital;
		}
		return null;
	}

	public void getTotalHospitalDetails() {
		System.out.println(hos);
	}
}
