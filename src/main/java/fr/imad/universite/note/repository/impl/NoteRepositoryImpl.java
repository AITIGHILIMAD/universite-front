package fr.imad.universite.note.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.imad.universite.note.domaine.Note;
import fr.imad.universite.note.domaine.NotePK;
import fr.imad.universite.note.repository.INoteRepository;

@Repository
public class NoteRepositoryImpl implements INoteRepository {
	private static final String URL = "http://localhost:8080/notes/";

	@Override
	public List<Note> findAll() {
		RestTemplate restTemplate = new RestTemplate();
		List<Note> liste = restTemplate
				.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Note>>() {
				}).getBody();
		return liste;
	}

	@Override
	public Note getOne(NotePK pk) {
		RestTemplate restTemplate = new RestTemplate();
		Note note = restTemplate.getForObject(URL + pk, Note.class);
		return note;
	}

}
