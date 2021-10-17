/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Duane Ortiz
 */
package baseline;

import java.util.Scanner;

public class Solution43 {
    private static final Scanner in = new Scanner(System.in);
    public String getSiteName(){
        //prompt for site name
        System.out.print("Enter site name:");
        //return site name
        return in.nextLine();
    }

    public String getSiteAuthor(){
        //prompt for site author
        System.out.print("Enter author name:");
        //return site author
        return in.nextLine();
    }

    public boolean javaFolderAnswer(){
        //prompt user if he/she wants a java folder
        System.out.print("Do you want a folder for JavaScript(Y/N)? ");
        //return true for yes, false for no
        String answer = in.nextLine();
        if(answer.equals("Y")){
            return true;
        }else if (answer.equals("N")){
            return false;
        }
        return false;
    }

    public boolean cssFolderAnswer(){
        //prompt user if he/she would like a CSS folder
        System.out.print("Do you want a folder for CSS(Y/N)? ");
        //return true for yes, false for no
        String answer = in.nextLine();
        if(answer.equals("Y")){
            return true;
        }else if (answer.equals("N")){
            return false;
        }
        return false;
    }

    public static void main(String[] args){
        websiteCreator w = new websiteCreator();
        Solution43 s = new Solution43();

        String siteName = s.getSiteName();
        String author = s.getSiteAuthor();

        boolean JS = s.javaFolderAnswer();
        boolean CSS = s.cssFolderAnswer();

        w.websiteFolderCreator(siteName);
        w.HTMLFileCreator(author, siteName);

        if(JS){
            w.javaFolderCreator(siteName);
        }

        if(CSS){
            w.CSSFolderCreator(siteName);
        }
    }
}
