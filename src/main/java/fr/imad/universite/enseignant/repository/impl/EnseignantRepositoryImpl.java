package fr.imad.universite.enseignant.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.imad.universite.enseignant.domaine.Enseignant;
import fr.imad.universite.enseignant.repository.IEnseignantRepository;

@Repository
public class EnseignantRepositoryImpl implements IEnseignantRepository {
	private static final String URL = "http://localhost:8080/enseignants/";

	@Override
	public List<Enseignant> findAll() {
		RestTemplate restTemplate = new RestTemplate();
		List<Enseignant> liste = restTemplate
				.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Enseignant>>() {
				}).getBody();
		return liste;

	}

	@Override
	public Enseignant getOne(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		Enseignant enseignant = restTemplate.getForObject(URL + id, Enseignant.class);
		return enseignant;
	}

	@Override
	public void save(Enseignant enseignant) {
		RestTemplate restTemplate = new RestTemplate();
		Enseignant e = restTemplate.postForObject(URL, enseignant, Enseignant.class);

	}

	@Override
	public void deleteById(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:8080/enseignants/" + id);
	}

	@Override
	public void save(Enseignant enseignant, Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(URL, enseignant, id);

	}

}
