package sirius.qa.ace.test.bean;

/**
 * Create a patient bean and create a object for commoninfobean to get the
 * variables and methods from them
 */
public class PatientBean {
	
	private Integer patientID;
	private String diseaseType;
	private CommonInfoBean info;

	/**
	 * @return the patientID
	 */
	public Integer getPatientID() {
		return patientID;
	}
	

	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}

	/**
	 * @return the diseaseType
	 */
	public String getDiseaseType() {
		return diseaseType;
	}

	/**
	 * @param diseaseType the diseaseType to set
	 */
	public void setDiseaseType(String diseaseType) {
		this.diseaseType = diseaseType;
	}

	/**
	 * @return the info
	 */
	public CommonInfoBean getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(CommonInfoBean info) {
		this.info = info;
	}

	/**
	 * toString method which helps to display all the variablea in this 
	 * class and object class.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientBean [patientID=");
		builder.append(patientID);
		builder.append(", diseaseType=");
		builder.append(diseaseType);
		builder.append(", info=");
		builder.append(info.toString());
		builder.append("]");
		return builder.toString();
	}

}
