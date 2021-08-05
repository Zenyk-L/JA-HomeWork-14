package ua.lviv.lgs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Arrays;
import java.util.HashSet;


public class MainApp {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Cart cart = new Cart(5, "Dog");
//        session.persist(cart);

        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);
        Item item4 = new Item(4);

        cart.setItems(new HashSet<>(Arrays.asList(item1, item2, item3, item4)));
        session.persist(cart);


        transaction.commit();
        session.close();


    }
}
