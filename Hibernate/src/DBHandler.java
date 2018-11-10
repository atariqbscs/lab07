import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBHandler {
	private Session session;

	public DBHandler() {
		session = Connector.getSessionFactory().openSession();
	}

	public void destroySession() {
		session.close();
		Connector.destroySessionFactory();
	}

	public void delete(Person person) {
		Transaction transaction = session.beginTransaction();
		session.delete(person);
		transaction.commit();
	}

	public List<Person> get() {
		return session.createQuery("from Person").list();
	}

	public void save(Person person) {
		Transaction transaction = session.beginTransaction();
		session.persist(person);
		transaction.commit();
	}

	public void update(Person person) {
		Transaction transaction = session.beginTransaction();
		session.update(person);
		transaction.commit();
	}
}