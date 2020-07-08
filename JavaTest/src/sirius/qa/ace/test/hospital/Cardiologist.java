package sirius.qa.ace.test.hospital;

import sirius.qa.ace.test.bean.DoctorBean;

/**
 * Create a Cardiologist class which extends Pharmacy and imlements
 * SiriusSpecialist.
 */
public class Cardiologist extends Pharmacy implements SiriusSpecialist {

	/**
	 * greating method.
	 */
	public void greating(String speciality) {
		System.out.println("Hello I am a " + speciality);
	}

	/**
	 * listOfPatients method .
	 */
	public void listOfPatients(DoctorBean a) {
		System.out.println("listOfPatients");
		System.out.println(a.getPatientList());

	}

	/**
	 * cardiologist method.
	 */
	public void cardiologist(DoctorBean a) {
		System.out.println("cardiologist");
		greating(a.getSpeciality());
	}

}
