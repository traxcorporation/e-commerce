package com.trax.eboutique.dao;

import com.trax.eboutique.entities.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.connection.DriverManagerConnectionProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * @author ytraore
 *
 */
public class testHibernateUtils {
	
	private static final Logger log = LoggerFactory.getLogger(testHibernateUtils.class); 
	
	public static void main (String[] args) {
		
		log.debug("Maven + Hibernate + MySQL");
        // Récupération de la session hibernate
		final Session session = HibernateUtils.getSessionFactory().openSession();
        //Début de la transaction
		final Transaction transaction = session.beginTransaction();
        //Création du premier utilisateur
		final Categorie categorie1 = new Categorie();
		categorie1.setIdCategorie(01);
		categorie1.setNomCategorie("Produits laitiers");
		categorie1.setDescription("Vous avez les produits laitiers");
		categorie1.setNomPhoto("Yaouht");
		categorie1.setPhoto(null);
		
		
        //Enregistrement de l'utilisateur 1
        session.save(categorie1);
        //Fin de la transaction
        transaction.commit();
        //Fermeture de la session hibernate
        session.close();
    }
}
