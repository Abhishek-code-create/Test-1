
//write a java code to check if the input number is prime or composite  
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (n <= 1) {
            System.out.println("Not prime or composite.");
        } if (count == 2) {
            System.out.println("Prime number.");
        } else {
            System.out.println("Composite number.");
        }

        sc.close();
    }
}

