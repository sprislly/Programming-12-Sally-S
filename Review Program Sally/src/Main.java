import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        //main
        System.out.println("Welcome to the Java study aid.");


        //questions
        Scanner in = new Scanner(System.in);
        System.out.println("How many questions would you like to make?");
        int times = in.nextInt();
        in.nextLine();

        //list
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();

        //asks the questions and answers

        for (int i = 0; i < times; i++) {
            System.out.println("What is your question? ");
            String question = in.nextLine();
            questions.add(question);

            System.out.println("What is the answer? ");
            String answer = in.nextLine();
            answers.add(answer);
        }

        //quiz
        Random rand = new Random();
        int int_random = rand.nextInt(times);


        for(int i = 0; i <= int_random; i++){
            int randomQuestion = rand.nextInt(times);
            int num = i + 1;
            String enterKey = "Question " + num + ": ";
            System.out.print(enterKey + questions.get(randomQuestion) );
            enterKey = in.nextLine();
            System.out.print(enterKey);
            System.out.print("");

            if(enterKey.equals("")){
                System.out.println("The answer is " + answers.get(randomQuestion) + ".");
            }
        }
        System.out.print("\nComplete!");

        }
}

