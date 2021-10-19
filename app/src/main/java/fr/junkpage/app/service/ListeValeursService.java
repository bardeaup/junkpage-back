package fr.junkpage.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.junkpage.app.dto.ListeValeursDto;
import fr.junkpage.app.dto.ValeurDto;
import fr.junkpage.app.model.ListeValeurs;
import fr.junkpage.app.repository.ListeValeursRepository;

@Service
public class ListeValeursService {
	
	@Autowired 
	ListeValeursRepository listeValeursRepository;
	
	public ListeValeursDto getListeValeurs(String code){
		List<ListeValeurs> listeValeurs = listeValeursRepository.findByCodeListeValeurs(code);
		ListeValeursDto listeValeursFinaleDto = new ListeValeursDto();
		if(!listeValeurs.isEmpty()) {
			listeValeursFinaleDto.setCodeListeValeurs(listeValeurs.get(0).getCodeListeValeurs());
			listeValeursFinaleDto.setLibelleListeValeurs(listeValeurs.get(0).getLibelleListeValeurs());
			List<ValeurDto> valeurDtos = new ArrayList<>();
			for(ListeValeurs valeur: listeValeurs) {
				valeurDtos.add(new ValeurDto(valeur.getCodeValeur(), valeur.getLibelleValeur()));
			}
			listeValeursFinaleDto.setListeValeurs(valeurDtos);
		}
		return listeValeursFinaleDto;
	}
}
