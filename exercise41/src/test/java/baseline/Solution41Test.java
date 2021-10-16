package baseline;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void getFileData() {
        Solution41 s = new Solution41();
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ling, Mai");
        nameList.add("Johnson, Jim");
        nameList.add("Zarnecki, Sabrina");
        nameList.add("Jones, Chris");
        nameList.add("Jones, Aaron");
        nameList.add("Swift, Geoffrey");
        nameList.add("Xiong, Fong");
        assertEquals(nameList, s.getFileData());
    }

    @Test
    void alphabeticalOrderSorter() {
        Solution41 s = new Solution41();
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ling, Mai");
        nameList.add("Johnson, Jim");
        nameList.add("Zarnecki, Sabrina");
        nameList.add("Jones, Chris");
        nameList.add("Jones, Aaron");
        nameList.add("Swift, Geoffrey");
        nameList.add("Xiong, Fong");

        ArrayList<String> sortedList = new ArrayList<>();
        sortedList.add("Johnson, Jim");
        sortedList.add("Jones, Aaron");
        sortedList.add("Jones, Chris");
        sortedList.add("Ling, Mai");
        sortedList.add("Swift, Geoffrey");
        sortedList.add("Xiong, Fong");
        sortedList.add("Zarnecki, Sabrina");

        assertEquals(sortedList, s.alphabeticalOrderSorter(nameList));
    }

    @Test
    void outputFileData() {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ling, Mai");
        nameList.add("Johnson, Jim");
        nameList.add("Zarnecki, Sabrina");
        nameList.add("Jones, Chris");
        nameList.add("Jones, Aaron");
        nameList.add("Swift, Geoffrey");
        nameList.add("Xiong, Fong");
        Solution41 solution = new Solution41();
        assertEquals(7, solution.alphabeticalOrderSorter(nameList).size());
    }
    }
