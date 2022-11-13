
public abstract class TelephoneEntry {
	
	protected String name;
	protected String address;
	protected TelephoneNumber telephoneNumber;

	abstract public String description();
	
	public String toString() {
		return (this.getClass().getSimpleName()+" "+ name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TelephoneNumber getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
}
