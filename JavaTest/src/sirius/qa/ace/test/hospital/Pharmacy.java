package sirius.qa.ace.test.hospital;

import sirius.qa.ace.test.bean.BillBean;
import sirius.qa.ace.test.bean.MedicinesBean;
import sirius.qa.ace.test.bean.PrescriptionBean;

/**
 * Create a Pharmacy class to have the functionalitys availableDoctors() ,
 * selectDoctor().
 */
public class Pharmacy extends SiriusHospital {

	/**
	 * this method used to get the prescription.
	 */
	protected void getPrescription(PrescriptionBean a) {
		System.out.println("prescription");
		System.out.println("getPrescription from doctor");
		System.out.println(a.toString());

	}

	/**
	 * generateBill() method Analize prescription and Generate bill.
	 */
	protected void generateBill(BillBean a, MedicinesBean b) {

		System.out.println("Analize prescription and Generate bill");
		System.out.println("got medicines");
		System.out.println(a.toString());
		System.out.println(b.toString());

	}
}
