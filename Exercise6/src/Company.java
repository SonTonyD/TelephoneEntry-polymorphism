
public final class Company extends TelephoneEntry {

	
	public Company(String name, String address, TelephoneNumber telephoneNumber) {
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}
	
	public Company(String name, String address, String countryCode, String localNumber) {
		this.name = name;
		this.address = address;
		this.telephoneNumber = new TelephoneNumber(countryCode, localNumber);
	}

	public String description() {
		return ("We are the company " + name + " and you can find us at "+ address +" .");
	}
	

}
