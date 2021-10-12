package fr.junkpage.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.junkpage.app.dto.ImageDto;
import fr.junkpage.app.dto.JournalEditionDto;
import fr.junkpage.app.dto.UserDto;
import fr.junkpage.app.service.JournalService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RequestMapping("/api/journal/")
public class JournalController {
	
	@Autowired
	JournalService journalService;

	@GetMapping("journal-edition-historique")
	public List<JournalEditionDto> getJournalEditions(){
		return this.journalService.getJournalEditionList();
	}
	
	@GetMapping("journal-edition/{id}")
	public JournalEditionDto getJournalEditionById(@PathVariable String id){
		return this.journalService.getJournalEditionById(id);
	}
	
	@GetMapping("articles")
	public UserDto getJournalArticles() {
		return new UserDto("Journal", "Junk", "Page");
	}
	
	@PostMapping("image")
	public ImageDto saveImage() {
		return null;
	}
}
