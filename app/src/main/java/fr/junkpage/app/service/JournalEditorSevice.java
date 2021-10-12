package fr.junkpage.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import fr.junkpage.app.dto.JournalEditionDto;
import fr.junkpage.app.exception.CustomException;
import fr.junkpage.app.model.JournalEdition;
import fr.junkpage.app.repository.JournalEditionRepository;

@Service
public class JournalEditorSevice {
	
	@Autowired
	JournalEditionRepository journalEditionRepository;
	
	public JournalEditionDto saveJournalEdition(JournalEditionDto journalEditionDto) throws CustomException {
		try {
		journalEditionRepository.save(new JournalEdition(journalEditionDto.getTitre(), journalEditionDto.getAnnee(), 
				journalEditionDto.getMois(), journalEditionDto.getNumeroEdition(), journalEditionDto.getDateEdition(), null, null));
		} catch (DataIntegrityViolationException ex) {
			String errorMsg = null;
			if (ex.getMessage().contains("CONTRAINTEANNEEMOISUNIQUE")) {
				errorMsg = "L'édition " + journalEditionDto.getMois() + " "
						+ journalEditionDto.getAnnee() + " est déjà créée.";
			} else if (ex.getMessage().contains("REF_JOURNAL_EDITION")) {
				errorMsg = "Le numéro d'édition " + journalEditionDto.getNumeroEdition() + " est déjà enregistré.";
			}
			throw new CustomException(errorMsg);
			
		}
		return journalEditionDto;
	}

}
