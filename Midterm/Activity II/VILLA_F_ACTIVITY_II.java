import java.util.Scanner;

class VILLA_F_ACTIVITY_II {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        if(age >= 0 && age <= 11) {
            System.out.println("child");
        }
        else if(age >= 12 && age <= 17) {
            System.out.println("Teen");
        }
        else if(age >= 18 && age <= 64) {
            System.out.println("Adult");
        }    
        else if(age <0) {
            System.out.println("fetus ka?");
       }

    sc.close();
    }

}
