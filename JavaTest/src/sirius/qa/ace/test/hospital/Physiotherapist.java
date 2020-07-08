package sirius.qa.ace.test.hospital;

import sirius.qa.ace.test.bean.DoctorBean;

/**
 * Create a Physiotherapist class which extends pharmacy class and implenments
 * Siriusspecialist interface.
 */
public class Physiotherapist extends Pharmacy implements SiriusSpecialist {

	/**
	 * greating method.
	 */
	public void greating(String speciality) {
		System.out.println("Hello I am a " + speciality);
	}

	/**
	 * listOfPatients method.
	 */
	public void listOfPatients(DoctorBean a) {
		System.out.println("listOfPatients");
		System.out.println(a.getPatientList());

	}

	public void prescription() {
		System.out.println("prescription");
	}

	/**
	 * physiotherapist method.
	 */
	public void physiotherapist(DoctorBean a) {
		System.out.println("physiotherapist");
		greating(a.getSpeciality());

	}

}
