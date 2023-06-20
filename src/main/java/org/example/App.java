package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // session factory ek tarike se connection ka kaam karta hai,, or ek project ke liye
        // ek hi session factory hona chahiye
        // hum session factory ko new session factory se object nahi bana sakte becoz ye ek interface hai
        // toh hume kisi class ki jarurat padegi uska object banane ke liye
        // jo hai configuration class (org.hibernate) waali
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // hum upar waale step ko aisa bhi kar sakte hai
        Configuration configuration = new Configuration();
        configuration.configure();
        // waise toh ye automatically detect kar lega hibernat.cfg.xml file ko
        // but agar kabhi nahi detect kar paya toh hume path provide karna padeg configure method mein
//        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // ab hum iss session factory ke object se session nikal sakte hai

        System.out.println(sessionFactory);
//        sessionFactory.close();
        System.out.println(sessionFactory.isClosed());


    }
}
