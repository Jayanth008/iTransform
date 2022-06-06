package com.employee.CustomerDetails;

public class Address {
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", Zip=" + Zip + ", country="
				+ country + "]";
	}
	private String street;
	private String city;
	private String state;
	private int Zip;
	private String country;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return Zip;
	}
	public void setZip(int zip) {
		Zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
