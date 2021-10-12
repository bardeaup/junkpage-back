package fr.junkpage.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.junkpage.app.model.JournalEdition;


@Repository
public interface JournalEditionRepository extends JpaRepository<JournalEdition, Long> {}