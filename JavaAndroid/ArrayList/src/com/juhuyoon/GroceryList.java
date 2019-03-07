package com.juhuyoon;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + " . " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem); //position will be that index position found from findItem
        if(position >= 0) {
            modifyGroceryItem(position, newItem); //if position is greater than 0, then it will override the position to the new parameter.
        }

    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item); //position will be that index position found from findItem
        if(position >= 0) {
            removeGroceryItem(position); //if position is greater than 0, then it will override the position to the new parameter.
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public int findItem(String searchItem) {
            return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }
}
