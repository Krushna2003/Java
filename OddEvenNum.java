import java.util.Scanner;

public class OddEvenNum{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // this line of code contains the scanner object , which is use for user input

        
        System.out.print("Enter a number: ");    // here user can enter a number
        int number = scanner.nextInt();       // this line of code takes the input from the user and stores it in the variable 'number'

    
        if (number % 2 == 0) {    //(number % 2 == 0)  in this 
                                 // condition, we check if the number is divisible by 2
                                // If it is, then the number is even.

            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();  //close the scanner class
    }
}