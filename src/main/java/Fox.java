public class Fox extends Animal {
    public final static int POWER = 3;
    public final static int INITIATIVE = 7;

    public Fox(final Position position, final World world) {
        super(POWER, INITIATIVE, position, world);
    }

    public void action() {

    }

    public void colision() {

    }

    public char draw() {

        return 'F';
    }
}
