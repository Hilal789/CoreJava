package Map_30_05_25;

import java.util.Arrays;
import java.util.List;

public class HospitalFinder {

	public static void main(String[] args) {
		HospitalService hs = new HospitalService();

		List<String> listOfTreatments = Arrays.asList("Cardiology", "Dermotology", "Opthomology");
		List<String> listOfTreatments2 = Arrays.asList("Radiology", "Dermotology", "Pathology");

		hs.addHospital("Naresh Hospital", listOfTreatments, "Hyd", "912321484373", "Nit H2");
		hs.addHospital("Astha Prime Hospital", listOfTreatments, "hyd", "6453434", "Sky");
		hs.addHospital("Aplo Hospital", listOfTreatments2, "Kol", "232323245332", "After Dead");
		hs.addHospital("Hilal Hospital", listOfTreatments, "Del", "756453434", "a");
		hs.addHospital("Faltu Hospital", listOfTreatments2, "Mum", "746534", "nferer");
		hs.getTotalHospitalDetails();

		System.out.println(hs.getHospitals());

		System.out.println(hs.getHospitalDetails(100));

	}

}
