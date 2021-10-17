package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParseCSVTest {

    @Test
    void separateData() {
        ParseCSV csv = new ParseCSV();
        List<String> testingList = new ArrayList<>();
        testingList.add("Ling");
        testingList.add("Mai");
        testingList.add("55900");


        assertEquals(testingList.get(0), csv.separateData().get(0));
        assertEquals(testingList.get(1), csv.separateData().get(1));
        assertEquals(testingList.get(2), csv.separateData().get(2));

    }

    @Test
    void lastNameArray() {
        ParseCSV csv = new ParseCSV();
        csv.separateData();
        List<String> testingList = new ArrayList<>();
        testingList.add("Ling");
        testingList.add("Johnson");
        testingList.add("Jones");
        testingList.add("Jones");
        testingList.add("Swift");
        testingList.add("Xiong");
        testingList.add("Zarnecki");

        assertEquals(testingList, csv.lastNameArray());
    }

    @Test
    void firstNameArray() {
        ParseCSV csv = new ParseCSV();
        csv.separateData();
        List<String> testingList = new ArrayList<>();
        testingList.add("Mai");
        testingList.add("Jim");
        testingList.add("Aaron");
        testingList.add("Chris");
        testingList.add("Geoffrey");
        testingList.add("Fong");
        testingList.add("Sabrina");

        assertEquals(testingList, csv.firstNameArray());
    }

    @Test
    void salaryArray() {
        ParseCSV csv = new ParseCSV();
        csv.separateData();
        List<String> testingList = new ArrayList<>();
        testingList.add("55900");
        testingList.add("56500");
        testingList.add("46000");
        testingList.add("34500");
        testingList.add("14200");
        testingList.add("65000");
        testingList.add("51500");

        assertEquals(testingList, csv.salaryArray());

    }
}