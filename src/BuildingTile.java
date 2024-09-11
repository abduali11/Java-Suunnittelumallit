public class BuildingTile implements Tile{
    @Override
    public char character() {
        return 'B';
    }

    @Override
    public String getType() {
        return "building";
    }
}
