package belajar.reflec;

import belajar.reflec.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {

    /**Parameter
     * Parameter merupakan representasi dari Java Parameter di Java Method
     * Cara mendapatkan Parameter, kita bisa ambil dari Method, karena Parameter memang hanya ada di Method dan Constructor (yang akan kita bahas nanti)
     * Parameter memiliki banyak sekali method, seperti untuk mendapatkan tipe data parameter, nama parameter, dan lain-lain
     * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Parameter.html
     */

    @Test
    void testParameter() {

        Class<Person> personClass = Person.class;
        Method[] getMethod = personClass.getDeclaredMethods();
        for (Method getParam : getMethod){
            System.out.println(getParam.getName());
            Parameter[] parameters = getParam.getParameters();
            for (Parameter getParameters : parameters){
                System.out.println("Parameter Type : "+getParameters.getType());
                System.out.println("Parameter Name : "+getParameters.getName());
            }
            System.out.println("================");
        }

    }


    /**Memanggil Method Object dengan Parameter
     * Sama seperti Method tanpa parameter
     * Kita juga bisa memanggil Method yang memiliki parameter
     */

    @Test
    void testModifyMethodWithParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        Method setMethod = personClass.getDeclaredMethod("setName", String.class);//dia akan otomatis menambahkan parameter kedua untuk menghindari method overloading

        Person person1 = new Person("Messi",43);
        setMethod.invoke(person1, "Ronaldo");//karna bentuknya void kita tidak perlu menampung dalam type data lain, bisa langsung dipanggil objectnya
        System.out.println(person1.getName());


    }
}
