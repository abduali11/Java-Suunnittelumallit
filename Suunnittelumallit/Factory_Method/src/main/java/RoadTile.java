// src/main/java/RoadTile.java
public class RoadTile extends Tile {
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getType() {
        return "road";
    }
}