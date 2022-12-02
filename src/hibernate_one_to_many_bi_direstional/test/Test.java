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
//            Department department = new Department("Cyber", 900, 9000);
//            Employee employee1 = new Employee("Lena", "Ch", 900);
//            Employee employee2 = new Employee("Sobaka", "Yablonski", 1200);
//            Employee employee3 = new Employee("Cat", "Haf", 300);
//            Employee employee5 = new Employee("Andrew", "Nah", 100);
//            department.addEmpsToDep(employee1);
//            department.addEmpsToDep(employee2);
//            department.addEmpsToDep(employee3);
//            department.addEmpsToDep(employee5);


            session.beginTransaction();
            Department department = session.get(Department.class, 3);
            System.out.println("DEPARTMENT");
            System.out.println(department);

            session.getTransaction().commit();
            System.out.println("EMPS");
            System.out.println(department.getEmployeeList());
        }
    }
}
