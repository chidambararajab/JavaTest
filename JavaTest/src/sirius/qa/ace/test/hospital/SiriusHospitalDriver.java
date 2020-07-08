package sirius.qa.ace.test.hospital;

import sirius.qa.ace.test.bean.BillBean;
import sirius.qa.ace.test.bean.CommonInfoBean;
import sirius.qa.ace.test.bean.DoctorBean;
import sirius.qa.ace.test.bean.MedicinesBean;
import sirius.qa.ace.test.bean.PatientBean;
import sirius.qa.ace.test.bean.PrescriptionBean;

/**
 * Driver Class.
 */
public class SiriusHospitalDriver {

	/**
	 * driver method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		PatientBean patientBeanObject = new PatientBean();
		DoctorBean doctorBeanObject = new DoctorBean();
		MedicinesBean medicinesBeanObject = new MedicinesBean();
		BillBean billBeanObject = new BillBean();
		PrescriptionBean prescriptionBeanObject = new PrescriptionBean();

		Receptionist receptionistObject = new Receptionist();
		Pharmacy pharmacyObject = new Pharmacy();

		Physiotherapist physiotherapistObject = new Physiotherapist();
		Cardiologist cardiologistObject = new Cardiologist();
		InfectiousDisease infectiousDiseaseObject = new InfectiousDisease();
		Neurologist neurologistObject = new Neurologist();

		System.out.println("---patient nead Physiotherapist----");
		patientBeanObject.setInfo(new CommonInfoBean());
		patientBeanObject.setPatientID(1);
		patientBeanObject.setDiseaseType("corona");
		patientBeanObject.getInfo().setAge(22);
		patientBeanObject.getInfo().setContact(86877877);
		patientBeanObject.getInfo().setFirstName("Karthi");
		patientBeanObject.getInfo().setLastName("Ravi");
		doctorBeanObject.setInfo(new CommonInfoBean());
		doctorBeanObject.setPatientList("1000patientList");
		doctorBeanObject.setSpeciality("Physiotherapist");
		doctorBeanObject.getInfo().setAge(22);
		doctorBeanObject.getInfo().setContact(86877877);
		doctorBeanObject.getInfo().setFirstName("Karthi");
		doctorBeanObject.getInfo().setLastName("Ravi");

		System.out.println();
		receptionistObject.availableDoctors(physiotherapistObject);
		System.out.println();
		physiotherapistObject.physiotherapist(doctorBeanObject);
		System.out.println();
		physiotherapistObject.listOfPatients(doctorBeanObject);
		System.out.println();
		prescriptionBeanObject.setMedicineList("med_List");
		prescriptionBeanObject.setPrescriptionID(123);
		pharmacyObject.getPrescription(prescriptionBeanObject);
		System.out.println();
		medicinesBeanObject.setMedicineCost(100.12);
		medicinesBeanObject.setMedicineID(1111);
		medicinesBeanObject.setMedicineName("chid");
		pharmacyObject.generateBill(billBeanObject, medicinesBeanObject);

		System.out.println();

		System.out.println("---patient nead Cardiologist----");
		patientBeanObject.setInfo(new CommonInfoBean());
		patientBeanObject.setPatientID(1);
		patientBeanObject.setDiseaseType("corona");
		patientBeanObject.getInfo().setAge(22);
		patientBeanObject.getInfo().setContact(86877877);
		patientBeanObject.getInfo().setFirstName("Karthi");
		patientBeanObject.getInfo().setLastName("Ravi");
		doctorBeanObject.setInfo(new CommonInfoBean());
		doctorBeanObject.setPatientList("1000patientList");
		doctorBeanObject.setSpeciality("Physiotherapist");
		doctorBeanObject.getInfo().setAge(22);
		doctorBeanObject.getInfo().setContact(86877877);
		doctorBeanObject.getInfo().setFirstName("Karthi");
		doctorBeanObject.getInfo().setLastName("Ravi");

		receptionistObject.availableDoctors(physiotherapistObject);
		System.out.println();
		cardiologistObject.cardiologist(doctorBeanObject);
		System.out.println();
		cardiologistObject.listOfPatients(doctorBeanObject);
		System.out.println();
		prescriptionBeanObject.setMedicineList("med_List");
		prescriptionBeanObject.setPrescriptionID(123);
		pharmacyObject.getPrescription(prescriptionBeanObject);
		System.out.println();
		medicinesBeanObject.setMedicineCost(1001.02);
		medicinesBeanObject.setMedicineID(1115);
		medicinesBeanObject.setMedicineName("chid");
		pharmacyObject.generateBill(billBeanObject, medicinesBeanObject);

		System.out.println();

		System.out.println("---patient nead InfectiousDisease----");
		patientBeanObject.setInfo(new CommonInfoBean());
		patientBeanObject.setPatientID(1);
		patientBeanObject.setDiseaseType("corona");
		patientBeanObject.getInfo().setAge(22);
		patientBeanObject.getInfo().setContact(86877877);
		patientBeanObject.getInfo().setFirstName("Karthi");
		patientBeanObject.getInfo().setLastName("Ravi");
		doctorBeanObject.setInfo(new CommonInfoBean());
		doctorBeanObject.setPatientList("1000patientList");
		doctorBeanObject.setSpeciality("Physiotherapist");
		doctorBeanObject.getInfo().setAge(22);
		doctorBeanObject.getInfo().setContact(86877877);
		doctorBeanObject.getInfo().setFirstName("Karthi");
		doctorBeanObject.getInfo().setLastName("Ravi");

		receptionistObject.availableDoctors(physiotherapistObject);
		System.out.println();
		infectiousDiseaseObject.infectiousDiseaseSpecialist(doctorBeanObject);
		System.out.println();
		infectiousDiseaseObject.listOfPatients(doctorBeanObject);
		System.out.println();
		prescriptionBeanObject.setMedicineList("med_List");
		prescriptionBeanObject.setPrescriptionID(123);
		pharmacyObject.getPrescription(prescriptionBeanObject);
		System.out.println();
		medicinesBeanObject.setMedicineCost(1001.972);
		medicinesBeanObject.setMedicineID(111665);
		medicinesBeanObject.setMedicineName("chid");
		pharmacyObject.generateBill(billBeanObject, medicinesBeanObject);

		System.out.println();

		System.out.println("---patient nead Neurologist----");
		patientBeanObject.setInfo(new CommonInfoBean());
		patientBeanObject.setPatientID(1);
		patientBeanObject.setDiseaseType("corona");
		patientBeanObject.getInfo().setAge(22);
		patientBeanObject.getInfo().setContact(86877877);
		patientBeanObject.getInfo().setFirstName("Karthi");
		patientBeanObject.getInfo().setLastName("Ravi");
		doctorBeanObject.setInfo(new CommonInfoBean());
		doctorBeanObject.setPatientList("1000patientList");
		doctorBeanObject.setSpeciality("Physiotherapist");
		doctorBeanObject.getInfo().setAge(22);
		doctorBeanObject.getInfo().setContact(86877877);
		doctorBeanObject.getInfo().setFirstName("Karthi");
		doctorBeanObject.getInfo().setLastName("Ravi");

		receptionistObject.availableDoctors(physiotherapistObject);
		System.out.println();
		neurologistObject.neurologist(doctorBeanObject);
		System.out.println();
		neurologistObject.listOfPatients(doctorBeanObject);
		System.out.println();
		prescriptionBeanObject.setMedicineList("med_List");
		prescriptionBeanObject.setPrescriptionID(123);
		pharmacyObject.getPrescription(prescriptionBeanObject);
		System.out.println();
		medicinesBeanObject.setMedicineCost(11.902);
		medicinesBeanObject.setMedicineID(1111);
		medicinesBeanObject.setMedicineName("chid");
		pharmacyObject.generateBill(billBeanObject, medicinesBeanObject);
	}

}
