package com.example.recyclerviewweek18;

public class ContactPojo {
    String name, number;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public ContactPojo(String name, String number) {
        this.name=name;
        this.number=number;
    }
    public Character getProfileLetter(){
        return name.charAt(0);
    }
}
