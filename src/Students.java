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
        String[] classNames = {"Avion", "Brielle", "Chanel", "Kim", "Regina", "Nancy", "Daisy", "Chance", "Erykah", "Mari", "Lisia", "Manny", "Sarah", "Danny","Tiffany","Allie","Walter","Candance","Fannie","Naomi"};
        String[] homeTowns = {"Arizona", "Boston", "California", "Kansas", "Rhode Island", "New York", "Dakota", "Chicago", "New Englad", "Maine", "Las Vegas", "Mayland", "Seattle", "Denver", "Tennesse", "Alabama", "Wiscosin", "Connecticut", "Florida", "Nebraska"};
        String[] favFoods = {"apple", "banana", "carrot", "kale", "rice", "noodles", "donut", "chocolate", "eggplant", "mango", "licorice", "madarian orange", "sandwich", "dumplings", "toffee", "apricot", "watermelon", "coconut", "fish", "nachos"};


        System.out.println("Welcome to the TechHire 2017 class!");
        System.out.println();

        do {
            try {
                System.out.print("Which student would you like to learn about? Please enter (1-20): ");
                System.out.println();
                studentNum = scan.nextInt();
                scan.nextLine();

                System.out.println("Your student is: " + classNames[studentNum - 1]);
                System.out.println();

                System.out.println("What would you like to learn about them? Enter 'hometown' or 'favorite food':");
                System.out.println();
                userLearns = scan.nextLine();

                if (userLearns.contains("home")) {
                    System.out.println("Your student's hometown is " + homeTowns[studentNum - 1] + ".");
                    System.out.println();
                }

                if (userLearns.contains("food")) {
                    System.out.println("Your student's ultimate favorite food is " + favFoods[studentNum - 1] + ".");
                    System.out.println();
                }

                System.out.print("Would you like to learn more about another student? Enter (Y/N)");
                System.out.println();
                answer = scan.nextLine();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This is not a valid student number, please try again!");
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("This data is invalid, please try again!");
                scan.nextLine();
            }
        } while (answer.equalsIgnoreCase("Y"));

    }
}

