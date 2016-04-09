package mvp.room;

/**
 * @author Julian ARNAUD
 * @date 08/03/2016
 **/
public class Room {

    private int id;
    private Location location;
    private String description;

    private boolean cleared;

    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    public Room(int id, Location location){
        this.id = id;
        this.cleared = false;
        this.location = location;
        this.description = "Room n°: " + id + ", location: (" + location.getX() + "," + location.getY() + ")";
    }

    public String getDescription(){
        return this.description;
    }

    public void linkNorth(Room room){
        northRoom = room;
        room.setSouthRoom(this);
    }

    public void linkSouth(Room room){
        southRoom = room;
        room.setNorthRoom(this);
    }

    public void linkEast(Room room){
        eastRoom = room;
        room.setWestRoom(this);
    }

    public void linkWest(Room room){
        westRoom = room;
        room.setEastRoom(this);
    }

    public void setEastRoom(Room eastRoom) {
        this.eastRoom = eastRoom;
    }

    public void setNorthRoom(Room northRoom) {
        this.northRoom = northRoom;
    }

    public void setSouthRoom(Room southRoom) {
        this.southRoom = southRoom;
    }

    public void setWestRoom(Room westRoom) {
        this.westRoom = westRoom;
    }
}
