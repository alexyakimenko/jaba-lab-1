package classes;

import interfaces.Flyable;
import interfaces.Walkable;

public class Player extends Entity implements Walkable, Flyable {
//    private String role;

    public Player(String name) {
        super(name);
//        role = "player";
    }

    @Override
    public void fly() {
        System.out.println("Somehow player can also fly");
    }

    @Override
    public void land() {
        System.out.println("Broke several legs while landing");
    }

    @Override
    public void walk() {
        System.out.println("But player sucks at walking btw");
    }
}
