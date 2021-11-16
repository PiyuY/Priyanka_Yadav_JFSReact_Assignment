package A6Collection.Question1;

public class Contact {
	private long phoneNumber;
	private String name;
	private String email;
	private Gender gender;

	public Contact(long phoneNumber, String name, String email, Gender gender) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

//	public long getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public Gender getGender() {
//		return gender;
//	}
//
//	public void setPhoneNumber(long phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public void setGender(Gender gender) {
//		this.gender = gender;
//	}

	@Override
	public String toString() {
		return "Phone Number: " + phoneNumber + "    Name: " + name + "   Email: " + email + "     Gender: " + gender;
	}

}
