package belajar.reflec;

import belajar.reflec.data.Person2;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {


    @Test
    void testIsArray() {
        Class<String[]> arrayString = String[].class;
        Class<Integer[]> arrayInteger = Integer[].class;
        Class<Person2> person2Class = Person2.class;

        System.out.println(arrayString.isArray());//TRUE
        System.out.println(arrayInteger.isArray());//TRUE
        System.out.println(person2Class.isArray());//FALSE
        System.out.println(arrayInteger.getComponentType());//mengetahui type arraynya


    }


    /**
     *
     */

    @Test
    void testArrayMember() {
        //Khusus array tidak mempunyai constructor,metthod,field

        Class<String[]> arrayString = String[].class;
        Class<Integer[]> arrayInteger = Integer[].class;
        Class<Person2> person2Class = Person2.class;

        System.out.println(Arrays.toString(arrayString.getDeclaredMethods()));//TRUE
        System.out.println(Arrays.toString(arrayInteger.getDeclaredFields()));//TRUE
        System.out.println(Arrays.toString(person2Class.getDeclaredConstructors()));//FALSE

    }



    @Test
    void testArrayManipulation() {
        //Khusus array tidak mempunyai constructor,metthod,field

        Class<String[]> arrayString = String[].class;


        System.out.println(Arrays.toString(arrayString.getDeclaredMethods()));//TRUE
        String[] array = (String[]) Array.newInstance(arrayString.getComponentType(), 10);
        System.out.println(Arrays.toString(array));


        Array.set(array, 0, "fajar");
        Array.set(array, 1, "abdillah");
        Array.set(array, 2, "ahmad");

        System.out.println(Array.get(array,0));
//        Array.get(array,0);

    }

}
