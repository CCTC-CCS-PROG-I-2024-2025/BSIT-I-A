import java.util.Scanner;

class DELAPEÑA_ACTIVITY_II {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("What is your Age");
      System.out.print("age: ");
      int age = sc.nextInt();

      if(age >=0 && age <=11){
      System.out.println("Child");
      }
      else if(age >=12 && age <=17){
        System.out.println("Teen");
      }
      else if (age >=18 && age <=64){
        System.out.println("Adult");
      }
    }
  }
  