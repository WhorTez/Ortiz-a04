/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Duane Ortiz
 */
package baseline;

public class Item {
    //contains information of individual items
    String itemName;
    double price;
    int quantity;

    public String getItemName(){
        //get for the name of the item
        return itemName;
    }

    public double getPrice(){
        //get for the price of the item
        return price;
    }

    public int getQuantity(){
        //get for the quantity of the item
        return quantity;
    }
}
