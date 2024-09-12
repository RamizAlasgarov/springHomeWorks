package _2024_09_09.task2;

import _2024_09_09.task2.car.ElectricCar;
import _2024_09_09.task2.car.ExrCar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2 Ваш абстрактный класс Car зависит от интерфейса Engine. Создайте несколько реализаций интерфейса
 * Engine(например, GasEngine и ElectricEngine). Аннотируйте их с помощью @Component с названием бинов.
 * Создайте наследников Car (ExrCar и ElectricCar),пометьте их аннотацией @Component. При внедрении бина
 * Engine с помощью @Autowired укажите название подходящего двигателяс помощью @Qualifier, чтобы можно
 * было выбрать тип двигателя во время компиляции.Получите биныобоих видов автомобилей и выведите тип
 * двигателя в консоль.
 */
public class Dev {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        ElectricCar electricCar = context.getBean("electricCarBean", ElectricCar.class);

        ExrCar exrCar = context.getBean("exrCarBean",ExrCar.class);

        System.out.println(electricCar);

        System.out.println(exrCar);
        context.close();
    }
}
