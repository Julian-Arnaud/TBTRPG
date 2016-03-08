package mvp.room;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public class Location {

    private int x;
    private int y;


    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
