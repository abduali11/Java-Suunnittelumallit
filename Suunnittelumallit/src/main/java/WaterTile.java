// src/main/java/WaterTile.java
public class WaterTile extends Tile {
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "water";
    }
}