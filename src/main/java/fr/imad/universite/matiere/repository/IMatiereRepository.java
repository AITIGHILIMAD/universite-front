package fr.imad.universite.matiere.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.imad.universite.matiere.domaine.Matiere;

@Repository
public interface IMatiereRepository {

	List<Matiere> findAll();

	Matiere getOne(Integer id);

	void save(Matiere matiere);

	void deleteById(Integer id);

	void save(Matiere matiere, Integer id);

}
