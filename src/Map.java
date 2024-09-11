import java.util.ArrayList;
public abstract class Map {
    abstract public Tile createTile();
    public void display(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Tile tile = createTile();
                System.out.print(tile.character() + " ");
            }
    }
    }

}
