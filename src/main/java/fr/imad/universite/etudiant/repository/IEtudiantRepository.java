package fr.imad.universite.etudiant.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.imad.universite.etudiant.domaine.Etudiant;

@Repository
public interface IEtudiantRepository {

	List<Etudiant> findAll();

	Etudiant getOne(Integer id);

	void save(Etudiant etudiant);

	void save(Etudiant etudiant, Integer id);

	void deleteById(Integer id);

}
