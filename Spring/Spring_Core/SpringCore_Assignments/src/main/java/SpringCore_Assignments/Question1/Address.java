package SpringCore_Assignments.Question1;

public class Address {

	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + "]";
	}

	public Address() {}
	
	public Address(String street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

		
	//getters
	public String getStrret() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	//Setters
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	//Display Info
	public void displayAddress() {
      	System.out.println("Street: " + getStrret() + "\nCity: " + getCity() + "\nState: " + getState() + ", Zip-" + getZip() + ", Country: " + getCountry());
      	System.out.println();
	}
	
}
