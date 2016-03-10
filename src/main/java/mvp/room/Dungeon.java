package mvp.room;

import mvp.character.Character;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public class Dungeon {
    private ArrayList<Room> roomList;

    private Location initialLocation;

    private Character hero;

    private boolean done;

    /**
     * Basic dungeon, 10 rooms, all in a straight line
     */
    public Dungeon(Character character){
        this.done = false;
        this.hero = character;
        this.initialLocation = new Location(1,1);
        this.roomList = new ArrayList<>();
        Room room10 = new Room(10, new Location(1,10));
        Room room9 = new Room(9, new Location(1,9));
    }
}
