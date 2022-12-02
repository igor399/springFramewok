package hibernate_test_2.test;


import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {


//            Employee employee = new Employee("Andrew", "Hacker", "Cyber", 10101010);
//            Detail detail = new Detail("Detroit", "+01020222", "matrixHastYou@gmail.com");
//            employee.setDetail(detail);
//            session.beginTransaction();

//            session.save(employee);
//            session.getTransaction().commit();

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 4);

            session.delete(employee);
            session.getTransaction().commit();
        }
    }
}
