package _2024_09_09.task2.engine;

import org.springframework.stereotype.Component;

@Component("electricEngineBean")

public class ElectricEngine implements Engine{
    @Override
    public String getEngine() {
        return "ElectricEngine";
    }
}
