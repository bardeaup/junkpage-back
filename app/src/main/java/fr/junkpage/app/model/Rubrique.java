package fr.junkpage.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rubrique {
	
	/*
	 * Code auto généré à partir du libellé saisi par l'utilisateur 
	 */
	@Id
	private String code;
	private String libelle;
	
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
