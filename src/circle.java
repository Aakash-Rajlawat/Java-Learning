class Circle1 {
    public double radius;

    public double area(){
        double area;
        return area = Math.PI *radius *radius;
    }
    public double circumference (){
        double circumference;
        return circumference = 2* Math.PI *radius;
    }
    public double perimeter (){
        double perimeter;
        return perimeter = circumference() ;
    }
}

public class circle {
    static void main(String[] args) {
        Circle1 c1 = new Circle1();
        c1.radius = 41;
        System.out.println(c1.area());
        System.out.println(c1.circumference());
        System.out.println(c1.perimeter());
    }
};
