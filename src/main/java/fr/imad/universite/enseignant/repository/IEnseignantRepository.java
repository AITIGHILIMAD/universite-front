package fr.imad.universite.enseignant.repository;

import java.util.List;

import fr.imad.universite.enseignant.domaine.Enseignant;

public interface IEnseignantRepository {

	List<Enseignant> findAll();

	Enseignant getOne(Integer id);

	void save(Enseignant enseignant);

	void deleteById(Integer id);

	void save(Enseignant enseignant, Integer id);

}
