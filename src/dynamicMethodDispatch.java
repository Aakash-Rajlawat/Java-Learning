class america {
    public void hello() {
        System.out.println("Hello from America");
    }

    public void welcome() {
        System.out.println("Welcome to America");
    }
}

class nepal extends america {
    public void hello() {
        System.out.println("Hello from Nepal");
    }

    public void bye() {
        System.out.println("Goodbye from Nepal");
    }
}

public class dynamicMethodDispatch {
    static void main(String[] args) {
        america n1 = new nepal();
        n1.hello();
        n1.welcome();

    }
}
