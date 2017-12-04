package com.usc.bill.dto;

import java.util.List;

/**
 * A Bill is a a complex structure computed at the end of a term for a student. It contains attributes about
 * the student to which the bill applies, such as demographics, the list of courses taken
 * by the student, and the list of transactions (charges and payments), comprising the bill.  
 * @author WU, Alamri, STROUD
 * @version 1.0 11/19/2017
 */ 
public class Bill{
	/**
	 * The unique id of the bill, generated by the system and used as the identifier of the bill.
	 */
	private String id;

	/**
	 * The first name of the student to which the bill is associated.
	 * E.g. if the student is "John Doe" the first name is "John".
	 */
	private String firstName;

	/**
	 * The last name of the student to which the bill is associated.
	 * E.g. if the student is "John doe" the last name is "Doe".
	 */
	private String lastName;

	/**
	 * The email address of the student to which the bill is associated.
	 */
	private String emailAddress;

	/**
	 * The phone number of the student to which the bill is associated.
	 */
	private String phone;

	/**
	 * The street address of the student to which the bill is associated.
	 */
	private String addressStreet;

	/**
	 * The state, e.g. SC, GA, NY, etc., of the student to which the bill is associated.
	 */	
	private String addressState;

	/**
	 * The city portion of the address, e.g. "New York City", "Columbia", "Atlanta", etc.
	 * of the student to which the bill is associated.
	 */
	private String addressCity;

	/**
	 * The ZIP code, aka Postal Code, portion of the address, e.g. 29170, 10026, etc., of the student
	 * to which the bill is associated.
	 */
	private String addressPostalCode;

	/**
	 * The school being attended by the student to which the bill is associated. College will be translated
	 * to the enum type College and its value restricted by this type.
	 */
	private String college;

	/**
	 * The name of the year or class of the student, e.g. Freshman, Sophomore, Junior, etc., to which the bill
	 * is associated to. ClassStatus will be translated to the enumerated type ClassStatus and its value restricted as such. 
	 */
	private String classStatus;

	/**
	 * The list of courses taken by the student to which the bill is associated. Each item in the list is a complex object,
	 * Course, containing the attributes of this class, such as a cource name and number of credit hours.
	 */
	private List<Course> courses;

	/**
	 * The list of transactions, i.e. payments and charges, made or incurred by the student for which the bill is associated.
	 * Each item in the list is a complex object, Transaction, containing attributes of this class, such as a dollar amount
	 * and a type, for payment or charge.
	 */
	private List<Transaction> transactions;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the addressStreet
	 */
	public String getAddressStreet() {
		return addressStreet;
	}

	/**
	 * @return the addressState
	 */
	public String getAddressState() {
		return addressState;
	}

	/**
	 * @return the addressCity
	 */
	public String getAddressCity() {
		return addressCity;
	}

	/**
	 * @return the addressPostalCode
	 */
	public String getAddressPostalCode() {
		return addressPostalCode;
	}

	/**
	 * @return the college
	 */
	public String getCollege() {
		return college;
	}

	/**
	 * @return the classStatus
	 */
	public String getClassStatus() {
		return classStatus;
	}

	/**
	 * @return the courses
	 */
	public List<Course> getCourses() {
		return courses;
	}

	/**
	 * @return the transactions
	 */
	public List<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @param addressStreet the addressStreet to set
	 */
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	/**
	 * @param addressState the addressState to set
	 */
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	/**
	 * @param addressCity the addressCity to set
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	/**
	 * @param addressPostalCode the addressPostalCode to set
	 */
	public void setAddressPostalCode(String addressPostalCode) {
		this.addressPostalCode = addressPostalCode;
	}

	/**
	 * @param college the college to set
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	/**
	 * @param classStatus the classStatus to set
	 */
	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}