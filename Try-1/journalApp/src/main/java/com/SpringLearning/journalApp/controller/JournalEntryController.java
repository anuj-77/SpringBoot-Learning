package com.SpringLearning.journalApp.controller;

import com.SpringLearning.journalApp.entity.JournalEntry;
import com.SpringLearning.journalApp.services.JournalEntryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryServices journalEntryServices;

    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping()
    public Boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalEntryServices.saveEntry(myEntry);
        return true;
    }


    @GetMapping("id/{myID}")
    public JournalEntry getJournalEntryByID(@RequestParam Long myID) {
        return null;
    }

    @DeleteMapping("id/{myID}") // Ask sir why with every id it showing the same result.
    public JournalEntry deleteJournalEntryByID(@PathVariable Long myID) {
        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntryByID(@PathVariable Long id, @RequestBody JournalEntry myEntry) {
        return null;

    }


}
