package inputHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
            pw.println("Hei write file 0");
            // Do magic here
            pw.close();
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }


    // Helt ekvivalent om vi bruker output og input streams
    public void readFile2(String path){
        try {
            InputStream stream = new FileInputStream(path);
            Scanner scanner = new Scanner(stream);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); // Do some magic with the line
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeFile2(String path){
        try {
            OutputStream stream = new FileOutputStream(path);
            PrintWriter pw = new PrintWriter(stream);
            pw.println("Hei write file 1");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        example ex = new example();
        ex.writeFile("lectureExamples/inputHandling/test.txt");
        ex.readFile("lectureExamples/inputHandling/test.txt");

        ex.writeFile2("lectureExamples/inputHandling/test.txt");
        ex.readFile2("lectureExamples/inputHandling/test.txt");
    }
}
