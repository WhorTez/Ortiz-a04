package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class ParseCSV {
    protected List<String>  separateData = new ArrayList<>();
    protected List<String>  lastName = new ArrayList<>();
    protected List<String>  firstName = new ArrayList<>();
    protected List<String>  salary = new ArrayList<>();

    public List<String>  separateData() {
       Solution42 s = new Solution42();
       List<String> notSeparateData = s.getFileData();

       //loop size of list
        for(int i=0;i< notSeparateData.size(); i++) {
            //for each comma split the string
            //also store it to a local variable to add it to separateData
            String[] l = notSeparateData.get(i).split(",");
            separateData.addAll(Arrays.asList(l));
        }
        return separateData;
    }

    public List<String> lastNameArray(){
        //loop length of array
        for(int i=0;i<separateData.size(); i+=3) {
            //get the first element and skip two each line
            //add last names to lastNameArrayList
            lastName.add(separateData.get(i));
        }
        return lastName;
    }

    public List<String> firstNameArray(){
        //loop length of array
        for(int i=1;i<separateData.size(); i+=3) {
            //get the first element and skip two each line
            //add last names to firstNameArrayList
            firstName.add(separateData.get(i));
        }
        return firstName;
    }

    public List<String> salaryArray(){
        //loop length of array
        for(int i=2;i<separateData.size(); i+=3) {
            //get the first element and skip two each line
            //add last names to SalaryArrayList
            salary.add(separateData.get(i));
        }
        return salary;
    }

    public void outputEmployees(){
        //create a buffered writer
        try{
            //create a buffered reader
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("data\\exercise42_output.txt"))){
                bw.write("Last      First     Salary");
                bw.write("\n------------------------------\n");

                for(int i=0;i<lastName.size(); i++){
                    String space = "%-10s";
                    bw.write(String.format(space, lastName.get(i))+ String.format(space, firstName.get(i))+ String.format(space, salary.get(i))+ "\n");
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
