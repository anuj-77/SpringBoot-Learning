package com.springLearningDeep.journalEntry.controller;

import com.springLearningDeep.journalEntry.entity.JournalEntry;
import com.springLearningDeep.journalEntry.services.JournalEntryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryServices journalEntryServices;

    @PostMapping()
    public Boolean createEntry (@RequestBody JournalEntry myEntry){
        journalEntryServices.saveEntry(myEntry);
        return true;
    }
    @GetMapping()
    public List<JournalEntry> getAllEntry( ){
        return journalEntryServices.getAllEntry();
    }


    @GetMapping("/fetch") //localhost:8080/journal/get?id=3
    public Optional<JournalEntry> getEntryByID (@RequestParam Long id){
        journalEntryServices.getEntryByID(id);

        return journalEntryServices.getEntryByID(id);
    }

    @DeleteMapping("/remove/{id}")
    public Boolean deleteEntryByID( @PathVariable Long id,@RequestBody JournalEntry myEntry){
        journalEntryServices.deleteEntryByID(id);
        return true;
    }

    @PutMapping("")
    public Boolean updateEntry(@RequestBody JournalEntry myEntry){
        journalEntryServices.updateEntry(myEntry);
        return true;
    }


}
