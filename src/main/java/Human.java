public class Human extends Animal {
    public final static int POWER = 5;
    public final static int INITIATIVE = 4;

    public Human(final Position position, final World world) {
        super(POWER, INITIATIVE, position, world);
    }

    public void action() {

    }

    public void colision() {

    }

    public char draw() {

        return 'H';
    }
}
