import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        // REPLACE WITH YOUR CODE HERE
        int val = 1;
        for(int i=x;i>0;i--){
            val *= i;
        }
        return val;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double AnayE = 0.0;
        int counter = 0;
        while(Math.E - AnayE > 0.00000000001){
            AnayE += 1/ (factorial(counter));
            counter++;
        }
        // REPLACE WITH YOUR CODE HERE
        return AnayE;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 10.0;
        double m;
        while (n * n <= x - 0.001 || n * n >= x + 0.001){
            m = (n + x/n)/2;
            n=m;
            System.out.println(n);
        }
        // REPLACE WITH YOUR CODE HERE
        return n;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
        System.out.println("Enter a positive Number! ");
        double userNum = Double.parseDouble(scan.next());
        System.out.println("The square root of " + userNum + " is approximately " + babylonian(userNum));
        System.out.println("The value of e is roughly " + calculateE());
        

        scan.close();
    }
}
