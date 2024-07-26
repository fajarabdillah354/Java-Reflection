package belajar.reflec;

import belajar.reflec.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PersonTest {
    /**
     *
     * @throws ClassNotFoundException
     */


    @Test
    void testCreate() throws ClassNotFoundException {

        /**
         * ada beberapa cara untuk membuat reflection
         * Cara yang pertama adalah dengan  menggunakan kata kunci .class setelah nama Java Class, Interface atau Enum nya, misal Person.class, Repository.class, atau Gender.class
         * Atau kita juga bisa membuat Class<T> dari sebuah String, menggunakan static method Class.forClass(“com.example.blabla.Person”)
         * Atau kita juga bisa mengambil Class<T> dari object, dengan menggunakan method getClass()
         *
         */

        Class<Person> personClass1 = Person.class;//ini adalah cara pertama

        Class<?> personClass2 = Class.forName("belajar.reflec.data.Person");//cara ke 2 dengan memasukan string nama package dan nama filenya dalam parameter

        Person person = new Person();
        Class<? extends  Person> personClass3 = person.getClass();// cara ke 3 dengan menggunakan getClass()
    }


    @Test
    void testClassMethod() {
        Class<Person> person = Person.class;

        System.out.println(person.getSuperclass());
        System.out.println(Arrays.toString(person.getMethods()));
        System.out.println(Arrays.toString(person.getClasses()));
        System.out.println(Arrays.toString(person.getDeclaredClasses()));
        System.out.println(Arrays.toString(person.getDeclaredMethods()));
        System.out.println(person.getPackage());
        System.out.println(person.getName());//name+package
        System.out.println(person.getSimpleName());//just name


    }
}
