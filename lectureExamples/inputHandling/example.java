package inputHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class example {
    
    public void readFile(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(new File(path)));) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line); // Do some magic with the line 
            }
            
            // Close the file
            br.close();
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    public void writeFile(String path){

        try (PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));){
            pw.println("Objekt kurs");
            // Do magic here
            pw.close();
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        example ex = new example();
        ex.readFile("lectureExamples/inputHandling/test.txt");
        ex.writeFile("lectureExamples/inputHandling/test.txt");
    }
}
