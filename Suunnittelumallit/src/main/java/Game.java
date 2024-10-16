// src/main/java/Game.java
public class Game {

    public static Map createMap(String type) {
        if (type.equalsIgnoreCase("city")) {
            return new CityMap();
        } else if (type.equalsIgnoreCase("wilderness")) {
            return new WildernessMap();
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }

    public static void main(String[] args) {
        Map map = createMap("city");
        Tile[][] tiles = new Tile[5][5];

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                tiles[i][j] = map.createTile();
            }
        }

        map.display(tiles);
    }
}