import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Connector {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(Person.class);
			cfg.configure("Hibernate.cfg.xml");

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
					.build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		}

		return sessionFactory;
	}

	public static void destroySessionFactory() {
		if (sessionFactory != null)
			sessionFactory.close();
	}
}