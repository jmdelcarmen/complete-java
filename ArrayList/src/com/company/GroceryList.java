package com.company;

import java.util.ArrayList;

/**
 * Created by jesusmarcodelcarmen on 12/27/16.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        //similar to arr.push();
        groceryList.add(item);
    }//addItem

    public void printArrayList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i ++) {
            //.get(index) returns value;
            System.out.println((i+1) + ": " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        //replace item in position;
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + newItem + " has been set to index " + position);
    }

    public void removeGroceryItem (int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(item + " has been removed from your grocery list.");
    }

    public String findItems(String item) {
        boolean exists = groceryList.contains(item);
        int position = groceryList.indexOf(item);
        if (position == -1) {
            return null;
        }
        return groceryList.get(position);
    }

}
