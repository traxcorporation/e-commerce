package com.trax.eboutique.dao;

import java.util.List;

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
public interface IBoutiqueDao {

	public long ajouterCategorie(Categorie categorie);
	public List<Categorie> listCategorie();
	public Categorie getCategorie(long idCategorie);
	public void supprimerCategorie(long idCategorie);
	public void modifierCategorie(Categorie categorie);

	public long ajouterProduit(Produit produit, long idCategorie);
	public List<Produit> listeProduits();
	public List<Produit> produitParMotCles(String produitList);
	public List<Produit> produitParCategorie(long idCategorie);
	public List<Produit> produitSelectionne();
	public Produit getProduit(long idProduit);
	public void supprimerProduit(long idProduit);
	public void modifierProduit(Produit produit);

	public void ajouterUser(UserTest user);
	public void attribuerRole(Role role, long idUser);
	public Commande enregistrerCommande(Panier panier, Client client);
}
