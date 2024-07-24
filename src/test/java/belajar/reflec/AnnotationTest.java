package belajar.reflec;

import belajar.reflec.data.Person;
import belajar.reflec.data.Person2;
import belajar.reflec.validation.Validator;
import org.junit.jupiter.api.Test;

public class AnnotationTest {

    /** Annotation
     * Pada Kelas Java OOP kita sudah bahas tentang Annotation
     * Sekarang kita bahas tentang mendapatkan informasi Annotation dengan menggunakan Reflection
     * Annotation merupakan fitur yang sangat powerfull sekali di Java, banyak sekali framework menggunakan Annotation
     * Annotation bisa ditempatkan dimanapun, di class, method, field, constructor, parameter, package dan lain-lain
     * Setiap kita membuat Annotation, secara tidak langsung kita telah membuat turunan java.lang.annotation.Annotation

     * ANNOTATION ERAT KAITANNYA DENGAN REFLECTION DENGAN ANNOTATION KITA DAPAT MELAKUKAN SESUATU LALU DIBACA MENGGUNAKAN REFLECTION
     * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html
     * @throws IllegalAccessException
     */

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {

        /**
         * pada class Person2 kita meletakan annotation pada field firstName dan lastName
         * dimana untuk lastName kita mengubah method yang ada di annotation menjadi True sehingga boleh jika dan hanya jika menggunakan string space kosong
         * sedangkan di field firstName tidak boleh bernilai string kosong ataupun null
         */
        Person2 person2 = new Person2("Fajar Abdillah"," Ahmad ");


        //mengakses Class Static milik Validator, lalu memanggil method validateNotBlank
        Validator.validateNotBlank(person2);
        System.out.println("Name : "+person2.getFirstName()+person2.getLastName());

    }
}
