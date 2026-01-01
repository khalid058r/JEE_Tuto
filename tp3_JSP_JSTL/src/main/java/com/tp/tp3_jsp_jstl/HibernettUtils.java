package com.tp.tp3_jsp_jstl;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernettUtils {
    private static final SessionFactory sessionfactory;
    static {
        try{
            sessionfactory = new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable r)
        {
            r.printStackTrace();
            throw new ExceptionInInitializerError(r);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionfactory;
    }
}
