package _2024_09_06;

import _2024_09_06.intefaces.EmailNotificationService;

public class EmailNotificationServiceImpl implements EmailNotificationService {
    @Override
    public void sendEmailSpam(Customer customer) {
        System.out.println("email Spam to:" + customer.getName());
    }
}
