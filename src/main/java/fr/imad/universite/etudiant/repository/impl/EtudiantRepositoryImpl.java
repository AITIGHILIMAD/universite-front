package fr.imad.universite.etudiant.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.imad.universite.etudiant.domaine.Etudiant;
import fr.imad.universite.etudiant.repository.IEtudiantRepository;

@Repository
public class EtudiantRepositoryImpl implements IEtudiantRepository {
	private static final String URL = "http://localhost:8080/etudiants/";

	@Override
	public List<Etudiant> findAll() {
		RestTemplate restTemplate = new RestTemplate();
		List<Etudiant> liste = restTemplate
				.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Etudiant>>() {
				}).getBody();
		return liste;
	}

	@Override
	public Etudiant getOne(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		Etudiant etudiant = restTemplate.getForObject(URL + id, Etudiant.class);
		return etudiant;
	}

	@Override
	public void save(Etudiant etudiant) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(URL, etudiant, Etudiant.class);

	}

	@Override
	public void deleteById(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(URL + id);

	}

	@Override
	public void save(Etudiant etudiant, Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(URL, etudiant, id);
	}

}
