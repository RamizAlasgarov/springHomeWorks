package _2024_09_04.task2;

import _2024_09_04.task1.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;

public class Dev {
    public static void main(String[] args) {
        Person person = new Person("kkk", 22, true, 3.14);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(Path.of("person.json").toFile(), person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
