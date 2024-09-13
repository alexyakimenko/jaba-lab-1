package classes;

import interfaces.Flyable;

public class Bat extends Entity implements Flyable {
    private final float moveSpeed = 10.0f;

    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        // Fly logic
        System.out.println("Bat is flying " + moveSpeed + "km/h");
    }

    @Override
    public void land() {
        System.out.println("Landing without problems");
    }
}
