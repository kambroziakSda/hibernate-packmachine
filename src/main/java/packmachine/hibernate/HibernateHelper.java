package packmachine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import packmachine.hibernate.entity.*;

public enum HibernateHelper {

    INSTANCE;
    private SessionFactory sessionFactory;

    HibernateHelper() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(CollectedPack.class)
                .addAnnotatedClass(Message.class)
                .addAnnotatedClass(Pack.class)
                .addAnnotatedClass(PackMachine.class)
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

}
