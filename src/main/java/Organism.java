public abstract class Organism {

    private int power;
    private int initiative;
    private Position position;
    private World world;

    public Organism(final int power, final int initiative,final Position position,final World world) {
        this.power = power;
        this.initiative = initiative;
        this.position=position;
        this.world = world;
        world.addOrganismToTheList(this);
    }

    public Position getPosition() {
        return position;
    }

    public int getPower() {
        return power;
    }

    public int getInitiative() {
        return initiative;
    }

    public World getWorld() {
        return world;
    }

    public void setPower(final int power) {
        this.power = power;
    }

    public void setInitiative(final int initiative) {
        this.initiative = initiative;
    }

    public void setPosition(final Position position) {
        this.position = position;
    }

    public void setWorld(final World world) {
        this.world = world;
    }

    public abstract void action();

    public abstract void colision();

    public abstract char draw();
}
