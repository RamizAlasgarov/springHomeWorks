package _2024_09_09.task2.car;

import _2024_09_09.task2.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("exrCarBean")
public class ExrCar extends Car{

    @Autowired
    public ExrCar(@Qualifier("GasEngineBean") Engine engine) {
        super(engine);
    }


}
