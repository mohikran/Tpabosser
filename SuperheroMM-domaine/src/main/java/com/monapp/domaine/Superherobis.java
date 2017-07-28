package com.monapp.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Superherobis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String alias;
	
	
	public Superherobis(int shID, String nom, String prenom, String alias) {
		super();
		this.id = shID;
		this.nom = nom;
		this.prenom = prenom;
		this.alias = alias;
	}

	public Superherobis(String nom, String prenom, String alias) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.alias = alias;
	}
	
	public Superherobis(Superherobis sh) {
		this.nom = sh.getNom();
		this.prenom = sh.getPrenom();
		this.alias = sh.getAlias();
	}
	
	public Superherobis() {
		super();
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public String toString() {
		return "Superherobis [" + nom + ", " + prenom + ", " + alias + "]";
	}
	
	
	

}
