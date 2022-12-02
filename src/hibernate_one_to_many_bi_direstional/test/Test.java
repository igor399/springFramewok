package hibernate_one_to_many_bi_direstional.test;


import hibernate_one_to_many_bi_direstional.entity.Department;
import hibernate_one_to_many_bi_direstional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
            session.delete(employee);
            session.getTransaction().commit();
        }
    }
}
