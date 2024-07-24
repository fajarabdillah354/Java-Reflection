package belajar.reflec.data;

import belajar.reflec.annotation.NotBlank;
import belajar.reflec.data.Nameable;

import java.io.Serializable;

public final class Person implements  Serializable {


    @NotBlank(allowEmptyString = true)
    private String name;// untuk nilai dari field ini tidak boleh kosong
    @NotBlank
    private Integer umur;//untuk nilai dari field ini boleh String kosong

    public Person(String name, Integer umur) {
        this.name = name;
        this.umur = umur;
    }

    public Person() {
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", umur=" + umur +
                '}';
    }



}
