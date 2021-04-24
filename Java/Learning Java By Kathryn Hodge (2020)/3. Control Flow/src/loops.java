import javax.sound.midi.SysexMessage;
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number between 1-10: ");
        int number = sc.nextInt();

        if(number >= 0 && number <= 5) System.out.println("The number is between 0-5");
        else System.out.println("The number is between 6-10");

    }
}
