package _2024_09_06;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class Customer {
    private long id;
    private String name;
    LocalDate dateOfLastNotification;
    private long phone;
    private String email;
}
