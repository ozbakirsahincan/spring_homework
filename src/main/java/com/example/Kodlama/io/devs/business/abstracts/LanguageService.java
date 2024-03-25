package com.example.Kodlama.io.devs.business.abstracts;
import java.util.List;

import com.example.Kodlama.io.devs.entities.concretes.ProgramingLanguage;

public interface LanguageService {
    List<ProgramingLanguage> getAll();
    
    ProgramingLanguage getById(int id);
    
    void delete(int id);

    void add(ProgramingLanguage programingLanguage);

    void update(ProgramingLanguage oldLanguage , ProgramingLanguage newLanguage);
}

