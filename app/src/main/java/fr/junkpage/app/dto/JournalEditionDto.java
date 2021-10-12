package fr.junkpage.app.dto;

import java.util.Date;

public class JournalEditionDto {

	public long id;
	public String titre;
	public int annee;
	public String mois;
	public String numeroEdition;
	/**
	 * date déduite à partir du mois et de l'année de l'édition
	 */
	private Date dateEdition;
	private Date dateDebutPublication;
	private Date dateFinPublication;
	
	
	public JournalEditionDto(long id, String titre, int annee, String mois, String numeroEdition, Date dateEdition, Date dateDebutPublication,
			Date dateFinPublication) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.mois = mois;
		this.numeroEdition = numeroEdition;
		this.dateEdition = dateEdition;
		this.dateDebutPublication = dateDebutPublication;
		this.dateFinPublication = dateFinPublication;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getMois() {
		return mois;
	}
	public void setMois(String mois) {
		this.mois = mois;
	}
	public String getNumeroEdition() {
		return numeroEdition;
	}
	public void setNumeroEdition(String numeroEdition) {
		this.numeroEdition = numeroEdition;
	}
	public Date getDateEdition() {
		return dateEdition;
	}
	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}
	public Date getDateDebutPublication() {
		return dateDebutPublication;
	}
	public void setDateDebutPublication(Date dateDebutPublication) {
		this.dateDebutPublication = dateDebutPublication;
	}
	public Date getDateFinPublication() {
		return dateFinPublication;
	}
	public void setDateFinPublication(Date dateFinPublication) {
		this.dateFinPublication = dateFinPublication;
	}
	
	
	
}
