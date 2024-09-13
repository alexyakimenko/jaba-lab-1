package classes;

import layout.Position;

public abstract class Entity {
    private int health;
    private String name;
    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Position position = Position.Zero();

    public Entity(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("< %s : %s : %h>", getClass(), getName(), super.toString());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Entity entity) {
        return id == entity.id;
    }
}
