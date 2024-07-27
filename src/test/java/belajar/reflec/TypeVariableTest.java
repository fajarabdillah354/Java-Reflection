package belajar.reflec;

import belajar.reflec.data.Data;
import org.junit.jupiter.api.Test;

import java.lang.reflect.TypeVariable;
import java.sql.SQLOutput;
import java.util.Arrays;

public class TypeVariableTest {


    @Test
    void testTypeVar() {

        Class<Data> dataClass = Data.class;
        TypeVariable<Class<Data>>[] typeParameters = dataClass.getTypeParameters();

        for (TypeVariable<Class<Data>> parameter : typeParameters) {
            System.out.println(parameter.getName());
            System.out.println(Arrays.toString(parameter.getAnnotatedBounds()));
            System.out.println(parameter.getGenericDeclaration());//akan mengembalikan class yang bersifat generic


        }

    }
}
