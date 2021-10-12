package fr.junkpage.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = { 
		@UniqueConstraint(name = "contrainteAnneeMoisUnique", columnNames = { "annee", "mois" })
		})
public class JournalEdition {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String titre;
	@Column(unique=true)
	private String refJournalEdition;
	private int annee;
	private String mois;
	/**
	 * date déduite à partir du mois et de l'année de l'édition
	 */
	private Date dateEdition;
	private Date dateDebutPublication;
	private Date dateFinPublication;
	
	@OneToMany
	private List<Article> articles;
	
	
	public JournalEdition() {
		super();
	}

	public JournalEdition(String titre, int annee, String mois, String refJournalEdition, Date dateEdition, Date dateDebutPublication, Date dateFinPublication) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.mois = mois;
		this.refJournalEdition = refJournalEdition;
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

	public String getRefJournalEdition() {
		return refJournalEdition;
	}
	public void setRefJournalEdition(String refJournalEdition) {
		this.refJournalEdition = refJournalEdition;
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
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
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
