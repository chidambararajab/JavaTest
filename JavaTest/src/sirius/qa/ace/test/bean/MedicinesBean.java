package sirius.qa.ace.test.bean;

/**
 * Create a MedicinesBean and to string for it.
 */
public class MedicinesBean {
	private Integer medicineID;
	private String medicineName;
	private Double medicineCost;

	/**
	 * @return the medicineID
	 */
	public Integer getMedicineID() {
		return medicineID;
	}

	/**
	 * @param medicineID the medicineID to set
	 */
	public void setMedicineID(Integer medicineID) {
		this.medicineID = medicineID;
	}

	/**
	 * @return the medicineName
	 */
	public String getMedicineName() {
		return medicineName;
	}

	/**
	 * @param medicineName the medicineName to set
	 */
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	/**
	 * @return the medicineCost
	 */
	public Double getMedicineCost() {
		return medicineCost;
	}

	/**
	 * @param medicineCost the medicineCost to set
	 */
	public void setMedicineCost(Double medicineCost) {
		this.medicineCost = medicineCost;
	}

	/**
	 * toString method which helps to display all the variablea in this class.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medicines [medicineID=");
		builder.append(medicineID);
		builder.append(", medicineName=");
		builder.append(medicineName);
		builder.append(", medicineCost=");
		builder.append(medicineCost);
		builder.append("]");
		return builder.toString();
	}

}
