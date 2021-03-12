/*
Assignment: Lab #6
Description: Expression Evaluator
Name: Omar Nunez
ID: 921572389
Class: CSC 211-02
Semester: Spring 2021
 */
import java.util.Scanner;
public class ExpressionEvaluator {
        public static void main(String[] args) {

        double input1, input2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first operand:");

        input1 = scanner.nextDouble();
        System.out.print("Enter the second operand:");
        input2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double result;
        System.out.println("** checking if " + operator +" is a valid operator...");

        switch(operator)
        {
            case '+':
                result = input1 + input2;
                break;

            case '-':
                result = input1 - input2;
                break;

            case '*':
                result = input1 * input2;
                break;

            case '/':
                result = input1 / input2;
                break;
            default:
                System.out.println("You have entered wrong operator");

                return;

        }

        System.out.println(input1+" "+operator+" "+input2+"= "+result);
    }
}
