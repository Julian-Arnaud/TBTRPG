package mvp.room;

import java.util.HashMap;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public class Room {

    private int id;
    private Location location;
    private String description;

    private HashMap<Direction, Room> directions;

    public Room(int id, Location location, HashMap<Direction, Room> directions){
        this.id = id;
        this.location = location;
        this.directions = directions;
        this.description = "Room n°: " + id + ", location: (" + location.getX() + "," + location.getY() + ")";
    }

    public String getDescription(){
        return this.description;
    }
}
