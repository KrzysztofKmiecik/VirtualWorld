public class Antelope extends Animal {
    public final static int POWER = 4;
    public final static int INITIATIVE = 4;

    public Antelope(final Position position, final World world) {
        super(POWER, INITIATIVE, position, world);
    }

    public void action() {

    }

    public void colision() {

    }

    public char draw() {

        return 'A';
    }
}
