package belajar.reflec;

import belajar.reflec.data.Product;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;

public class RecordTest {

    @Test
    void testRecord() {
        //kita tetap menggunakan Class<> untuk membuat Reflection
        Class<Product> productClass = Product.class;

        System.out.println(productClass.isRecord());//mengecek apakah record
        System.out.println(Arrays.toString(productClass.getDeclaredFields()));
        System.out.println(Arrays.toString(productClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(productClass.getRecordComponents()));
    }


    @Test
    void testGetRecordValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //Ini untuk mendapatkan record dengan menggunakan value
        Product product = new Product("CS-001", "Service Laptop", 20_000_000L);

        Class<Product> productClass = Product.class;

        Method id = productClass.getDeclaredMethod("id");//menggunakan value dari variabel id

        System.out.println(id.invoke(product));

    }


    @Test
    void testGetRecordValueByComponent() throws InvocationTargetException, IllegalAccessException {

        /**
         * INI adalah cara untuk mendapatkan value dengan menggunakan Component
         */
        Class<Product> productClass = Product.class;

        RecordComponent[] recordComponents = productClass.getRecordComponents();

        Product product = new Product("CS-001", "Service Laptop", 20_000_000L);
        for (RecordComponent component : recordComponents) {
            Method method = component.getAccessor();
            System.out.println(method.getName());//akan mengambil name variblenya
            System.out.println(method.invoke(product));//akan mengambil value dari Record Classnya disini contohnya class Record Product
        }

    }
}
