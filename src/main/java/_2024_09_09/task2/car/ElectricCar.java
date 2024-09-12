package _2024_09_09.task2.car;

import _2024_09_09.task2.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("electricCarBean")
public class ElectricCar extends Car{

    @Autowired
    public ElectricCar(@Qualifier("electricEngineBean") Engine engine) {
        super(engine);
    }
}
