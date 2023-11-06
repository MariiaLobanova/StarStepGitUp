package scr.MorningSession.Class211.Enums;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }
}


public class Reflection {
    public static void main(String[] args) {
        try{
            Class<?> personClass = Person.class;
            String className = personClass.getName();
            System.out.println("Class Name: " + className);

            Field[]fields = personClass.getDeclaredFields();
            System.out.println("Fields: ");
            for (Field field : fields) {
                String fieldName = field.getName();
                System.out.println("Fields name: "+ fieldName);
            }

            Method[] methods = personClass.getDeclaredMethods();
            System.out.println("Methods: " );
            for(Method method: methods){
                String methodName = method.getName();
                System.out.println(methodName);
            }

            Person person = new Person("Anton", 2, "Pütsdam");
            Method getNameMethod = personClass.getMethod("getName");
            String personName = (String)getNameMethod.invoke(person);
            System.out.println("Persons name: " + personName);


        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}

