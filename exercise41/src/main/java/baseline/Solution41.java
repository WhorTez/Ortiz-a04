/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Duane Ortiz
 */
package baseline;

import java.io.*;
import java.util.*;

public class Solution41 {
    private List<String> nameList = new ArrayList<>();
    private List<String> sortedList = new ArrayList<>();
    private static final File data = new File("data/exercise41_input.txt");

    public List<String> getFileData() {
        ArrayList<String> sArray = new ArrayList<>();
        try {
            //create a buffered reader insider a try/catch block
            try (Scanner sc = new Scanner(data)) {
                //while the next line is not null
                while (sc.hasNextLine()) {
                    //store that line in the String array
                    sArray.add(sc.nextLine());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //return the created String array
        return sArray;
    }
    public List<String> alphabeticalOrderSorter(List<String> nameList){
        //take the string created above and sort it by last name
        Collections.sort(nameList);
        //return the sorted array
        return nameList;
    }
    public void outputFileData(){
        try{
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("data\\exercise41_output.txt"))){
                bw.write("Total of "+ sortedList.size() +"names");
                bw.write("\n------------------\n");
                for(int i=0;i<sortedList.size();i++){
                    bw.write(sortedList.get(i) +"\n");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Solution41 s = new Solution41();
        //call read file function
        s.nameList = s.getFileData();
        //pass nameList to alphabeticalOrderSorter
        s.sortedList = s.alphabeticalOrderSorter(s.nameList);
        //create the output file
        s.outputFileData();

    }
}
