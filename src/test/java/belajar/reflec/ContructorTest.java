package belajar.reflec;

import belajar.reflec.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ContructorTest {
    /** Constructor<T>
     * Constructor<T> merupakan representasi dari Java Constructor di Java Class
     * Constructor<T> ini mirip dengan Method, dimana dia memiliki Parameter
     * Untuk membuat Constructor kita mendapatkannya melalui Class<T>
     * Constructor<T> merupakan tipe data generic, mengikuti tipe data generic dari Class<T> nya
     * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Constructor.html
     */

    @Test
    void testCreateAndGetDetails() {
        Class<Person> personClass = Person.class;

        Constructor<?>[] getCons = personClass.getDeclaredConstructors();
        for (Constructor<?> cons : getCons){
            System.out.println(cons.getName());
            System.out.println(Arrays.toString(cons.getParameterTypes()));
            System.out.println("==========================");
        }
    }


    /** Membuat Object dengan Constructor
     * Kita sudah tahu bahwa Constructor merupakan method yang dieksekusi ketika sebuah Object pertama kali dibuat
     * Dengan menggunakan Constructor, kita juga bisa membuat object baru
     * Caranya  dengan menggunakan method newInstance(parameter...)
     */


    @Test
    void testCreateNewObject() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Person> personClass = Person.class;

        Constructor<Person> constructor1 = personClass.getConstructor();
        Constructor<Person> constructor2 = personClass.getConstructor(String.class, Integer.class);


        Person person1 = constructor1.newInstance();
        Person person2 = constructor2.newInstance("FAJAR",23);

        System.out.println(person1);
        System.out.println(person2);


    }
}
