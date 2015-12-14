package com.trax.eboutique.dao;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.trax.eboutique.dao.persistence.HibernateUtils;

/**
 * 
 * @author ytraore
 *
 */
public class HibernateUser {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();

		final User user1 = new User();
		user1.setUserName("Arpit");
		user1.setUserMessage("Hello world from arpit");

		final User user2 = new User();
		user2.setUserName("Ankita");
		user2.setUserMessage("Hello world from ankita");

		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();

	}

}
