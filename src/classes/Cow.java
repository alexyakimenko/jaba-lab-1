package classes;

import interfaces.Walkable;

public class Cow extends Entity implements Walkable {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void walk() {
        // Walking logic
        System.out.println("Cow is barely walking");
    }
}
