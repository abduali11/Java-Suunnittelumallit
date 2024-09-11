public class Swamp implements Tile{
    @Override
    public char character() {
        return 'S';
    }

    @Override
    public String getType() {
        return "swamp";
    }
}
