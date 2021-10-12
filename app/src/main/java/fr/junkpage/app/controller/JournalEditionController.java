package fr.junkpage.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.junkpage.app.dto.JournalEditionDto;
import fr.junkpage.app.service.JournalEditorSevice;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/api/journal-edit/")
public class JournalEditionController {

	@Autowired
	JournalEditorSevice journalEditorService;

	@PostMapping(path = "edition", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public JournalEditionDto postJournalEdition(@RequestBody JournalEditionDto journalEditionDto) {
		return journalEditorService.saveJournalEdition(journalEditionDto);
	}

}
