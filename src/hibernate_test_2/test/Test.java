package hibernate_test_2.test;


import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

//           Session session = sessionFactory.getCurrentSession();
//           Employee employee = new Employee("Valera", "Neo", "Cyber", 999999);
//           Detail detail = new Detail("Chicago", "+010101011101", "matrixHasYou@gmail.com");
//           employee.setDetail(detail);
//           session.beginTransaction();
//           session.save(employee);
//           session.getTransaction().commit();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            session.delete(emp);

            session.getTransaction().commit();
        }
    }
}
