/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Duane Ortiz
 */
package baseline;
import com.google.gson.Gson;

import java.util.Scanner;
import java.io.FileReader;

public class Solution44 {
    Inventory inv;
    private static final Scanner in = new Scanner(System.in);

    public String getProductName(){
        String item;
        //prompt for object name
        System.out.print("What are you looking for? ");
        //return name
        return in.next();
    }

    public void getJSONData(){
        //use try block
        try {
            //create gson obj
            Gson gson = new Gson();
            //assign inventory to hold gson data once parsed
            inv = gson.fromJson(new FileReader("data/exercise44_input.json"), Inventory.class);
            //catch exceptions
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkInventory(String userItem){
        //check if the item the user entered exists
        //if it does
        try{
            for(int i=0;i<inv.product.size(); i++){
                if(inv.product.get(i).getItemName().equals(userItem)){
                    System.out.println("Name: "+ inv.product.get(i).getItemName());
                    System.out.printf("Price: %.2f", inv.product.get(i).getPrice());
                    System.out.println("\nQuantity: "+ inv.product.get(i).getQuantity());

                    return;
                }
            }
            throw new IllegalArgumentException();

        }catch (Exception e){
            System.out.println("Sorry chief we don't got that. ");
            in.nextLine();
            userItem = getProductName();
            checkInventory(userItem);
        }
    }

    public static void main(String[] args){
        Solution44 s = new Solution44();
        //get product user wants
        String userItem = s.getProductName();
        //parse JSON data
        s.getJSONData();
        //inform user if they entered the right data or not
        s.checkInventory(userItem);
    }

}

