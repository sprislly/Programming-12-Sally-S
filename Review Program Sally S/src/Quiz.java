import java.util.ArrayList;
//put the ui into an array list
//random pick of questions






public class Quiz {
    public static ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<Question> quiz;
    Quiz(int numberOfQuestions) {
        quiz = new ArrayList<>();
        generateRandomQuestionList(numberOfQuestions);
        runQuiz();

    }

    private void runQuiz() {
        for (Question q :quiz){
            int questionNumber = 1;
            for (Question q : quiz) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Question: " + questionNumber);

            }
        }

    }

    private void generateRandomQuestionList(int numberOfQuestions){
        for (int i = 0; i < numberOfQuestions; i++)
            int random = (int)(Math.random() * questions.size());
            while(quiz.contains((questions.get(random))){
                random = (int)(Math.random() * question.size());
        }
            quiz.add(questions.get(random));
    }

}