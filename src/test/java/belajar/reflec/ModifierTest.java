package belajar.reflec;

import belajar.reflec.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

public class ModifierTest {

    /**
     *
     */

    @Test
    void testModifier() {
        Class<Person> personClass = Person.class;

        //Jadi kita dapat mengecek setiap modifier yang ada pada suatu class
        System.out.println(Modifier.isPublic(personClass.getModifiers()));
        System.out.println(Modifier.isAbstract(personClass.getModifiers()));
        System.out.println(Modifier.isFinal(personClass.getModifiers()));
        System.out.println(Modifier.isStatic(personClass.getModifiers()));

    }
}
