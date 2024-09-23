package _2024_09_15;

public class Connector {
    public Connector(){
        System.out.println("Podklucayus k serveru");
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("podklucilsa");
    }
}
