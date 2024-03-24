package com.example.Kodlama.io.devs.dataAccess.abstracts;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.Kodlama.io.devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageRepository {
    List<ProgramingLanguage> getAll();
}
