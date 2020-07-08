package sirius.qa.ace.test.bean;

/**
 * Create a Prescription bean and to string for it.
 */
public class PrescriptionBean {
	private Integer prescriptionID;
	private String medicineList;

	/**
	 * @return the prescriptionID
	 */
	public Integer getPrescriptionID() {
		return prescriptionID;
	}

	/**
	 * @param prescriptionID the prescriptionID to set
	 */
	public void setPrescriptionID(Integer prescriptionID) {
		this.prescriptionID = prescriptionID;
	}

	/**
	 * @return the medicineList
	 */
	public String getMedicineList() {
		return medicineList;
	}

	/**
	 * @param medicineList the medicineList to set
	 */
	public void setMedicineList(String medicineList) {
		this.medicineList = medicineList;
	}

	/**
	 * toString method which helps to display all the variablea in this class.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prescription [prescriptionID=");
		builder.append(prescriptionID);
		builder.append(", medicineList=");
		builder.append(medicineList);
		builder.append("]");
		return builder.toString();
	}

}
