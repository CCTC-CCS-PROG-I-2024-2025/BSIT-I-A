import java.util.Scanner;

class ANGCO_ACTIVITY_VI {
     
      public static void main (String[ ] args) {
     Scanner sc = new Scanner (System.in);
     
     System.out.print("Please Enter First Number: ");
     int num1 = sc.nextInt();
     System.out.print("Please Enter Second Number:");
     int num2 = sc.nextInt();

     int sum = num1 + num2;
     int diff = num1 - num2;
     int prod = num1 + num2;

     System.out.println("Sum - "+ sum);
     System.out.println("Difference - " + diff);
     System.out.println("Product - " + prod);
    }
}
