package com.trax.eboutique.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Entity;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author ytraore
 *
 */
@Entity
public class Categorie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long idCategorie;
	@NotEmpty
	@Size(min = 4, max = 20)
	private String nomCategorie;
	private String description;
	private String nomPhoto;
	@Lob
	private byte[] photo;
	@OneToMany(mappedBy = "categorie")
	private Collection<Produit> produits = new ArrayList<Produit>();

	public Categorie(String nomCategorie, String description, String nomPhoto, int idCategorie) {
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.nomPhoto = nomPhoto;

	}

	public Categorie() {
		super();
	}

	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}


}
