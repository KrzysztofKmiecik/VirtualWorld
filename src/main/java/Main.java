public class Main {
    public static void main(String[] args) {
        World world = new World(new char[10][10]);

        Fox fox = new Fox(new Position(1, 2), world);
        Grass grass = new Grass(new Position(2, 1), world);
        Sheep sheep = new Sheep(new Position(1, 1), world);

        world.runRound();
        world.drawWorld();


    }
}
