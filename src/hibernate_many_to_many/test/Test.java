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

//            Section section1 = new Section("Tennis");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Swimming");

//            Child child = new Child("Andrew", 15);

//            child.addSections(section1);
//            child.addSections(section2);
//            child.addSections(section3);


            session.beginTransaction();
            Child child = session.get(Child.class, 4);
            System.out.println(child);
            System.out.println(child.getSections());
            session.getTransaction().commit();

        }

    }
}
