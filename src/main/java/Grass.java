public class Grass extends Plant {

    public final static int POWER = 0;

    public Grass(final Position position, final World world) {
        super(POWER, position, world);
    }

    public void action() {

    }

    public void colision() {

    }

    public char draw() {

        return 'G';
    }
}
