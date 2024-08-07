## 🔍 Java Reflection Explorer

<p align="center">
  <img src="https://github.com/fajarabdillah354/Java-Reflection/blob/main/src/main/java/belajar/reflec/images/Java_Reflection.jpeg" alt="Java Reflection Explorer Logo" width="100%" height="100%">
</p>

<p align="center">
  <a href="https://github.com/fajarabdillah354/Java-Reflection"><img src="https://img.shields.io/github/stars/fajarabdillah354/Java-Reflection" alt="Stars Badge"/></a>
  <a href="https://github.com/fajarabdillah354/Java-Reflection/tree/main/.idea"><img src="https://img.shields.io/github/forks/fajarabdillah354/Java-Reflection" alt="Forks"/></a>
  <a href="https://github.com/fajarabdillah354/Java-Reflection"><img alt="GitHub contributors" src="https://img.shields.io/github/contributors/fajarabdillah354/Java-Reflection?color=2b9348"></a>
  
</p>

<p align="center">Unlock the power of Java Reflection with this comprehensive toolkit and guide.</p>

## 🌟 Features

- 🔬 In-depth exploration of Java Reflection API
- 🛠️ Utility classes for common reflection tasks
- 📊 Performance benchmarks and optimization tips
- 🎓 Educational examples and use cases
- 🔒 Security considerations and best practices
- 🧪 Extensive test suite demonstrating reflection techniques

## 🚀 Quick Start

### Maven
```xml
<dependency>
    <groupId>org.codemonkey.javareflection</groupId>
    <artifactId>java-reflection</artifactId>
    <version>1.1</version>
</dependency>

```

### Example
```java
@Test
    void testFieldValue() throws NoSuchFieldException, IllegalAccessException {

        /**
         * ketika kita mencoba ngambil value field pada suatu object pastikan dia mempunyai valuenya
         */


        Class<Person> personClass = Person.class;
        Field fieldName = personClass.getDeclaredField("name");
        fieldName.setAccessible(true);//mendapatkan access untuk masuk ke field yang private pada class Person

        Person person1 = new Person("fajar abdillah",23);
//        System.out.println(person1.getName());// ini jika tidak menggunakan reflection


        Object object = fieldName.get(person1);//
        System.out.println(object);// kita perlu mengatur access modifier yang ada di class Person menjadi True karna sifat bawaannya private

        Person person2 = new Person("budi",30);
        Object object2 = fieldName.get(person2);
        System.out.println(object2);

    }

```
