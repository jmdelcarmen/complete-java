package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Door door = new Door(2, "Brown", 25, 12, "Wood" );
        Person person = new Person("marco", 21, true, false);
        Level level = new Level(2, 30);
        Walls walls = new Walls(4, "red", true);
        Bed bed = new Bed("King sized", 4, 10, 2);

        Room room = new Room(door, person, level, walls, bed);
        room.getPerson().enterRoom();
        room.getDoor().closeDoors();
        room.getDoor().openDoors();
        room.getBed().make();
    }
}
