package com.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ligne_commande {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double quantite;
	private double prix;
	private String unite;
	
	@ManyToOne
	private Commande cmd;
	
	@ManyToOne
	private Product prd;
	
	
		
	
	public Ligne_commande(long id, double quantite, double prix, String unite, Commande cmd, Product prd) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.prix = prix;
		this.unite = unite;
		this.cmd = cmd;
		this.prd = prd;
	}


	public Product getPrd() {
		return prd;
	}


	public void setPrd(Product prd) {
		this.prd = prd;
	}


	public Commande getCmd() {
		return cmd;
	}
	public void setCmd(Commande cmd) {
		this.cmd = cmd;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	@Override
	public String toString() {
		return "Ligne_commande [id=" + id + ", quantite=" + quantite + ", prix=" + prix + ", unite=" + unite + ", cmd="
				+ cmd + ", prd=" + prd + "]";
	}
	
	public Ligne_commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
