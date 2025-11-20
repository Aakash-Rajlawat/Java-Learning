abstract class parent {
    public parent(){
        System.out.println("Parent Constructor");
    }
    public void meth1(){
        System.out.println("Method1 of Parent Constructor");
    }

    abstract public void meth2();


}

class sub extends parent {
    public void meth2(){
         System.out.println("Method2 of the sub class");
    }

}


public class abstractClass {
    public static void main(String[] args) {
        parent p1 = new sub();
        p1.meth1();
        p1.meth2();
    }
}
