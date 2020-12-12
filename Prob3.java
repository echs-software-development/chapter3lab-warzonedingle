import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

    System.out.println("What is your weight in pounds");

    double weight = scan.nextDouble();

    System.out.println("What is your height in inches");

    double height = scan.nextDouble();

    final double KILOGRAMS_PER_POUND = 0.45359237; 
    final double METERS_PER_INCH = 0.0254; 
    
    // Compute BMI
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double BMI = weightInKilograms/(heightInMeters * heightInMeters);

    // Display result using if, else if and else
   
   if (BMI >= 18.5 && BMI <= 25.0)
   {
     System.out.println("BMI is normal");
   }
   else if (BMI >= 25.0 && BMI < 30.0)
   {
     System.out.println("BMI is overweight");
   }
   else
   {
     System.out.println("BMI is obese");
   }
  }
}