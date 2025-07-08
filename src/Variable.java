import java.util.Scanner;

public class Variable
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        int num = 21;
        double num2 = 56.0f;
        String name = "Asif Ali";
        char character = 'A';
        System.out.println("Age is: " + age);
        System.out.println("First number is : " + num);
        System.out.println("Name: " + name);
        System.out.println("Character: " + character);
        System.out.printf("Second number is: " + num2);
    }
}