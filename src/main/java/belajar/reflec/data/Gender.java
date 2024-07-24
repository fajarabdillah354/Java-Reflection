package belajar.reflec.data;

import javax.print.DocFlavor;

public enum Gender {

    Male("Male"),
    Female("Female");

    final private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
