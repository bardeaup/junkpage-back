package fr.junkpage.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RequestMapping("/api/admin/")
@PreAuthorize("hasRole('ROLE_VIEWER')")
public class AdminController {

	@GetMapping("journal")
	public String getJournalArticles() {
		return "Et voilà le travail !!!";
	}
}
