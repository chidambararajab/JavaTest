package sirius.qa.ace.test.hospital;

import sirius.qa.ace.test.bean.DoctorBean;

/**
 * Create a Neurologist class which extends Pharmacy and imlements
 * SiriusSpecialist.
 */
public class Neurologist extends Pharmacy implements SiriusSpecialist {

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

	/**
	 * neurologist method.
	 */
	public void neurologist(DoctorBean a) {
		System.out.println("neurologist");
		greating(a.getSpeciality());
	}

}
