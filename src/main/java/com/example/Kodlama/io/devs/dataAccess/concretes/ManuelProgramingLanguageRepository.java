package com.example.Kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import com.example.Kodlama.io.devs.entities.concretes.ProgramingLanguage;

@Repository
public class ManuelProgramingLanguageRepository implements ProgramingLanguageRepository {

    List<ProgramingLanguage> programingLanguages;

    public ManuelProgramingLanguageRepository(){
        programingLanguages = new ArrayList<ProgramingLanguage>();
        programingLanguages.add(new ProgramingLanguage(1,"Java"));
        programingLanguages.add(new ProgramingLanguage(2,"C#"));
        programingLanguages.add(new ProgramingLanguage(3,"Python"));
        programingLanguages.add(new ProgramingLanguage(4,"Javascript"));
    }


    @Override
    public List<ProgramingLanguage> getAll() {
        
        return programingLanguages;
    }

}
