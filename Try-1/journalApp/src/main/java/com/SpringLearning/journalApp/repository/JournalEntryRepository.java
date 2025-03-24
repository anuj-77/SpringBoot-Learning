package com.SpringLearning.journalApp.repository;

import com.SpringLearning.journalApp.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface JournalEntryRepository extends JpaRepository<JournalEntry, Long> {
}
