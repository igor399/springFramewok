package hibernate_one_to_many_uni_direstional.test;


import hibernate_one_to_many_uni_direstional.entity.Department;
import hibernate_one_to_many_uni_direstional.entity.Employee;
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


//            Department department = new Department("HR", 500, 1500);
//            Employee employee1 = new Employee("Igor", "Ch", 900);
//            Employee employee2 = new Employee("Sidar", "Yablonski", 1200);
//            department.addEmpsToDep(employee1);
//            department.addEmpsToDep(employee2);
//            session.beginTransaction();
//            session.save(department);


//            session.beginTransaction();
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());




            session.beginTransaction();
            Department department = session.get(Department.class, 2);
            session.delete(department);
            session.getTransaction().commit();
        }
    }
}
