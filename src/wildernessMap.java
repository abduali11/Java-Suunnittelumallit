import java.util.Random;

public class wildernessMap extends Map {
    public Random random = new Random();
    @Override
    public Tile createTile(){
        int rand = random.nextInt(2);

        if (rand == 0 )
            return new Swamp();
        else if (rand == 1) {
            return new Water();
        }
        else {
            return new ForestTile();
        }
    }
}
