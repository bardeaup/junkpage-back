package fr.junkpage.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.junkpage.app.dto.ListeValeursDto;
import fr.junkpage.app.service.ListeValeursService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/api/liste-valeurs/")
public class ListeValeursController {
	
	@Autowired
	ListeValeursService listeValeursService;
	
	@GetMapping("{code}")
	public ListeValeursDto getListeValeurs(@PathVariable String code) {
		return this.listeValeursService.getListeValeurs(code);
	}
}
