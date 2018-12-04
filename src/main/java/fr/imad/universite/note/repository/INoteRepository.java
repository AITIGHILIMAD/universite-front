package fr.imad.universite.note.repository;

import java.util.List;

import fr.imad.universite.note.domaine.Note;
import fr.imad.universite.note.domaine.NotePK;

public interface INoteRepository {

	List<Note> findAll();

	Note getOne(NotePK pk);

}
