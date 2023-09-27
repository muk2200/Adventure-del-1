import java.util.Scanner;

public class Adventure {

    private Room currentRoom;

    public Adventure() {
        Room room1 = new Room("Room 1", "The entry point, the room is cold and empty");
        Room room2 = new Room("Room 2", "This room is filled with cats and a lantern");
        Room room3 = new Room("Room 3", "There is a waterfall and jungle in this room");
        Room room4 = new Room("Room 4", "In here there is a big lion in a cage");
        Room room5 = new Room("Room 5", "You are now entered in the room filled with delicious food");
        Room room6 = new Room("Room 6", "There is a key in this room, and there is also a book");
        Room room7 = new Room("Room 7", "Here is the movie theater");
        Room room8 = new Room("Room 8", "This is the sauna place");
        Room room9 = new Room("Room 9", "This is a bedroom, but there is only a small bed");

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


    public void play() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game called Adventure");
        System.out.println("You start in " + currentRoom.getName());
        System.out.println("Type,'east' to move right \n" +
                "Type 'west' to move left \n" +
                "Type 'north' to move up \n" +
                "Type 'south' to move down \n" +
                "Type 'exit' to exit \n" +
                "Type 'look' to look around \n" +
                "Type 'help' to get help \n");

        while (true) {
            String userInput = scanner.nextLine().toLowerCase();

             if (userInput.equals("look")) {
                 System.out.println("You are in " + currentRoom.getDescription());




            } else if (userInput.equals("east")) {
                if (currentRoom.getEast() != null) {
                    currentRoom = currentRoom.getEast();
                    System.out.println("You go east");
                } else {
                    System.out.println("You can't go there");
                }

            } else if (userInput.equals("west")) {
                if (currentRoom.getWest() != null) {
                    currentRoom = currentRoom.getWest();
                    System.out.println("You go west");
                } else {
                    System.out.println("You can't go there");
                }


            } else if (userInput.equals("south")) {
                if (currentRoom.getSouth() != null) {
                    currentRoom = currentRoom.getSouth();
                    System.out.println("You go south");
                } else {
                    System.out.println("You can't go there");
                }

            } else if (userInput.equals("north")) {
                 if (currentRoom.getNorth() != null) {
                     currentRoom = currentRoom.getNorth();
                     System.out.println("You go north");
                 } else {
                     System.out.println("You can't go there");

                 }

             } else if (userInput.equals("help")) {
                System.out.println("Try to move another direction \n" +
                        "Type,'east' to move left \n" +
                        "Type 'west' to move right \n" +
                        "Type 'north' to move up \n" +
                        "Type 'south' to move down \n" +
                        "Type 'exit' to exit \n" +
                        "Type 'look' to look around \n" +
                        "Type 'help' to get help \n");


            }
           else  if (userInput.equals("exit"))
                System.out.println("Thank you for playing, close the tab");
        } else

    }
}

// Af Muhammad & Jawad













