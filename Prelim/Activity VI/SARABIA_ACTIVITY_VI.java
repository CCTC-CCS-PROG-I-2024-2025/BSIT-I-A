import java.util.Scanner;

class SARABIA_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("19");
        int score1 = sc.nextInt();
        System.out.print("100");
        int score2 = sc.nextInt();

        int sum = score1 + score2;
        System.out.println("Sum = " + sum);
        int difference = score1 - score2;
        System.out.println("Difference = " + difference);
        int product = score1 * score2;
        System.out.println("Product = " + product);
    }
}