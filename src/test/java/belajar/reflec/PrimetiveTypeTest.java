package belajar.reflec;

import belajar.reflec.data.Person2;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimetiveTypeTest {
    /**Primitive Type
     * Apa yang terjadi jika kita memiliki field atau parameter atau method yang mengembalikan nilai primitive type? Seperti int, long, boolean, dan lain-lain
     * Data tersebut pun, pada Java Reflection tetap direpresentasikan dalam Class<T>
     * Untuk membuat Class<T> primitive, kita langsung gunakan .class setelah tipe data primitive tersebut, namun Java akan secara otomatis mengkonversi nya menjadi tipe data non primitive, misal int menjadi Integer, boolean menjadi Boolean, dan lain-lain
     * Namun yang membedakan adalah, method isPrimitive() akan bernilai true untuk tipe data primitive
     */


    @Test
    void testClasses() {


        Class<Integer> integerClass = int.class;
        Class<Long> longClass = long.class;
        Class<Boolean> booleanClass = boolean.class;

        //karna di classnya kita make int.class maka ini akan menghasilkan primitive jika diubah menjadi Integer.class maka akan menjadi nonPrimitive
        System.out.println(integerClass.isPrimitive());
        System.out.println(longClass.isPrimitive());
        System.out.println(booleanClass.isPrimitive());


    }

    /** Mengambil Data Primitive Type
     * Khusus tipe data primitive, ketika ingin mengambil data di Field, kita bisa gunakan method getXxx() sesuai dengan tipe data nya, misal getInt(), getBoolean() dan lain-lain
     * Namun ketika mengambil method dengan parameter, kita bisa gunakan representasi tipe data object nya, misal untuk int gunakan Integer, long gunakan Long, dan lain-lain
     * @throws NoSuchFieldException
     */

    @Test
    void testGetField() throws NoSuchFieldException {
        Class<Person2> person2Class = Person2.class;

        Field age = person2Class.getDeclaredField("age");
        System.out.println(age.getType().isPrimitive());//tru karna primitive

    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person2> person2Class = Person2.class;

        Field age = person2Class.getDeclaredField("age");
        System.out.println(age.getType().isPrimitive());//tru karna primitive

        age.setAccessible(true);

        Person2 person2 = new Person2("fajar","abdillah");
        person2.setAge(23);

        System.out.println(age.getInt(person2));

    }


    @Test
    void testInvokeMethod() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person2> person2Class = Person2.class;

        Method method = person2Class.getDeclaredMethod("setAge", int.class);//mengubah nilai method dengan getDeclaredMethod()
        Person2 person2 = new Person2();
        method.invoke(person2,24);//untuk mengubahnya menggunakan method invoke(object?, value)
        System.out.println(person2);


    }


}
