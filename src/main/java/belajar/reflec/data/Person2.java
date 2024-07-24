package belajar.reflec.data;

import belajar.reflec.annotation.NotBlank;

public class Person2 {

    @NotBlank
    private String firstName;//field ini tidak boleh kosong

    @NotBlank(allowEmptyString = true)
    private String lastName;//field ini boleh kosong namun jika hanya spasi kosong diperbolehkan

    private int age;



    public Person2() {

    }


    public Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
