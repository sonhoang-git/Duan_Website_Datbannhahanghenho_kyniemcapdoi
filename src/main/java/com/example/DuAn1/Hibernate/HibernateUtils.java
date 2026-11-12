package com.example.DuAn1.Hibernate;

import com.example.DuAn1.entity.cakes_gifts.Booking_cake_orders;
import com.example.DuAn1.entity.cakes_gifts.Booking_gift_orders;
import com.example.DuAn1.entity.cakes_gifts.Cake_catalog;
import com.example.DuAn1.entity.cakes_gifts.Gift_catalog;
import com.example.DuAn1.entity.reviews_claims.Booking_reviews;
import com.example.DuAn1.entity.reviews_claims.Complaint_compensations;
import com.example.DuAn1.entity.reviews_claims.Customer_complaints;
import com.example.DuAn1.entity.reviews_claims.Review_photos;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtils {
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServer2016Dialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=[RomanticDiningStore];encrypt=true;trustServerCertificate=true;");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123456");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(Booking_reviews.class);
        conf.addAnnotatedClass(Complaint_compensations.class);
        conf.addAnnotatedClass(Customer_complaints.class);
        conf.addAnnotatedClass(Review_photos.class);
        conf.addAnnotatedClass(Booking_cake_orders.class);
        conf.addAnnotatedClass(Booking_gift_orders.class);
        conf.addAnnotatedClass(Cake_catalog.class);
        conf.addAnnotatedClass(Gift_catalog.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);
    }


    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        System.out.println(getFACTORY());
    }

}
