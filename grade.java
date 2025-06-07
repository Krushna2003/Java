import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the student's score (0-1000): ");
            int score = scanner.nextInt();

            if (score < 0 || score > 1000) {
                System.out.println("Invalid score. Please enter a value between 0 and 1000.");
                return;
            }

            String grade = (score >= 900) ? "A+" :
                           (score >= 800) ? "A" :
                           (score >= 700) ? "B+" :
                           (score >= 600) ? "B" :
                           (score >= 500) ? "C+" :
                           (score >= 400) ? "C" :
                           (score >= 300) ? "D" :
                           (score >= 200) ? "E" :
                           "F";

            System.out.println("The student's grade is: " + grade);
        }
    }
}