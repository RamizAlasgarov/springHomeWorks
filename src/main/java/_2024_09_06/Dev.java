package _2024_09_06;

import _2024_09_06.intefaces.SmsNotificationService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

/**
 * 1.1 Создайте класс Customer с полями id, name, dateOfLastNotification, phone, email, геттрамии сеттерами.
 * В приложении создайте два бина типа Customer(используйте scope Prototype). Получите бины из контекста и
 * установите первому параметры {1L, “Bob”,LocalDate.now(), “+19138445656”, null }, второму {2L, “Sarah”,
 * 2024-16-01, “+19158455617”, ”sarah-sweet@candy.com”}.
 * 1.2 Создайте класс NotificationService, который выполняет оповещение клиентов с помощью метода
 * sendSpam(Customer customer):если с последней отправки прошло больше 30 дней, то он отправляет
 * спам по имеющимся контактам(метод делегирует эту работу классам от которых зависит
 * -SmsNotificationService и EmailNotificationService). Получите NotificationServiceиз контекста и
 * передайте ему бин ы клиентов. SmsNotificationService и EmailNotificationService должны внедряться
 * в NotificationService.
 * 1.3 Создайте класс SmsNotificationServiceImpl, следующий интерфейсу SmsNotificationService,
 * и класс EmailNotificationServiceImpl, следующий интерфейсу EmailNotificationService.
 */
public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext_2024_09_06.xml");

        Customer customer = context.getBean("customer",Customer.class);
        customer.setId(1L);
        customer.setName("Bob");
        customer.setDateOfLastNotification(LocalDate.now());
        customer.setPhone(19138445656L);
        System.out.println(customer);

        Customer customer2 = context.getBean("customer",Customer.class);


        customer2.setId(2L);
        customer2.setName("Sarah");
        customer2.setDateOfLastNotification(LocalDate.of(2024,01,16));
        customer2.setPhone(19158455617L);
        customer2.setEmail("sarah-sweet@candy.com");
        System.out.println(customer2);

        NotificationService notificationService = context.getBean("notificationServiceBean",NotificationService.class);

        notificationService.sendSpam(customer2);
        System.out.println(customer2);
    }
}
