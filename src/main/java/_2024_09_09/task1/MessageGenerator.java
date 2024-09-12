package _2024_09_09.task1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("prototype")
public class MessageGenerator {
    private String message;

    public MessageGenerator() {
        LocalDateTime localDateTime = LocalDateTime.now();
        this.message = "Message " + localDateTime.toString();
    }
}
