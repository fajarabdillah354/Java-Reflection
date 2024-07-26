package belajar.reflec;

import belajar.reflec.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PackageTest {


    /**Package
     * Package merupakan representasi dari Java Package
     * Kita bisa mendapatkan Package dari Class<T> dengan menggunakan method getPackage()
     * Terdapat banyak informasi di dalam Package yang bisa kita gunakan
     */


    /** Package-info.java
     * Package di Java bisa kita tambahkan informasi tambahan
     * Seperti javadoc dan annotation misalnya
     * Caranya kita bisa membuat file package-info.java di package yang kita inginkan
     * Lalu kita tambahkan informasi yang kita mau pada package tersebut
     */


    @Test
    void testPackage() {
        Class<Person> personClass = Person.class;

        Package aPackage = personClass.getPackage();
        System.out.println(aPackage.getName());
        System.out.println(Arrays.toString(aPackage.getAnnotations()));//karna kita sudah menambahkan package-info.java maka method ini akan mengembalikan nilai dari annotatation yang ada pada package-info.java


    }
}
