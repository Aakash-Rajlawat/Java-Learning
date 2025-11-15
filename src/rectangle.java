class rectangle1{
    public int length;
    public int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class rectangle {
    static void main(String[] args) {
        rectangle1 r1 = new rectangle1();
        rectangle1 r2 = new rectangle1();
        r1.length = 6;
        r1.breadth = 17;
        r2.length = 89;
        r2.breadth = 67;
        System.out.println("The area is : " + r1.area());
        System.out.println("The perimeter is : " + r1.perimeter());
        System.out.println("The length was : " + r1.length);
        System.out.println("The breadth was : " + r1.breadth);
        System.out.println("----------------------------------------------");
        System.out.println("The area is : " + r2.area());
        System.out.println("The perimeter is : " + r2.perimeter());
        System.out.println("The length was : " + r2.length);
        System.out.println("The breadth was : " + r2.breadth);
    }
}