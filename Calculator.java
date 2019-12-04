import java.util.Scanner;

public class Calculator {
    public static void main (String args[])
    {
        Scanner myscnr = new Scanner(System.in);
        double firstOp;
        double secondOp;
        int userInput;
        double reSult;
        reSult = 0;

        /*
        * I created two double precision floating point for each operand, as requested.
        *
        * The userInput needs to be tracked in order to engage the switch statement.
        *
        * The result, "reSult", needed to be initialized as 0 in order to use within
        * the switch statement in order to be utilized in this manner.
        */

        System.out.println("Enter first operand:");
        firstOp = myscnr.nextDouble();
        System.out.println("Enter second operand:");
        secondOp = myscnr.nextDouble();

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Which operation do you want to perform?");
        userInput = myscnr.nextInt();

        /*
        * I thought the switch statement would be the most efficient way
        * to cycle through the calculator menu in order to perform the
        * intended operations.
        *
        * If the calculator were a recurring program, instead of a single run,
        * I would have used a method to call the result of the operation
        * instead of using repeat code. This seemed more efficient in this case.
        */

        switch (userInput)
        {
            case 1:
                reSult = firstOp + secondOp;
                System.out.println("The result of the operation is " + reSult + ". Goodbye!");
                break;
            case 2:
                reSult = firstOp - secondOp;
                System.out.println("The result of the operation is " + reSult + ". Goodbye!");
                break;
            case 3:
                reSult = firstOp * secondOp;
                System.out.println("The result of the operation is " + reSult + ". Goodbye!");
                break;
            case 4:
                reSult = firstOp / secondOp;
                System.out.println("The result of the operation is " + reSult + ". Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid selection! Terminating program.");
        }
    }
}
