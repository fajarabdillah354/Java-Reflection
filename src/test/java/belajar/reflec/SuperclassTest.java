package belajar.reflec;

import belajar.reflec.data.Person;
import org.junit.jupiter.api.Test;

public class SuperclassTest {


    @Test
    void testGetSuperClass() {

        Class<Person> personClass = Person.class;
        Class<? super Person> superClass1 = personClass.getSuperclass();
        System.out.println(superClass1);//class Object

        Class<? super Person> superClass2 = superClass1.getSuperclass();//memanggil superClass dari superClass object
        System.out.println(superClass2);//Null karna super class tertinggi di java adalah object, ketika kita memanggil super class diatasnya object maka nilainya Null

    }
}
