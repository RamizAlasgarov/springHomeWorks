package _2024_09_15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("taskBean")
@Scope("prototype")
@PropertySource("app.properties")
public class Tasks {

    private int size;
    private int priority;
    private String zogolovok;
    private String opisaniye;


    public Tasks() {}

    @Autowired
    public Tasks(@Value("${task1.size}") int size,
                 @Value("${task1.priority}") int priority,
                 @Value("${task1.zagolovok}") String zogolovok,
                 @Value("${task1.opisaniye}") String opisaniye) {
        this.size = size;
        this.priority = priority;
        this.zogolovok = zogolovok;
        this.opisaniye = opisaniye;
    }

    // Сеттеры
    public void setSize(int size) {
        this.size = size;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setZogolovok(String zogolovok) {
        this.zogolovok = zogolovok;
    }

    public void setOpisaniye(String opisaniye) {
        this.opisaniye = opisaniye;
    }


    public void printInfo() {
        System.out.println("Size: " + size);
        System.out.println("Priority: " + priority);
        System.out.println("Zogolovok: " + zogolovok);
        System.out.println("Opisaniye: " + opisaniye);
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "size=" + size +
                ", priority=" + priority +
                ", zogolovok='" + zogolovok + '\'' +
                ", opisaniye='" + opisaniye + '\'' +
                '}';
    }

    /**
     * 1.1 Напишите простое приложение для управления задачами (To-DoList). Создайте бины Задач, Список задач и т.д.
     *  *  * Размер списка задач, их приоритеты, заголовок и описание по умолчанию должны быть взяты из файла настроек.
     */
}
