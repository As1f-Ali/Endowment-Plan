import java.util.Scanner;

public class Variable
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = input.nextInt();
        int num = 21;
        double num2 = 56.0f;
        String name = "Asif Ali";
        char Character = 'A';
        System.out.println(age);
        System.out.println("Number is : " + num);
        System.out.println(name);
        System.out.println(Character);
    }
}