package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

class Solution45Test {

    @Test
    void getFileData() {
        Solution45 s = new Solution45();
        String test = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.";
        s.fileInput = s.getFileData();
        assertEquals(test, s.fileInput.get(0));
    }

    @Test
    void replaceUtilizeWithUse() {
        Solution45 s = new Solution45();
        String test = "One should never use the word \"use\" in writing. Use \"use\" instead.";
        s.fileInput = s.getFileData();
        s.replacedList = s.replaceUtilizeWithUse();
        assertEquals(test, s.replacedList.get(0));
    }

    @Test
    void writeToFile() {
        Solution45 s = new Solution45();
        s.fileInput = s.getFileData();
        s.replacedList = s.replaceUtilizeWithUse();
        s.writeToFile("test");

        List<String> test = new ArrayList<>();

        File data = new File("data/test.txt");

        try (Scanner scan = new Scanner(data)){
            while (scan.hasNextLine()){
                test.add(scan.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(s.replacedList.get(0), test.get(0));
    }
}