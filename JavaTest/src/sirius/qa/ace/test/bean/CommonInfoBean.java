package sirius.qa.ace.test.bean;

/**
 * create a common info bean for patient bean and doctor bean.
 */
public class CommonInfoBean {

	private String firstName;
	private String lastName;
	private Integer age;
	private Integer contact;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the contact
	 */
	public Integer getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(Integer contact) {
		this.contact = contact;
	}

	/**
	 * toString method which helps to display all the variablea in this 
	 * class.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommonInfoBean [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", age=");
		builder.append(age);
		builder.append(", contact=");
		builder.append(contact);
		builder.append("]");
		return builder.toString();
	}

}
