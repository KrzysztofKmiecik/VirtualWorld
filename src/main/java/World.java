import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class World {
    private char[][] map;
    private List<Organism> organisms = new ArrayList<>();

    public World(final char[][] map) {
        this.map = map;
    }

    public void addOrganismToTheList(Organism organism) {
        this.organisms.add(organism);
    }

    public void runRound() {
        Position genPosition = new Position(0, 0);
        for (Organism organism : organisms) {
       //     genPosition = generatePosition(map);

            organism.setPosition(generatePosition(map));
        }

    }

    private Position generatePosition(char[][] map) {
        Position pos = new Position(0, 0);
        Random generator = new Random();
        pos.setX(generator.nextInt(map.length - 1));
        pos.setY(generator.nextInt(map.length - 1));
        return pos;
    }

    public void createEmptyWorld() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = '.';
            }
        }
    }


    private void createWorld() {
        createEmptyWorld();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '.') {
                    map[i][j] = searchOrganismList(i, j);
                }
            }
        }
    }

    public void drawWorld() {
        createWorld();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(searchOrganismList(i, j));
            }
            System.out.println();
        }

    }

    private char searchOrganismList(int i, int j) {
        char c = '.';
        for (Organism organism : organisms) {
            if ((i == organism.getPosition().getX()) && (j == organism.getPosition().getY())) {
                c = (organism.draw());
                break;
            } else {
                c = '.';
            }
        }
        return c;
    }


}
