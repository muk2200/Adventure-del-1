import java.util.ArrayList;

public class Map {

    private Room currentRoom;

    public Map() {
        Room room1 = new Room("Room 1", "The entry point, the room is cold and empty ");
        Room room2 = new Room("Room 2", "This room is filled with cats and a lantern");
        Room room3 = new Room("Room 3", "There is a waterfall and jungle in this room");
        Room room4 = new Room("Room 4", "In here there is a big lion in a cage");
        Room room5 = new Room("Room 5", "You are now entered in the room filled with delicious food");
        Room room6 = new Room("Room 6", "There is a key in this room, and there is also a book");
        Room room7 = new Room("Room 7", "Here is the movie theater");
        Room room8 = new Room("Room 8", "This is the sauna place");
        Room room9 = new Room("Room 9", "This is a bedroom, but there is only a small bed");



        room1.addItem (new Item ("waterbottle", "pick up the waterbottle"));
        room2.addItem (new Item ("sword", "pick up the sword"));
        room3.addItem (new Item ("scooter", "pick up the scooter"));
        room4.addItem (new Item ("key", "pick up the key"));
        room5.addItem (new Item ("napkin", "pick up the napkin"));
        room6.addItem (new Item ("book", "pick up the book"));
        room7.addItem (new Item ("remote", "pick up the remote"));
        room8.addItem (new Item ("towel", "pick up the towel"));
        room9.addItem (new Item ("pillow", "pick up the pillow"));

        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setWest(room1);
        room2.setEast(room3);

        room3.setSouth(room6);
        room3.setEast(room2);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);

        room9.setWest(room8);
        room9.setNorth(room6);


        currentRoom = room1;
    }


    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    public String look() {
        return currentRoom.getName() + " " + currentRoom.getDescription();
    }
}
