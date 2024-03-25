package com.example.Kodlama.io.devs.dataAccess.abstracts;
import java.util.List;


import com.example.Kodlama.io.devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageRepository {
    List<ProgramingLanguage> getAll();

    void delete(int id);

    void add(ProgramingLanguage programingLanguage);

    void update(ProgramingLanguage oldLanguage , ProgramingLanguage newLanguage);
}
