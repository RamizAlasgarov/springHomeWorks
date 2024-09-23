package _2024_09_15;

import _2024_09_15.configurartion.MyAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * /**
 * * Решите задания, используя Spring и изученные аннотации.
 * * 1.1 Напишите простое приложение для управления задачами (To-DoList). Создайте бины Задач, Список задач и т.д.
 * * Размер списка задач, их приоритеты, заголовок и описание по умолчанию должны быть взяты из файла настроек.
 * <p>
 * * 1.2 Дополните приложение. Приложение должно отправлять уведомления о срочных задачах. Создайте интерфейс
 * * NotificationService, который будет иметь несколько реализаций для отправки уведомлений по электронной почте,
 * * SMS и push. Используйте аннотации @Component, @Qualifier, @Primary и другие для настройки внедрения зависимостей.
 * * 1.3 Приложение должно отправлять данные на сервер. Создайте бин класса Connector, который эмулирует подключение
 * * к серверу. Подключение занимает длительное время, поэтому не должно замедлять запуск программы.
 */
public class Dev {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyAppConfig.class);

//        Tasks tasks = context.getBean("taskBean",Tasks.class);
//        SmsNotif smsNotif = context.getBean("smsNotif",SmsNotif.class);
//        System.out.println(smsNotif);
//        tasks.printInfo();
//        System.out.println(tasks);
        Reader reader = context.getBean(Reader.class);
        reader.printTasks();
    }
}
