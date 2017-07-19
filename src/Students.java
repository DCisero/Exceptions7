/**
 * Created by D.Cisero on 7/18/17.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentNum = 0;
        String userLearns = "";
        String answer = "Y";

        //create the arrays
        String[] classNames = {"Avion", "Brielle", "Chanel"};
        String[] homeTowns = {"Arizona", "Boston", "California"};
        String[] favFoods = {"apple", "banana", "carrot"};


        System.out.println("Welcome to the TechHire 2017 class!");
        System.out.println();

        do {
            try {
                System.out.print("Which student would you like to learn about? Please enter (1-3): ");
                System.out.println();
                studentNum = scan.nextInt();
                scan.nextLine();

                System.out.println("Your student is: " + classNames[studentNum - 1]);
                System.out.println();

                System.out.println("What would you like to learn about them? Enter 'hometown' or 'favorite food':");
                System.out.println();
                userLearns = scan.nextLine();

            //try {
                if (userLearns.contains("home")) {
                    System.out.println("Your student's hometown is " + homeTowns[studentNum - 1] + ".");
                    System.out.println();
                }

                if (userLearns.contains("food")) {
                    System.out.println("Your student's ultimate favorite food is " + favFoods[studentNum - 1] + ".");
                    System.out.println();
                }
            //}
            //catch (InputMismatchException e) {
                //System.out.println("This data is invalid, please try again!");
            //}

                System.out.print("Would you like to learn more about another student? Enter (Y/N)");
                System.out.println();
                answer = scan.nextLine();

            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("This is not a valid student number, please try again!");
                System.out.println();
            }
        } while (answer.equalsIgnoreCase("Y")) ;
    }
}

