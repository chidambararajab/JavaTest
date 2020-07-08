package sirius.qa.ace.test.bean;

/**
 * Create a doctor bean and create a object for commoninfobean to get the
 * variables and methods from them
 */
public class DoctorBean {
	private String speciality;
	private String patientList;
	private CommonInfoBean info;

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @return the patientList
	 */
	public String getPatientList() {
		return patientList;
	}

	/**
	 * @param patientList the patientList to set
	 */
	public void setPatientList(String patientList) {
		this.patientList = patientList;
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
		builder.append("DoctorBean [speciality=");
		builder.append(speciality);
		builder.append(", patientList=");
		builder.append(patientList);
		builder.append(", info=");
		builder.append(info);
		builder.append("]");
		return builder.toString();
	}
}
