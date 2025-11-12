import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter any two numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("The sum is : " + c);

    }
}