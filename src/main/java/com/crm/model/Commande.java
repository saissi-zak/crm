package com.crm.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idcommande;
	private String numcommande;
	private double mntcommande;
	private String datecommande;
	
	@ManyToOne
	private Fournisseur frs;
	
	@ManyToMany
	private List<Bonlivraison> bls;
	
	
	
	
	
	public Fournisseur getFrs() {
		return frs;
	}
	public void setFrs(Fournisseur frs) {
		this.frs = frs;
	}
	public List<Bonlivraison> getBls() {
		return bls;
	}
	public void setBls(List<Bonlivraison> bls) {
		this.bls = bls;
	}
	public Commande(long idcommande, String numcommande, double mntcommande, String datecommande, Fournisseur frs,
			List<Bonlivraison> bls) {
		super();
		this.idcommande = idcommande;
		this.numcommande = numcommande;
		this.mntcommande = mntcommande;
		this.datecommande = datecommande;
		this.frs = frs;
		this.bls = bls;
	}
	public String getDatecommande() {
		return datecommande;
	}
	public void setDatecommande(String datecommande) {
		this.datecommande = datecommande;
	}
	public long getIdcommande() {
		return idcommande;
	}
	public void setIdcommande(long idcommande) {
		this.idcommande = idcommande;
	}
	public String getNumcommande() {
		return numcommande;
	}
	public void setNumcommande(String numcommande) {
		this.numcommande = numcommande;
	}
	public double getMntcommande() {
		return mntcommande;
	}
	public void setMntcommande(double mntcommande) {
		this.mntcommande = mntcommande;
	}
	
	
	@Override
	public String toString() {
		return "Commande [idcommande=" + idcommande + ", numcommande=" + numcommande + ", mntcommande=" + mntcommande
				+ ", datecommande=" + datecommande +  "]";
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
