package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Person {
    private String name;
    private int age;
    private boolean isMale;
    private boolean hasJob;

    public Person(String name, int age, boolean isMale, boolean hasJob) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.hasJob = hasJob;
    }

    public void enterRoom() {
        System.out.println(this.getName() + " enters the room.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public boolean isHasJob() {
        return hasJob;
    }

}
