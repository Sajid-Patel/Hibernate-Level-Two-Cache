

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveStudent {

	public static void main(String[] args) {

		Student student = new Student(2, "abc", 27);

		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		
		session.save(student);
		session.beginTransaction().commit();
		
		
		

	}

}
