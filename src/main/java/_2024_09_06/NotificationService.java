package _2024_09_06;

import _2024_09_06.intefaces.EmailNotificationService;
import _2024_09_06.intefaces.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class NotificationService {
    private final EmailNotificationService emailNotificationService;
    private final SmsNotificationService smsNotificationService;

    @Autowired
    public NotificationService(EmailNotificationService emailNotificationService, SmsNotificationService smsNotificationService) {
        this.emailNotificationService = emailNotificationService;
        this.smsNotificationService = smsNotificationService;
    }

    public  void sendSpam(Customer customer){
        LocalDate currentDate = LocalDate.now();
        LocalDate lastNotificationDate  = customer.getDateOfLastNotification();

        long daysBetween = DAYS.between(lastNotificationDate, currentDate );
        if(daysBetween > 30 ){
            emailNotificationService.sendEmailSpam(customer);
            smsNotificationService.sendSmsSpam(customer);
            customer.setDateOfLastNotification(LocalDate.now());
        }
    }
}
