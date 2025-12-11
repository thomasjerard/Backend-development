package projects.quiz;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    int[] userSelections = new int[5];
    int score = 0;

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", 3);
        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", 2);
        questions[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", 1);
        questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", 4);
        questions[4] = new Question(5, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Pb", 1);
    }   

    public void playQuiz(){
        int i=0;
        Scanner sc = new Scanner(System.in);
        for(Question question: questions){
            System.out.println("Qus " + question.getId() + " : " + question.getQuestionString());
            System.out.println(1 + ". " + question.getOption1());
            System.out.println(2 + ". " + question.getOption2());
            System.out.println(3 + ". " + question.getOption3());
            System.out.println(4 + ". " + question.getOption4());
            userSelections[i++] = Integer.parseInt(sc.nextLine());
        }
        sc.close();
    }

    public void printScore(){
        for(int i=0; i<5; i++){
            if(questions[i].getCorrectOption() == userSelections[i]){
                score+=1;
            }
        }    
        System.out.println("Score: " + score);
    }
}
