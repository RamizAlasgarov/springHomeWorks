package _2024_09_15;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Reader {


    String configFilePath = "C:\\repos\\springHomeWorks\\src\\main\\resources\\app.properties";
    private List<Tasks> tasks = new ArrayList<>();


    public void readInfo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(configFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("outputTasks.txt"))) {

            String line;
            Map<String, String> taskMap = new HashMap<>();

            while ((line = reader.readLine()) != null) {

                parseTask(line, taskMap);

                if (taskMap.containsKey("size") && taskMap.containsKey("priority")) {
                    Tasks task = createTaskFromMap(taskMap);
                    tasks.add(task);
                    taskMap.clear(); // Очищаем карту для следующей задачи
                }
            }


            for (Tasks task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void parseTask(String line, Map<String, String> taskMap) {
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        String[] parts = line.split("=");
        if (parts.length != 2) {
            System.err.println("Неправильный формат строки: " + line);
            return;
        }

        String key = parts[0].trim();
        String value = parts[1].trim();


        taskMap.put(key, value);
    }

    private Tasks createTaskFromMap(Map<String, String> taskMap) {
        Tasks task = new Tasks();
        task.setSize(Integer.parseInt(taskMap.get("size")));
        task.setPriority(Integer.parseInt(taskMap.get("priority")));
        task.setZogolovok(taskMap.get("zagolovok"));
        task.setOpisaniye(taskMap.get("opisaniye"));
        return task;
    }


    public void printTasks() {
        for (Tasks task : tasks) {
            System.out.println(task);
        }
    }

}
