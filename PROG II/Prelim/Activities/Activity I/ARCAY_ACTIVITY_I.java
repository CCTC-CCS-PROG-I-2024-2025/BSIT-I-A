import java.util.Scanner;

class ARCAY_ACTIVITY_I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] names = new String[5];//Stores of the Array.
        System.out.println("Kindly enter the names: ");//Asking the users to input the names.
        System.out.print("1. ");
        names[0] = sc.nextLine();
        System.out.print("2. ");
        names[1] = sc.nextLine();
        System.out.print("3. ");
        names[2] = sc.nextLine();
        System.out.print("4. ");
        names[3] = sc.nextLine();
        System.out.print("5. ");
        names[4] = sc.nextLine();
        
        System.out.print("Choose a name you want to display: ");
        int choose = sc.nextInt(); 
        int choose1 = choose - 1;
        System.out.println("Name: " + (names[choose1]));//Output the name.
        sc.close();
    }
}