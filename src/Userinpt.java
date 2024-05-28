import java.util.Scanner;
import java.lang.String;
public class Userinpt {
    public static void main(String[] args) {
        int number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        number1=sc.nextInt();
        System.out.print("Enter second number : ");
        number2=sc.nextInt();
        System.out.println("Sum of Two number is :"+ (number1+number2));
        String firstName,midName;
        System.out.print("Enter Your first name : ");
        firstName=sc.next();
        System.out.print("Enter Your mid name : ");
        midName=sc.next();
        System.out.println("Your name is : " + firstName+midName);
    }
}
