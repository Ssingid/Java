package loopsconditionss;

import java.util.Scanner;

public class AgeClassifier {

    public static void classifyAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        }
        else {
            System.out.println("Adult");
        }
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Age");
        int personAge=s.nextInt();

        classifyAge(personAge);
    }
}

