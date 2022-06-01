package packmachine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import packmachine.hibernate.entity.Address;
import packmachine.hibernate.entity.City;
import packmachine.hibernate.entity.Person;

public enum HibernateHelper {

    INSTANCE;
    private SessionFactory sessionFactory;

    HibernateHelper() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Address.class)
                .buildSessionFactory();

    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public void init(){
        try(Session session = getSession()) {

        }
    }

}
