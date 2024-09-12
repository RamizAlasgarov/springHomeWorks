package _2024_09_09.task2.engine;

import org.springframework.stereotype.Component;

@Component("GasEngineBean")
public class GasEngine implements Engine{

    @Override
    public String getEngine() {
        return "GasEngine";
    }
}
