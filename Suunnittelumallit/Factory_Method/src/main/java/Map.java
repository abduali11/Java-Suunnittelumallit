// src/main/java/Map.java
public abstract class Map {
    public abstract Tile createTile();

    public void display(Tile[][] map) {
        for (Tile[] row : map) {
            for (Tile tile : row) {
                System.out.print(tile.getCharacter() + " ");
            }
            System.out.println();
        }
    }
}