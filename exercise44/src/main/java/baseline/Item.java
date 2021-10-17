/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Duane Ortiz
 */
package baseline;

public class Item {
    //contains information of individual items
    String itemName;
    double price;
    int amount;

    public String getItemName(){
        //prompt for the name of the item
        return itemName;
    }

    public double getPrice(){
        //prompt for the price of the item
        return price;
    }

    public int getAmount(){
        //prompt for the quantity of the item
        return amount;
    }
}
