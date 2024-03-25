package com.example.Kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Kodlama.io.devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import com.example.Kodlama.io.devs.entities.concretes.ProgramingLanguage;

@Service
public class LanguageManager implements LanguageService{

    private ProgramingLanguageRepository programingLanguageRepository;


    @Autowired
    public LanguageManager(ProgramingLanguageRepository programingLanguageRepository){
        this.programingLanguageRepository = programingLanguageRepository;
    }
    @Override
    public List<ProgramingLanguage> getAll() {
        return programingLanguageRepository.getAll();
    }

    
    @Override
    public ProgramingLanguage getById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }
    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    @Override
    public void add(ProgramingLanguage programingLanguage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public void update(ProgramingLanguage oldLanguage, ProgramingLanguage newLanguage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
