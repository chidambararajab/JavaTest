package sirius.qa.ace.test.hospital;

/**
 * Create a Receptionist class to have the functionalitys availableDoctors() ,
 * selectDoctor().
 */
public class Receptionist extends SiriusHospital {

	/**
	 * get the list of available doctors.
	 */
	protected void availableDoctors(Physiotherapist a) {
		System.out.println("list of available doctors");
		selectDoctor(a);
	}

	/**
	 * get the list of available doctors.
	 */
	protected void availableDoctors(Cardiologist a) {
		System.out.println("list of available doctors");
		selectDoctor(a);
	}

	/**
	 * get the list of available doctors.
	 */
	protected void availableDoctors(Neurologist a) {
		System.out.println("list of available doctors");
		selectDoctor(a);
	}

	/**
	 * get the list of available doctors.
	 */
	protected void availableDoctors(InfectiousDisease a) {
		System.out.println("list of available doctors");
		selectDoctor(a);
	}

	/**
	 * selectDoctor method used to assign a doctor who is selected by the patient.
	 */
	protected void selectDoctor(Physiotherapist a) {
		System.out.println("Select Doctor will be assign to the patient");
	}

	/**
	 * selectDoctor method used to assign a doctor who is selected by the patient.
	 */
	protected void selectDoctor(Cardiologist a) {
		System.out.println("Select Doctor will be assign to the patient");
	}

	/**
	 * selectDoctor method used to assign a doctor who is selected by the patient.
	 */
	protected void selectDoctor(Neurologist a) {
		System.out.println("Select Doctor will be assign to the patient");
	}

	/**
	 * selectDoctor method used to assign a doctor who is selected by the patient.
	 */
	protected void selectDoctor(InfectiousDisease a) {
		System.out.println("Select Doctor will be assign to the patient");
	}
}
