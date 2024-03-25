package com.example.Kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kodlama.io.devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.devs.entities.concretes.ProgramingLanguage;


@RestController
@RequestMapping(value = "/api/languages")
public class ProgramingLanguageController {

    private LanguageService languageService;

    public ProgramingLanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAllLanguages")
    public List<ProgramingLanguage> getLanguages() {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public ProgramingLanguage getLanguageWithId(@PathVariable("id") int id) {
        return languageService.getById(id);
        
    }

    
}
