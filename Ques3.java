//write a java program to print the given pattern .
// *
// **
// ***
// ****
// *****

public class Ques3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // rows
            for (int j = 1; j <= i; j++) { // stars in each row
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }
}
