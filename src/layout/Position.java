package layout;

public class Position {
    public float x;
    public float y;
    public float z;

    public Position(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Position Zero() {
        return new Position(0, 0, 0);
    }

    @Override
    public String toString() {
        return String.format("< X: %f, Y: %f, Z: %f >", x, y, z);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Position pos) {
        return pos.x == x && pos.y == y && pos.z == z;
    }
}
