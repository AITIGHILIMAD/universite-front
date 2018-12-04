package fr.imad.universite.matiere.domaine;

import java.util.List;

import fr.imad.universite.enseignant.domaine.Enseignant;
import fr.imad.universite.note.domaine.Note;

public class Matiere {

	private Enseignant enseignant;

	private Integer id;

	private Integer numeroMatiere;

	private String nom;

	private Integer coef;

	private String dateDebut;

	private String dateFin;

	private List<Note> notes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroMatiere() {
		return numeroMatiere;
	}

	public void setNumeroMatiere(Integer numeroMatiere) {
		this.numeroMatiere = numeroMatiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCoef() {
		return coef;
	}

	public void setCoef(Integer coef) {
		this.coef = coef;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}
