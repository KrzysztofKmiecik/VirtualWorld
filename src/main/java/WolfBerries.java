public class WolfBerries extends Plant {
    public final static int POWER = 99;

    public WolfBerries(final Position position, final World world) {
        super(POWER, position, world);
    }

    public void action() {

    }

    public void colision() {

    }

    public char draw() {

        return 'B';
    }
}
