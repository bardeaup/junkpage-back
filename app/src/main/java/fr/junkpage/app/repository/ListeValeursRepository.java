package fr.junkpage.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.junkpage.app.model.ListeValeurs;

public interface ListeValeursRepository  extends JpaRepository<ListeValeurs, Long> {

	List<ListeValeurs> findByCodeListeValeurs(String code);

}
