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


    @Override
    public void delete(int _id) {
        for (ProgramingLanguage language : programingLanguages) {
            if(language.getId() == _id){
                programingLanguages.remove(_id);
            }
        }
        
    }


    @Override
    public void add(ProgramingLanguage programingLanguage) {
        programingLanguages.add(programingLanguage);
    }


    @Override
    public void update(ProgramingLanguage oldLanguage, ProgramingLanguage newLanguage) {
        for (ProgramingLanguage pl : programingLanguages) {
            if(pl.getId() == oldLanguage.getId()){
                pl = newLanguage;
            }
        }
    }

}
