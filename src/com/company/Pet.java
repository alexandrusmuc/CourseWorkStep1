package com.company;

import java.util.LinkedList;

public class Pet implements Comparable{
    private String petType;


    public Pet(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }

    @Override
    public int compareTo(Object o) {
        return this.getPetType().compareToIgnoreCase(((Pet)o).getPetType());
    }



    @Override
    public String toString() {
        return "Pet type: " + this.petType + "\n";
    }


}
