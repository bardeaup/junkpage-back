package fr.junkpage.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Article {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column
	private String refJournalEdition;
	
	@ManyToOne
	@JoinColumn(name="code_valeur")
	private ListeValeurs rubrique;
	
	private String titreChapeau;
	private String contenuChapeau;
	private String titreArticle;
	private String contenuArticle;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRefJournalEdition() {
		return refJournalEdition;
	}
	public void setRefJournalEdition(String refJournalEdition) {
		this.refJournalEdition = refJournalEdition;
	}
	public ListeValeurs getRubrique() {
		return rubrique;
	}
	public void setRubrique(ListeValeurs rubrique) {
		this.rubrique = rubrique;
	}
	public String getTitreChapeau() {
		return titreChapeau;
	}
	public void setTitreChapeau(String titreChapeau) {
		this.titreChapeau = titreChapeau;
	}
	public String getContenuChapeau() {
		return contenuChapeau;
	}
	public void setContenuChapeau(String contenuChapeau) {
		this.contenuChapeau = contenuChapeau;
	}
	public String getTitreArticle() {
		return titreArticle;
	}
	public void setTitreArticle(String titreArticle) {
		this.titreArticle = titreArticle;
	}
	public String getContenuArticle() {
		return contenuArticle;
	}
	public void setContenuArticle(String contenuArticle) {
		this.contenuArticle = contenuArticle;
	}


}
