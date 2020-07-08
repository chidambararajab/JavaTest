package sirius.qa.ace.test.bean;

/**
 * Create a BillBean and to string for it.
 */
public class BillBean {
	private Integer billID;
	private String billDate;
	private String prescriptionMedicines;
	private Double cost;

	/**
	 * @return the billID
	 */
	public Integer getBillID() {
		return billID;
	}

	/**
	 * @param billID the billID to set
	 */
	public void setBillID(Integer billID) {
		this.billID = billID;
	}

	/**
	 * @return the billDate
	 */
	public String getBillDate() {
		return billDate;
	}

	/**
	 * @param billDate the billDate to set
	 */
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	/**
	 * @return the prescriptionMedicines
	 */
	public String getPrescriptionMedicines() {
		return prescriptionMedicines;
	}

	/**
	 * @param prescriptionMedicines the prescriptionMedicines to set
	 */
	public void setPrescriptionMedicines(String prescriptionMedicines) {
		this.prescriptionMedicines = prescriptionMedicines;
	}

	/**
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * toString method which helps to display all the variablea in this class.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bill [billID=");
		builder.append(billID);
		builder.append(", billDate=");
		builder.append(billDate);
		builder.append(", prescriptionMedicines=");
		builder.append(prescriptionMedicines);
		builder.append(", cost=");
		builder.append(cost);
		builder.append("]");
		return builder.toString();
	}

}
