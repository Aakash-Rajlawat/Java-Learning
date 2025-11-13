import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age, yrsToWait;
        System.out.println("Enter your age :");
        age = s.nextInt();
        if (age>18 || age == 18) {
            System.out.println("You can vote");
        }
        else {
            yrsToWait = 18 - age;
            System.out.println("No! you still have to wait "+ yrsToWait + " yrs");
        }

    }
}