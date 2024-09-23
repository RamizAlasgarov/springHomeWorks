package _2024_09_15.MyApp;

import _2024_09_15.Tasks;
import _2024_09_15.interfaces.NotificationService;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@ToString
public class EmailNotif implements NotificationService {
    List<Tasks> tasksList;
    @Override
    public void notification() {
        System.out.println("EmailNotif");
    }
}
