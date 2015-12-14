package com.trax.eboutique.dao;

import org.hibernate.classic.Session;

import com.trax.eboutique.dao.persistence.HibernateUtils;

public class UserDetailsHibernateTest 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        UserDetailsHibernate userDetailsHibernate = new UserDetailsHibernate();
        
        userDetailsHibernate.setUserId(5);
        userDetailsHibernate.setUserName("TRAORE");
        session.save(userDetailsHibernate);
        session.getTransaction().commit();
    }
}