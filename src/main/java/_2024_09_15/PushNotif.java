package _2024_09_15;

import _2024_09_15.interfaces.NotificationService;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ToString
public class PushNotif implements NotificationService {

    List<Tasks> tasksList;
    @Override
    public void notification() {
        System.out.println("push notification");
    }
}
