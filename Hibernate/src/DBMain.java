import java.util.Iterator;
import java.util.List;

public class DBMain {
	public static void main(String[] args) {
		Person person = new Person(1, "Mike", "Ross", "seecs", "0123456789");
		// create a person object
		DBHandler tempPerson = new DBHandler();
		// INSERT
		tempPerson.save(person);
		person.setName("Mike Ross");
		person.setOrganization("seecs");

		// UPDATE
		tempPerson.update(person);

		// SELECT
		List<Person> list = tempPerson.get();
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person getPerson = it.next();
			System.out.println("Id: " + getPerson.getPersonID());
			System.out.println("Name: " + getPerson.getName());
			System.out.println("Father Name: " + getPerson.getFatherName());
			System.out.println("Organization: " + getPerson.getOrganization());
			System.out.println("Mobile Number: " + getPerson.getMobile());
		}
		// DELETE
		tempPerson.delete(person);

		tempPerson.destroySession();
	}
}