public class Turtle extends Animal {
    public final static int POWER = 9;
    public final static int INITIATIVE = 9;

    public Turtle(final Position position, final World world) {
        super(POWER, INITIATIVE, position, world);
    }

    public void action() {

    }

    public void colision() {

    }

    public char draw() {

        return 'T';
    }
}
