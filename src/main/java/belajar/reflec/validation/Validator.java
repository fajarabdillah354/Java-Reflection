package belajar.reflec.validation;

import belajar.reflec.annotation.NotBlank;
import belajar.reflec.data.Person;
import belajar.reflec.data.Person2;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object object) throws IllegalAccessException {
        //get Class
        Class<Person2> person = Person2.class;

        //get Field
        Field[] personField = person.getDeclaredFields();

        //iterad each field
        for (Field field : personField) {


            //get notBlank @nnotation
            field.setAccessible(true);
            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            //check if @NotBlank is exists
            if (notBlank != null){

                //get Value
                String value = (String) field.get(object);

                if (notBlank.allowEmptyString()){
                    //ignore
                    //allow empty string
                }else {
                    value = value.trim();
                }

                //check if value is empty string
                if ("".equals(value)){
                    //throw error
                    throw new RuntimeException(field.getName()+ " must not blank " );
                }

            }
            
        }



    }


}
