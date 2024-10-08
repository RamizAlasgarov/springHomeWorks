package _2024_09_09.task1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emailSender")
public class EmailSender {
    private MessageGenerator messageGenerator;

    public EmailSender(MessageGenerator messageGenerator) {
        this.messageGenerator = messageGenerator;
    }

    public void sendEmail(){
        System.out.println("Send email " + messageGenerator);
    }

    @Override
    public String toString() {
        return "EmailSender{" +
                "messageGenerator=" + messageGenerator +
                '}';
    }
}

