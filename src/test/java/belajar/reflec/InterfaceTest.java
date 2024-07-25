package belajar.reflec;

import belajar.reflec.data.Nameable;
import belajar.reflec.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InterfaceTest {
    /** Interface
     * Sebelumnya kita hanya bahas tentang Class, bagaimana dengan Interface?
     * Interface sebenarnya representasi di Java Reflection tetaplah Class<T>
     * Yang membedakan adalah, pada Interface sudah pasti tidak memiliki Constructor dan juga tidak bisa
     * Selain itu untuk mengetahui apakah Class<T> ini adalah Java Class atau Java Interface, kita  bisa menggunakan method isInterface()
     */


    @Test
    void testClass() {

        Class<Nameable> nameableClass = Nameable.class;

        Boolean checkInterface = nameableClass.isInterface();
        System.out.println(checkInterface);//untuk mengecek interface apa bukan
        String result = nameableClass.getName();
        System.out.println(result);
        System.out.println(Arrays.toString(nameableClass.getInterfaces()));
        System.out.println(Arrays.toString(nameableClass.getDeclaredClasses()));
        System.out.println(nameableClass.getPackage());
        System.out.println(Arrays.toString(nameableClass.getConstructors()));
    }

/** Super Interface
 * Kita tahu bahwa Interface juga mendukung pewarisan, berbeda dengan class, saat kita melakukan implements Interface, bisa lebih dari satu interface, selain itu interface juga bisa extends Interface
 * Pada kasus seperti ini, jika kita melihat semua super interface Class<T>, kita bisa menggunakan method getInterfaces()
 *
 */

    @Test
    void testSuperInterfaces() {
        Class<Person> personClass = Person.class;
        System.out.println(Arrays.toString(personClass.getInterfaces()));//kita dapat mengetahui interface suatu class dengan method getInterfaces(), ini bisa multiple interfaces

    }
}
