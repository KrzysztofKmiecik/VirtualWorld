public abstract class Plant extends Organism {

    public final static  int  INITIATIVE=0;

    public Plant(final int power,final Position position, final World world) {
        super(power, INITIATIVE, position, world);
    }
}
