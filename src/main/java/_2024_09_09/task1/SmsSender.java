package _2024_09_09.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class SmsSender {
    MessageGenerator messageGenerator;



    public SmsSender( MessageGenerator messageGenerator) {
        this.messageGenerator = messageGenerator;
    }

    public void sendSms(){
        System.out.println("send sms " + messageGenerator);
    }

    @Override
    public String toString() {
        return "SmsSender{" +
                "messageGenerator=" + messageGenerator +
                '}';
    }
}
