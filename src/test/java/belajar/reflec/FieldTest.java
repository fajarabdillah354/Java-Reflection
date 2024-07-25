package belajar.reflec;

import belajar.reflec.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {


    @Test
    void testCreateField() {
        Class<Person> personClass = Person.class;
        Field[] field = personClass.getDeclaredFields();

        for (Field getField : field){
            System.out.println(getField.getName() + " : " +getField.getType().getName());
        }

    }

    @Test
    void testFieldValue() throws NoSuchFieldException, IllegalAccessException {

        /**
         * ketika kita mencoba ngambil value field pada suatu object pastikan dia mempunyai valuenya
         */


        Class<Person> personClass = Person.class;
        Field fieldName = personClass.getDeclaredField("name");
        fieldName.setAccessible(true);//mendapatkan access untuk masuk ke field yang private pada class Person

        Person person1 = new Person("fajar abdillah",23);
//        System.out.println(person1.getName());// ini jika tidak menggunakan reflection


        Object object = fieldName.get(person1);//
        System.out.println(object);// kita perlu mengatur access modifier yang ada di class Person menjadi True karna sifat bawaannya private

        Person person2 = new Person("budi",30);
        Object object2 = fieldName.get(person2);
        System.out.println(object2);

    }


    @Test
    void testMofidifyField() throws NoSuchFieldException, IllegalAccessException {
        /**
         * hati2 ketika kita salah memasukan type data pada value yang ada kita ubah, akan menyebabkan error
         */
        Class<Person> personClass = Person.class;
        Field fieldUmur = personClass.getDeclaredField("umur");//untuk mendapatkan field kalo mendapatkan method getDeclaredMethods(name)
        fieldUmur.setAccessible(true);


        Person person1 = new Person("fajar ",20);
        fieldUmur.set(person1, 29);//sama seperti person1.setUmur()
        System.out.println(person1.getUmur());

        Person person2 = new Person("ujeh",10);
        fieldUmur.set(person2, 15);//karna void kita tidak perlu nangkep nilai returnyya
        System.out.println(person2.getUmur());


    }
}
