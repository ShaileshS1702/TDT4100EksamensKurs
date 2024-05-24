package inkappsling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BadArrayPractice {
    private List<String> Alphabet = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J"));

    public List<String> wrongGetter(){
        return Alphabet;
    }

    public List<String> correctGetter(){
        return new ArrayList<>(Alphabet);
    }

    public static void main(String[] args) {
        BadArrayPractice example = new BadArrayPractice();
        List<String> wrongAlphabet = example.wrongGetter();
        List<String> correctAlphabet = example.correctGetter();
        correctAlphabet.add("K"); // Here we change a copy of the list object
        System.out.println("Unchanged alphabet: " + example.correctGetter());

        wrongAlphabet.add("K"); // Here we change the actual list object in the class
        System.out.println("Changed alphabet: " + example.correctGetter());
        
    }
}
