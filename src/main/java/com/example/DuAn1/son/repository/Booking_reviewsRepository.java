package com.example.DuAn1.son.repository;

import com.example.DuAn1.Hibernate.HibernateUtils;
import com.example.DuAn1.entity.reviews_claims.Booking_reviews;
import org.hibernate.Session;

import java.util.List;

public class Booking_reviewsRepository {
    private Session s;

    public Booking_reviewsRepository(){
        s = HibernateUtils.getFACTORY().openSession();
    }

    public List<Booking_reviews> getAll(){
        return s.createQuery("From Booking_reviews").list();
    }

    public Booking_reviews getOne(Integer id){
        return s.find(Booking_reviews.class,id);
    }

    public void add(Booking_reviews br){
        try {
            s.getTransaction().begin();
            s.persist(br);
            s.getTransaction().commit();
        }catch (Exception e){
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(Booking_reviews br){
        try {
            s.getTransaction().begin();
            s.merge(br);
            s.getTransaction().commit();
        }catch (Exception e){
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void delete(Booking_reviews br){
        try {
            s.getTransaction().begin();
            s.delete(br);
            s.getTransaction().commit();
        }catch (Exception e){
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Booking_reviewsRepository().getAll());
    }
}
