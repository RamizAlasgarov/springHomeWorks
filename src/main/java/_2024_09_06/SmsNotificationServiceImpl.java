package _2024_09_06;

import _2024_09_06.intefaces.SmsNotificationService;

public class SmsNotificationServiceImpl implements SmsNotificationService {
    @Override
    public void sendSmsSpam(Customer customer) {
        System.out.println("sms spam to :" + customer.getName());
    }
}
