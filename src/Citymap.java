import java.util.Random;

public class Citymap extends Map {
    public Random random = new Random();
   @Override
    public Tile createTile() {
       int rand = random.nextInt(3);
       if(rand == 0) {
           return new BuildingTile();
       } else if (rand == 1) {
           return new RoadTile();
       }else{
           return new ForestTile();
       }
   }

}
