package CSV_Data_Handling_09_02_2026;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadandPrintCSV {
    public static void main(String[] args) {
        String file = "/Students.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;

            while((line = br.readLine()) != null){

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                System.out.println("ID: " + id +
                        " | Name: " + name +
                        " | Age: " + age +
                        " | Marks: " + marks);
            }

        } catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
