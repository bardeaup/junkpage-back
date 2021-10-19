package fr.junkpage.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ListeValeurs {
	
	private String codeListeValeurs;
	private String libelleListeValeurs;
	@Id
	private String codeValeur;
	private String libelleValeur;
	
	
	public ListeValeurs() {
		super();
	}

	public ListeValeurs(String codeListeValeurs, String libelleListeValeurs, String codeValeur, String libelleValeur) {
		super();
		this.codeListeValeurs = codeListeValeurs;
		this.libelleListeValeurs = libelleListeValeurs;
		this.codeValeur = codeValeur;
		this.libelleValeur = libelleValeur;
	}
	
	public String getCodeListeValeurs() {
		return codeListeValeurs;
	}
	public void setCodeListeValeurs(String codeListeValeurs) {
		this.codeListeValeurs = codeListeValeurs;
	}
	public String getLibelleListeValeurs() {
		return libelleListeValeurs;
	}
	public void setLibelleListeValeurs(String libelleListeValeurs) {
		this.libelleListeValeurs = libelleListeValeurs;
	}
	public String getCodeValeur() {
		return codeValeur;
	}
	public void setCodeValeur(String codeValeur) {
		this.codeValeur = codeValeur;
	}
	public String getLibelleValeur() {
		return libelleValeur;
	}
	public void setLibelleValeur(String libelleValeur) {
		this.libelleValeur = libelleValeur;
	}
	
	
	

}
