import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();
        System.out.print("Enter Your Age : ");
        int age = input.nextInt();
        System.out.print("Are You a Student : ");
        boolean is_student = input.nextBoolean();
        System.out.println();
        System.out.println("Profile : ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Student : "+is_student);
    }
}