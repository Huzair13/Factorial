import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Nth value !!");

        int N=scanner.nextInt();

        int fact=factorial(N);
        System.out.println("The Factorial of the given number is : "+fact);
    }

    private static int factorial(int n) {
        if(n<1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}