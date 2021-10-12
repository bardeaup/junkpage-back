package fr.junkpage.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import fr.junkpage.app.dto.JournalEditionDto;
import fr.junkpage.app.model.JournalEdition;
import fr.junkpage.app.repository.JournalEditionRepository;

@Service
public class JournalService {
	
	@Autowired
	JournalEditionRepository journalEditionRepository;
	
	public List<JournalEditionDto> getJournalEditionList() {
		List<JournalEdition> journalEditionList = this.journalEditionRepository.findAll(Sort.by(Sort.Direction.DESC, "dateEdition"));
		List<JournalEditionDto> journalEditionDtoList = null;
		if (!journalEditionList.isEmpty()) {
			journalEditionDtoList = new ArrayList<JournalEditionDto>();
			for (JournalEdition journalEdition : journalEditionList) {
				journalEditionDtoList.add(new JournalEditionDto(journalEdition.getId(), journalEdition.getTitre(), 
						journalEdition.getAnnee(), journalEdition.getMois(), journalEdition.getRefJournalEdition(), 
						journalEdition.getDateEdition(), journalEdition.getDateDebutPublication(), 
						journalEdition.getDateFinPublication()));
			}
		}
		return journalEditionDtoList;
		
	}

	public JournalEditionDto getJournalEditionById(String id) {
		JournalEdition journalEdition = this.journalEditionRepository.findById(Long.valueOf(id)).get();
		return new JournalEditionDto(journalEdition.getId(), journalEdition.getTitre(), 
				journalEdition.getAnnee(), journalEdition.getMois(), journalEdition.getRefJournalEdition(), 
				journalEdition.getDateEdition(), journalEdition.getDateDebutPublication(), 
				journalEdition.getDateFinPublication());
	}
}
