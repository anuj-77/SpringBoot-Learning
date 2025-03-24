package com.SpringLearning.journalApp.services;

import com.SpringLearning.journalApp.entity.JournalEntry;
import com.SpringLearning.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryServices {

    @Autowired
    public JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry)
    {
        System.out.println("Before save ");
        journalEntryRepository.save(journalEntry);
        System.out.println("After save");
    }


}
