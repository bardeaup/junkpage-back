package fr.junkpage.app.dto;

public class ValeurDto {
	
	public String codeValeur;
	public String libelleValeur;
	
	public ValeurDto(String codeValeur, String libelleValeur) {
		super();
		this.codeValeur = codeValeur;
		this.libelleValeur = libelleValeur;
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
