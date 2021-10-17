package baseline;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void getFileData() {
        Solution42 s = new Solution42();
        ArrayList<String> testingList = new ArrayList<>();
        testingList.add("Ling,Mai,55900");
        testingList.add("Johnson,Jim,56500");
        testingList.add("Jones,Aaron,46000");
        testingList.add("Jones,Chris,34500");
        testingList.add("Swift,Geoffrey,14200");
        testingList.add("Xiong,Fong,65000");
        testingList.add("Zarnecki,Sabrina,51500");
        assertEquals(testingList, s.getFileData());

    }
}