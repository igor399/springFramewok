import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test3 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 9);
//            employee.setSalary(10000);
            session.createQuery("update Employee set salary = 9000 " +
                    "where name = 'Igor'").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
