package com.tp.tp3_jsp_jstl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class SportifModel {

    public static void save(sportif s)
    {
        Transaction transaction = null;
        try(Session session = HibernettUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(s);
            transaction.commit();
        }
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public static List<sportif> getAll()
    {
        try( Session session = HibernettUtils.getSessionFactory().openSession()) {
            return session.createQuery("from sportif",sportif.class).list();
        }
    }
    public static void delete(int id) {
        Transaction transaction = null;
        try(Session session = HibernettUtils.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            sportif s = session.get(sportif.class, id);
            if (s != null) {
                session.delete(s);
            }
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

    }

}
