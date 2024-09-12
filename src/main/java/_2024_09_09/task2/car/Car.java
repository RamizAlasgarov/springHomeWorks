package _2024_09_09.task2.car;

import _2024_09_09.task2.engine.Engine;

public abstract class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine.getEngine() +
                '}';
    }
}
