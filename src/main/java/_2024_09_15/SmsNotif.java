package _2024_09_15;

import _2024_09_15.interfaces.NotificationService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
@ToString
public class SmsNotif implements NotificationService {

    List<Tasks> tasksList;

    @Override

    public void notification() {
        System.out.println("sms notification");
    }
}
