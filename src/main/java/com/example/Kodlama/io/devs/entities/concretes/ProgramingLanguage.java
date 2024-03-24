package com.example.Kodlama.io.devs.entities.concretes;

public class ProgramingLanguage {

    private int id;
    private String name;

    // Empty Constructor
    public ProgramingLanguage() {
    }

    // Parameter Constructor
    public ProgramingLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }

//Getter And Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
