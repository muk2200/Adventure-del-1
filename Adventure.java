import java.util.Scanner;

public class Adventure {
Map map = new Map();

    public Adventure() {
    }


    public void play() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game called Adventure");
        System.out.println("You start in " + map.getCurrentRoom().getName());
        System.out.println("Type,'east' to move right \n" +
                "Type 'west' to move left \n" +
                "Type 'north' to move up \n" +
                "Type 'south' to move down \n" +
                "Type 'exit' to exit \n" +
                "Type 'look' to look around \n" +
                "Type 'help' to get help \n");

        boolean game = true;
        while (game) {
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("look")) {
                System.out.println("You are in " + map.getCurrentRoom().getDescription());

            } else if (userInput.equals("east")) {
                if (map.getCurrentRoom().getEast() != null) {
                    map.setCurrentRoom( map.getCurrentRoom().getEast());
                    System.out.println("You go east");
                } else {
                    System.out.println("You can't go there");
                }

            } else if (userInput.equals("west")) {
                if (map.getCurrentRoom().getWest() != null) {
                    map.setCurrentRoom(map.getCurrentRoom().getWest());
                    System.out.println("You go west");
                } else {
                    System.out.println("You can't go there");
                }


            } else if (userInput.equals("south")) {
                if (map.getCurrentRoom().getSouth() != null) {
                    map.setCurrentRoom(map.getCurrentRoom().getSouth());
                    System.out.println("You go south");
                } else {
                    System.out.println("You can't go there");
                }

            } else if (userInput.equals("north")) {
                if (map.getCurrentRoom().getNorth() != null) {
                    map.setCurrentRoom(map.getCurrentRoom().getNorth());
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


            } else if (userInput.equals("exit")) {
                System.out.println("Thank you for playing, close the tab");
                game = false;
            } else {
                System.out.println("Invalid commando");
            }
        }
        scanner.close();

    }

    public void goNorth(){

    }
}

// Af Muhammad & Jawad













