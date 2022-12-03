package hibernate_many_to_many.test;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            Section section1 = new Section("Football");
//
//            Child child = new Child("Peotr", 11);
//            Child child1 = new Child("Vasya", 3);
//            Child child2 = new Child("Jana", 4);
//            section1.addChildren(child);
//            section1.addChildren(child1);
//            section1.addChildren(child2);

            session.beginTransaction();

            Child ch = session.get(Child.class,4);
            session.delete(ch);


            session.getTransaction().commit();

        }

    }
}
