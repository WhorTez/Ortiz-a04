/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Solution45 {
    private static final Scanner in = new Scanner(System.in);
    private static final File data = new File("data/exercise45_input.txt");
    public List<String> fileInput = new ArrayList<>();
    public List<String> replacedList = new ArrayList<>();


    public List<String> getFileData(){

        //each element in the array holds a line of the input file
        try {
            //create a buffered reader
            try (Scanner scan = new Scanner(data)) {
                //while next line is not null
                while (scan.hasNextLine()) {
                    fileInput.add(scan.nextLine());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // return the created array
        return fileInput;
    }

    public List<String> replaceUtilizeWithUse(){

        //loop through each element and find each occurence of utilize with used
        for(int i=0;i<fileInput.size(); i++) {
            //assign the replaced element
            String willReplace = fileInput.get(i).replace("utilizes", "uses");
            willReplace = willReplace.replace("utilize", "use");
            replacedList.add(willReplace);
        }
        //return replacedList
        return replacedList;
    }

    public String getOutputFileName(){
        System.out.print("What do you want to name the output file? ");
        //return the name designated by the user for the output file
        return in.next();
    }

    public void writeToFile(String outputName){
        try{
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("data\\"+ outputName +".txt"))){
                for(int i=0;i<fileInput.size();i++){
                    bw.write(replacedList.get(i) +"\n");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Solution45 s = new Solution45();
        //get file data
        s.fileInput = s.getFileData();
        //create new paragraph
        s.replacedList = s.replaceUtilizeWithUse();
        //write the paragraph to new file
        s.writeToFile(s.getOutputFileName());
    }

}
