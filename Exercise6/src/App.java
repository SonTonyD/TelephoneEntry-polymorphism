import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		TelephoneEntry[] someTelephoneEntries = new TelephoneEntry[6];
		
		someTelephoneEntries[0] = new Person("Dinh", "Son-Tony", "Lyon, France 69200", new TelephoneNumber("33", "651635352"));
		someTelephoneEntries[1] = new Person("Derville", "Remi", "Rennes, France", new TelephoneNumber("33", "685421548"));
		someTelephoneEntries[2] = new Person("Dupont", "Jean", "Paris, France 95000", new TelephoneNumber("33", "763528496"));

		someTelephoneEntries[3] = new Company("Dasault", "9, Champs-Elysée Street Paris", new TelephoneNumber("33", "496523278"));
		someTelephoneEntries[4] = new Company("Renault", "Boulogne-Billancourt Paris", new TelephoneNumber("33", "446321458"));
		someTelephoneEntries[5] = new Company("Zobka", "Lodz", new TelephoneNumber("48", "552684623"));
		
		

		TreeMap<TelephoneNumber, TelephoneEntry> myTreeMap = new TreeMap<TelephoneNumber, TelephoneEntry>();
		
		//put all telephone entries in myTreeMap
		for (TelephoneEntry telephoneEntry : someTelephoneEntries) {
			TelephoneNumber key = telephoneEntry.getTelephoneNumber();
			TelephoneEntry value = telephoneEntry;
			myTreeMap.put(key, value);
		}

		// Get iterator
		Set<Entry<TelephoneNumber, TelephoneEntry>> set = myTreeMap.entrySet();
		Iterator<Entry<TelephoneNumber, TelephoneEntry>> iterator = set.iterator();

		// Print the TreeMap elements using iterator.
		System.out.println("TreeMap elements using iterator:");
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println("Key: " + mapEntry.getKey() + ", " + "Value: " + mapEntry.getValue());
		}

	}

}
