import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String name ;
        System.out.println("Enter Your Name:");
        name = s.nextLine();
        System.out.println("Hello Mr. "+name);
    }
}