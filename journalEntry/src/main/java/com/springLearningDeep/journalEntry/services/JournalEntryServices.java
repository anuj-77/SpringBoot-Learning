package com.springLearningDeep.journalEntry.services;

import com.springLearningDeep.journalEntry.entity.JournalEntry;
import com.springLearningDeep.journalEntry.repository.JournalEntryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import java.util.List;
import java.util.Optional;

import static org.springframework.transaction.annotation.Isolation.REPEATABLE_READ;

@Transactional

@Service
public class JournalEntryServices {

    @Autowired
    public JournalEntryRepository journalEntryRepository;

    @Transactional
    public void saveEntry (JournalEntry journalEntry) throws InterruptedException {
        System.out.println("I am here");
        journalEntryRepository.save(journalEntry);
        Thread.sleep(1000);
    }

    @Transactional(isolation = REPEATABLE_READ)
    public Optional<JournalEntry> getEntryByID(Long id){


       return journalEntryRepository.findById(id);
    }

    @Transactional
    public List<JournalEntry> getAllEntry(){
        return journalEntryRepository.findAll();
    }

    @Transactional
    public void deleteEntryByID(Long id){
        journalEntryRepository.deleteById(id);
    }

    @Transactional()
    public void updateEntry (JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }



}
