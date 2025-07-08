package main_endowment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface extends Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Endowment Id: ");
        String endowmentId = input.nextLine();

        System.out.print("Enter Holder Name: ");
        String holderName = input.nextLine();

        System.out.println("\nEndowment Types Are: \nEducational \nHealth\n");

        System.out.print("Enter Endowment Type: ");
        String endowmentType = input.nextLine();

        switch (endowmentType.toLowerCase()) {
            case "educational":
                System.out.print("Enter Registration Date: ");
                String registrationDate = input.nextLine();

                System.out.print("Enter Educational Institute: ");
                String educationalInstitution = input.nextLine();

                System.out.println("\nEducational Divisions are: \nSchool \nUnderGraduate \nPostGraduate \n");

                System.out.print("Enter Educational Division: ");
                String educationalDivision = input.nextLine();

                EducationalEndowment ee = new EducationalEndowment(endowmentId,holderName,endowmentType,registrationDate,educationalInstitution,educationalDivision);

                double amount = ee.calculateEndowment();
                if (amount == 0) {
                    System.out.println("Invalid educational division entered.");
                } else {
                    System.out.printf("Endowment Amount: \n%.2f",amount);
                }
                break;


            case "health":
                System.out.print("Enter Registration Date: ");
                String registrationDate1 = input.nextLine();

                System.out.print("Enter Health Care Center: ");
                String healthCareCenter = input.nextLine();

                int holderAge;

                try {
                    System.out.print("Enter Holder Age: ");
                    holderAge = input.nextInt();
                    if (holderAge < 0){
                        throw new Exception("Age should be positive");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid age entered. Please enter a valid integer.");
                    input.close();
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

                HealthEndowment he = new HealthEndowment(endowmentId,holderName,endowmentType,registrationDate1,healthCareCenter,holderAge);

                System.out.printf("Endowment Amount: \n%.2f", he.calculateEndowment());

                break;

            default:
                System.out.println(endowmentType + " is not an invalid endowment type");
        }
        input.close();
    }
}