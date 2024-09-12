package _2024_09_04.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Dev {
    public static void main(String[] args) throws NoSuchMethodException {
        Person person = new Person("kkk",1,true,2.2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Object created: " + person);
        System.out.print("Enter the name of the field or method: ");
        String userInput = scanner.nextLine();
        try {
            Method method = person.getClass().getMethod(userInput);
            method.invoke(person);
        } catch (NoSuchMethodException e) {


            try {
                Field field = person.getClass().getDeclaredField(userInput);
                field.setAccessible(true);
                System.out.println("set field name");
                String value = scanner.nextLine();
                if (field.getType() == String.class) {
                    field.set(person, value);
                } else if (field.getType() == int.class) {
                    field.set(person, Integer.parseInt(value));
                } else if (field.getType() == boolean.class) {
                    field.set(person, Boolean.parseBoolean(value));
                } else if (field.getType() == double.class) {
                    field.set(person, Double.parseDouble(value));
                }
                System.out.println("znaceniye = " + field.get(person));
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                System.out.println("no method or field");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
