
public class RoadTile implements Tile{
    @Override
    public char character() {
        return 'R';
    }

    @Override
    public String getType() {
        return "road";
    }
}