import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public String character;


    public static void main(String[] args) throws FileNotFoundException {
        int counter = 0;
        Scanner scanner = new Scanner(new File("test.txt"));
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        while(scanner.hasNext()) {
            unique.add(scanner.next().replaceAll("[^a-zA-Z0-9]", ""));

        }

        for (String s : unique) {
            System.out.println(s);
            counter ++;
        }

        System.out.println("\nThere are " + counter + " unique words in the Iliad.");


    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof String temp){
            return Objects.equals(this.character, temp);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return character.hashCode();
    }

}
