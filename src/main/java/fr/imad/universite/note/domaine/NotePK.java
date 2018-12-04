package fr.imad.universite.note.domaine;

import java.io.Serializable;

public class NotePK implements Serializable {

	private Integer idEtudiant;

	private Integer idMatiere;

	public Integer getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(Integer idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public Integer getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(Integer idMatiere) {
		this.idMatiere = idMatiere;
	}

}
