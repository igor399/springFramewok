import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();

            Employee employee = new Employee(
                    "Elena",
                    "Golovach",
                    "HR",
                    100);
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(employee);

            int iD = employee.getId();
            Employee employee1 = session.get(Employee.class, iD);
            session.getTransaction().commit();
            System.out.println(employee1);
        } finally {
            sessionFactory.close();
        }
    }
}
