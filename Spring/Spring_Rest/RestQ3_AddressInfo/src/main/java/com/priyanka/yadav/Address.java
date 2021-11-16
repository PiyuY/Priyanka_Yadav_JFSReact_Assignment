package com.priyanka.yadav;

public class Address {
	private int zipcode;
	private String state;
	private String country;
	private String city;
	
	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", state=" + state + ", country=" + country + ", city=" + city + "]";
	}

	
	
	public Address(int zipcode, String state, String country, String city) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
		this.city = city;
	}



	public int getZipcode() {
		return zipcode;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
