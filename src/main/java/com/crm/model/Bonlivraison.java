package com.crm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Bonlivraison {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idbl;
	private String numbl;
	
	@ManyToMany(mappedBy = "bls")
	private List<Commande> cmds;
	
	public long getIdbl() {
		return idbl;
	}
	public void setIdbl(long idbl) {
		this.idbl = idbl;
	}
	public String getNumbl() {
		return numbl;
	}
	public void setNumbl(String numbl) {
		this.numbl = numbl;
	}
	@Override
	public String toString() {
		return "Bonlivraison [idbl=" + idbl + ", numbl=" + numbl + "]";
	}
	public Bonlivraison(long idbl, String numbl) {
		super();
		this.idbl = idbl;
		this.numbl = numbl;
	}
	public Bonlivraison() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
