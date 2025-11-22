interface webDevCompany {
  void frontendDeveloper();
  void backendDeveloper();
  void devOps();

};

class myWebDevCompany implements webDevCompany{
    @Override
    public void frontendDeveloper() {
        System.out.println("Frontend Developer is hired");
    }

    @Override
    public void backendDeveloper() {
        System.out.println("Backend Developer is hired");
    }

    @Override
    public void devOps() {
        System.out.println("DevOps engineer is hired");
    }
}

public class interfaces {
    static void main(String[] args) {
        webDevCompany aakashCompany = new myWebDevCompany();
        aakashCompany.backendDeveloper();
        aakashCompany.frontendDeveloper();
    }
}
