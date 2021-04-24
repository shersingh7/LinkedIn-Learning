import java.util.Scanner;

public class loopsChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess my age: ");
        int number = sc.nextInt();

        if(number == 19) System.out.println("Yes, you are correct");
        else System.out.println("Damn, you don't know my age");
    }
}
