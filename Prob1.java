import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){

  Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer:");
  int n = scan.nextInt();

    if ( !( n >= 5 && n <= 76))
      System.out.println("True");

  else
    System.out.println("False");
  }
}