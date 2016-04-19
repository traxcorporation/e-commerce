package com.trax.eboutique.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.trax.eboutique.entities.Categorie;
import com.trax.eboutique.entities.Client;
import com.trax.eboutique.entities.Commande;
import com.trax.eboutique.entities.Panier;
import com.trax.eboutique.entities.Produit;
import com.trax.eboutique.entities.Role;

/**
 * 
 * @author ytraore
 *
 */
public class BoutiqueDaoImpl implements IBoutiqueDao {

	@PersistenceContext
	private EntityManager em;

	public long ajouterCategorie(Categorie categorie) {
		em.persist(categorie);
		return categorie.getIdCategorie();
	}

	@SuppressWarnings("unchecked")
	public List<Categorie> listCategorie() {
		final Query requeteListCategorie = em.createQuery("SELECT CATEGORIE FROM TRAXDEV.CATEGORIE");
		return requeteListCategorie.getResultList();
	}

	public Categorie getCategorie(long idCategorie) {
		return em.find(Categorie.class, idCategorie);
	}

	public void supprimerCategorie(long idCategorie) {
		final Categorie categorie = em.find(Categorie.class, idCategorie);
		em.remove(categorie);
	}

	public void modifierCategorie(Categorie categorie) {
		em.merge(categorie);
	}

	public long ajouterProduit(Produit produit, long idCategorie) {
		// final Categorie categorie = getCategorie(idCategorie);
		// produit(categorie);
		em.persist(produit);
		return produit.getIdProduit();
	}

	@SuppressWarnings("unchecked")
	public List<Produit> listeProduits() {
		final Query requeteListeProduit = em.createQuery("SELECT PRODUIT FROM TRAXDEV.PRODUIT");
		return requeteListeProduit.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Produit> produitParMotCles(String produitList) {
		final Query requeteProduitParMotCles = em.createQuery(
				"SELECT PRODUIT FROM TRAXDEV.PRODUIT WHERE PRODUIT_DESIGNATION LIKE :X OR PRODUIT_DESCRIPTION LIKE :X");
		requeteProduitParMotCles.setParameter("X", "%" + produitList + "%");
		return requeteProduitParMotCles.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Produit> produitParCategorie(long idCategorie) {
		final Query requeteProduitParCategorie = em
				.createQuery("SELECT PRODUIT FROM TRAXDEV.PRODUIT WHERE PRODUIT.CATEGORIE.CATEGORIE_ID=:X");
		requeteProduitParCategorie.setParameter("X", idCategorie);
		return requeteProduitParCategorie.getResultList();
	}

	public List<Produit> produitSelectionne() {
		// TODO Auto-generated method stub
		return null;
	}

	public Produit getProduit(long idProduit) {
		// TODO Auto-generated method stub
		return null;
	}

	public void supprimerProduit(long idProduit) {
		// TODO Auto-generated method stub

	}

	public void modifierProduit(Produit produit) {
		// TODO Auto-generated method stub

	}

	public void ajouterUser(UserTest user) {
		// TODO Auto-generated method stub

	}

	public void attribuerRole(Role role, long idUser) {
		// TODO Auto-generated method stub

	}

	public Commande enregistrerCommande(Panier panier, Client client) {
		// TODO Auto-generated method stub
		return null;
	}

}
