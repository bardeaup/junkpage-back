package fr.junkpage.app.dto;

import java.util.List;

public class ListeValeursDto {
	
	public String codeListeValeurs;
	public String libelleListeValeurs;
	public List<ValeurDto> listeValeurs;
	
	
	public ListeValeursDto(String codeListeValeurs, String libelleListeValeurs, List<ValeurDto> listeValeurs) {
		super();
		this.codeListeValeurs = codeListeValeurs;
		this.libelleListeValeurs = libelleListeValeurs;
		this.listeValeurs = listeValeurs;
	}
	
	public ListeValeursDto() {
		super();
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
	public List<ValeurDto> getListeValeurs() {
		return listeValeurs;
	}
	public void setListeValeurs(List<ValeurDto> listeValeurs) {
		this.listeValeurs = listeValeurs;
	}
}
