package com.crm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idfrs;
	private String nomfrs;
	private String rcfrs;
	private String idefrs;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "frs")
	private List<Commande> cmds;
	
	public long getIdfrs() {
		return idfrs;
	}
	public void setIdfrs(long idfrs) {
		this.idfrs = idfrs;
	}
	public String getNomfrs() {
		return nomfrs;
	}
	public void setNomfrs(String nomfrs) {
		this.nomfrs = nomfrs;
	}
	public String getRcfrs() {
		return rcfrs;
	}
	public void setRcfrs(String rcfrs) {
		this.rcfrs = rcfrs;
	}
	public String getIdefrs() {
		return idefrs;
	}
	public void setIdefrs(String idefrs) {
		this.idefrs = idefrs;
	}
	@Override
	public String toString() {
		return "Fournisseur [idfrs=" + idfrs + ", nomfrs=" + nomfrs + ", rcfrs=" + rcfrs + ", idefrs=" + idefrs + "]";
	}
	public Fournisseur(long idfrs, String nomfrs, String rcfrs, String idefrs) {
		super();
		this.idfrs = idfrs;
		this.nomfrs = nomfrs;
		this.rcfrs = rcfrs;
		this.idefrs = idefrs;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
