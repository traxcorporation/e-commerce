package com.trax.eboutique.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * 
 * @author ytraore
 *
 */
public class testHibernateUtils {
	public static void main (String[] args) {
		
		System.out.println("Maven + Hibernate + MySQL");
        // Récupération de la session hibernate
		final Session session = HibernateUtils.getSessionFactory().openSession();
        //Début de la transaction
		final Transaction transaction = session.beginTransaction();
        //Création du premier utilisateur
        final  User user1 = new User();
        user1.setUserID(01);
        user1.setUserName("Youssouf TRAORE");        
        //Enregistrement de l'utilisateur 1
        session.save(user1);
        //Fin de la transaction
        transaction.commit();
        //Fermeture de la session hibernate
        session.close();
    }
}
