package com.springLearningDeep.journalEntry.services;

import com.springLearningDeep.journalEntry.entity.JournalEntry;
import com.springLearningDeep.journalEntry.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryServices {

    @Autowired
    public JournalEntryRepository journalEntryRepository;

    public void saveEntry (JournalEntry journalEntry){

        journalEntryRepository.save(journalEntry);
    }

    public Optional<JournalEntry> getEntryByID(Long id){
       return journalEntryRepository.findById(id);
    }

    public List<JournalEntry> getAllEntry(){
        return journalEntryRepository.findAll();
    }

    public void deleteEntryByID(Long id){
        journalEntryRepository.deleteById(id);
    }

    public void updateEntry (JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }
}
