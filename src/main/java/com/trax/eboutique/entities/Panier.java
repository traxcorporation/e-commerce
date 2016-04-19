package com.trax.eboutique.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ytraore
 *
 */
public class Panier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<Long, LigneCommande> items = new HashMap<Long, LigneCommande>();
 	public void addItem(Produit p,int quantite){
 		final LigneCommande lgnCommande = new LigneCommande();
 		if(lgnCommande == null){
 			final LigneCommande article = new LigneCommande();
 			article.setProduit(p);
 			article.setQuantite(quantite);
 			article.setPrix(p.getPrix());
 			items.put(p.getIdProduit(), article);
 		}else{
 			lgnCommande.setQuantite(lgnCommande.getQuantite()+quantite);
 		}
 	}
 	
 	public Collection<LigneCommande> getItems(){
 		return items.values();
 	}
 	
 	public int getSize(){
 		return items.size();
 	}
 	
 	public double getTotal(){
 		double total =0;
 		for(LigneCommande lgnCommande : items.values()){
 			total += lgnCommande.getPrix() * lgnCommande.getQuantite();
 		}
 		return total;
 	}
 	
 	public void deleteItem(Long idProduit){
 		items.remove(idProduit);
 	}
}
