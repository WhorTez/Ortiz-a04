package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class websiteCreator {
    String out = "Created ./website/";
    String website = "website/";

    public File websiteFolderCreator(String siteName){
        File f = new File(website + siteName);
        boolean b = f.mkdir();
        if(b){
            System.out.println(out + siteName);
        }
        return f;
    }

    public File HTMLFileCreator(String author, String siteName){
        //take the siteName and author from main
        //create a HTML file with the title and author associated with the right tags
        File f = new File("website/"+ siteName + "/index.html");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<!DOCTYPE html><html><head><title>"+ siteName +"</title><meta name = \"author\" content = \"" + author +"\"></head><html>");
            //write a HTML file and place in the website directory
            System.out.println(out + siteName +"/index.html");
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public File javaFolderCreator(String siteName){
        //create an empty java folder
        File f = new File(website + siteName +"/JS");
        boolean b = f.mkdirs();
        if(b){
            System.out.println(out + siteName +"/JS");
        }
        return f;
    }

    public File CSSFolderCreator(String siteName){
        //create an empty CSS folder
        File f = new File(website + siteName +"/CSS");
        boolean b = f.mkdirs();
        if(b){
            System.out.println(out + siteName +"/CSS");
        }
        return f;
    }
}
