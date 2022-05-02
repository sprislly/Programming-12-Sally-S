import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

    Word text = new Word (String scanner);
    }
}

/*
always use hashcode and equals method
 */
