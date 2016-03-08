package mvp.room;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public enum Direction {
    NORTH('N'), EAST('E'), WEST('W'), SOUTH('S');

    private char charDir;
    private Direction direction;

    Direction(char charDir) {

        this.charDir = charDir;
    }

    public static Direction parse(char charDir) {
        Direction d = null;
        switch (charDir) {
            case 'N':
                d = Direction.NORTH;
                break;
            case 'E':
                d = Direction.EAST;
                break;
            case 'S':
                d = Direction.SOUTH;
                break;
            case 'W':
                d = Direction.WEST;
                break;
            default:
                break;
        }
        return d;
    }

    @Override
    public String toString() {
        return charDir + "";
    }
}
