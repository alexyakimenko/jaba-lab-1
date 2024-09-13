import classes.Bat;
import classes.Cow;
import classes.Entity;
import classes.Player;
import interfaces.Flyable;
import interfaces.Walkable;

public class Main {
    public static void main(String[] args) {
        Entity[] entities = new Entity[3];
        entities[0] = new Cow("rubert");
        entities[1] = new Bat("batman");
        entities[2] = new Player("ZeroPotential");

        for(Entity entity : entities) {
            System.out.println(entity.toString());
        }

        Walkable[] walkers = new Walkable[2];
        walkers[0] = new Cow("bruthar");
        walkers[1] = new Player("NPCopper");

        for(Walkable walker : walkers) {
            walker.walk();
        }

        Flyable[] cheaters = new Flyable[2];
        cheaters[0] = new Bat("FlyingMouse");
        cheaters[1] = new Player("sHerobrine");

        for(Flyable cheater : cheaters) {
            cheater.fly();
        }
    }
}