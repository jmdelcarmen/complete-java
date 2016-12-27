package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Room {
    private Door door;
    private Person person;
    private Level level;
    private Walls walls;
    private Bed bed;

    public Room(Door door, Person person, Level level, Walls walls, Bed bed) {
        this.door = door;
        this.person = person;
        this.level = level;
        this.walls = walls;
        this.bed = bed;
    }

    public Door getDoor() {
        return door;
    }

    public Person getPerson() {
        return person;
    }

    public Level getLevel() {
        return level;
    }

    public Walls getWalls() {
        return walls;
    }

    public Bed getBed() {
        return bed;
    }

}
