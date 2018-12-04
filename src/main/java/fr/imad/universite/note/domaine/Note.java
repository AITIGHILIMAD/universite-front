package fr.imad.universite.note.domaine;

import fr.imad.universite.etudiant.domaine.Etudiant;
import fr.imad.universite.matiere.domaine.Matiere;

public class Note {

	private NotePK notepk;

	private Etudiant etudiant;

	private Matiere matiere;

	private Double note;

	public NotePK getNotepk() {
		return notepk;
	}

	public void setNotepk(NotePK notepk) {
		this.notepk = notepk;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

}
