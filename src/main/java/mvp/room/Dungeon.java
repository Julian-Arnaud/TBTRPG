package mvp.room;

import mvp.character.Character;

import java.util.ArrayList;

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
        initMinimalDungeon();
    }

    private void initMinimalDungeon() {
        Room room10 = new Room(10, new Location(1, 10));
        Room room9 = new Room(9, new Location(1, 9));
        Room room8 = new Room(8, new Location(1, 8));
        Room room7 = new Room(7, new Location(1, 7));
        Room room6 = new Room(6, new Location(1, 6));
        Room room5 = new Room(5, new Location(1, 5));
        Room room4 = new Room(4, new Location(1, 4));
        Room room3 = new Room(3, new Location(1, 3));
        Room room2 = new Room(2, new Location(1, 2));
        Room room1 = new Room(1, new Location(1, 1));

        room1.linkEast(room2);
        room2.linkEast(room3);
        room3.linkEast(room4);
        room4.linkEast(room5);
        room5.linkEast(room6);
        room6.linkEast(room7);
        room7.linkEast(room8);
        room8.linkEast(room9);
        room9.linkEast(room10);

        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);
        roomList.add(room10);
    }

    public void setDone() {
        this.done = true;
    }
}
