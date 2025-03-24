package com.springLearningDeep.journalEntry.repository;

import com.springLearningDeep.journalEntry.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface JournalEntryRepository extends JpaRepository<JournalEntry, Long> {
}
