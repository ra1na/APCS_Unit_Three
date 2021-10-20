import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int fNum = scan.nextInt();
        System.out.println("Enter your second number");
        int sNum = scan.nextInt();
        if (fNum > sNum) {
            System.out.print(fNum + " is larger than " + sNum);
        }
        if (fNum == sNum) {
            System.out.print(fNum + " is equal to " + sNum);
        }
        if (sNum > fNum) {
            System.out.print(sNum + " is larger than " + fNum);
        }

        // Prompt the user for two integer variables

        // Create a series of if statements that will print which number is larger or if they are equal
        // Make sure your output matches the samples or the tests will not pass.
    }
}
