package fr.imad.universite.matiere.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.imad.universite.matiere.domaine.Matiere;
import fr.imad.universite.matiere.repository.IMatiereRepository;

@Repository
public class MatiereRepositoryImpl implements IMatiereRepository {
	private static final String URL = "http://localhost:8080/matieres/";

	@Override
	public List<Matiere> findAll() {
		RestTemplate restTemplate = new RestTemplate();
		List<Matiere> liste = restTemplate
				.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Matiere>>() {
				}).getBody();
		return liste;
	}

	@Override
	public Matiere getOne(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		Matiere matiere = restTemplate.getForObject(URL + id, Matiere.class);
		return matiere;
	}

	@Override
	public void save(Matiere matiere) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(URL, matiere, Matiere.class);
	}

	@Override
	public void deleteById(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:8080/matieres/" + id);

	}

	@Override
	public void save(Matiere matiere, Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(URL, matiere, id);

	}

}
