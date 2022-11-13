import java.util.Objects;

public class TelephoneNumber implements Comparable<TelephoneNumber> {
	private String countryCode;
	private String localNumber;
	
	public TelephoneNumber(String countryCode, String localNumber) {
		this.countryCode = countryCode;
		this.localNumber = localNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}
	
	
	@Override
    protected TelephoneNumber clone(){
        return new TelephoneNumber(countryCode, localNumber);
    }

    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber telephoneNumber = (TelephoneNumber) o;
        return countryCode.equals(telephoneNumber.countryCode) && localNumber.equals(telephoneNumber.localNumber);
	}
    
    @Override
    public int hashCode() {
        return Objects.hash(countryCode, localNumber);
    }

	@Override
	public int compareTo(TelephoneNumber o) {
		if (countryCode.compareTo(o.countryCode) > 0) {
			return 1;
		} else if (countryCode.compareTo(o.countryCode) == 0 && localNumber.compareTo(o.localNumber) > 0) {
			return 1;
		} else if(countryCode.equals(o.countryCode)  && localNumber.equals(o.localNumber)) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public String toString() {
		String s = ("+"+ countryCode +" "+ localNumber);
		return s;
	}
}
