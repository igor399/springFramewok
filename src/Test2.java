import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employees = session.createQuery("from Employee")
//                    .getResultList();

            List<Employee> employees = session.createQuery("from Employee where " +
                    "name='Igor' and salary > 9000")
                    .getResultList();

            for (Employee employee : employees)
                System.out.println(employee);
            session.getTransaction().commit();
        }
    }
}
