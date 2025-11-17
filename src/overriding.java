class hello {
    public void display(){
        System.out.println("Hello");
    }

}

class welcome extends hello {
    public void display(){
        System.out.println("Welcome");
    }

}


public class overriding {
    static void main(String[] args) {
        hello w1 = new welcome();
        w1.display();
    }
}
