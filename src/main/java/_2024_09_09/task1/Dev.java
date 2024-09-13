package _2024_09_09.task1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  *1 Создайте класс MessageGenerator, который генерирует уникальные сообщения с временной меткой. Каждый раз, когда бин
 *  * запрашивается из контекста, создаётся новый экземпляр MessageGenerator. Внедрите этот бин в биныкласса EmailSenderи
 *  * SmsSender. Используйте аннотации.
 *  */

public class Dev {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EmailSender emailSender = context.getBean("emailSender", EmailSender.class);
        SmsSender smsSender = context.getBean("smsSender", SmsSender.class);
        SmsSender smsSender1 = context.getBean("smsSender", SmsSender.class);
        emailSender.sendEmail();
        smsSender.sendSms();
        smsSender1.sendSms();


        context.close();
    }
}
