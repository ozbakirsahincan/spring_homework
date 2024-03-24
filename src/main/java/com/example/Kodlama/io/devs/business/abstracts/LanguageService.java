package com.example.Kodlama.io.devs.business.abstracts;
import java.util.List;

import com.example.Kodlama.io.devs.entities.concretes.ProgramingLanguage;

public interface LanguageService {
    List<ProgramingLanguage> getAll();
    // TODO : getById Methodu eklenecek
    // TODO : deleteById Methodu eklenecek
}

