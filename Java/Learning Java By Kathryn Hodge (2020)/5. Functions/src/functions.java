import java.util.*;
public class functions {

    public static void calSalary(int hours, double rate){

        double salary = hours * rate;

        System.out.println("1 Day: " + salary);
        System.out.println("1 Week: " + salary*5);
        System.out.println("1 year: " + (salary*5)*52);

}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the working hours in a day: ");
        int inHours = sc.nextInt();

        System.out.println("Enter the hourly rate: ");
        double inRate = sc.nextDouble();

        calSalary(inHours,inRate);
    }
}
