/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Duane Ortiz
 */
package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution42 {
    private final File data = new File("data/exercise42_input.txt");

    public List<String> getFileData(){
        ArrayList<String> sArray = new ArrayList<>();
        try {
            //create a buffered reader inside
            try (Scanner sc = new Scanner(data)) {
                while (sc.hasNextLine()) {
                    sArray.add(sc.nextLine());
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        //return the created string
        return sArray;
    }

    public static void main(String[] args){
        ParseCSV csv = new ParseCSV();
        csv.separateData = csv.separateData();
        csv.lastName = csv.lastNameArray();
        csv.firstName = csv.firstNameArray();
        csv.salary = csv.salaryArray();
        csv.outputEmployees();
    }
}
