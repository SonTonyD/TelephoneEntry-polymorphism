
public final class Person extends TelephoneEntry {
	private String lastName;
	
	public Person(String name, String lastName, String address, TelephoneNumber telephoneNumber) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}
	
	public Person(String name, String lastName, String address, String countryCode, String localNumber) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.telephoneNumber = new TelephoneNumber(countryCode, localNumber);
	}

	public String description() {
		return ("I am a "+ name +" " + lastName + " and I live in " + address +"." );
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




}
