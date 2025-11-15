import java.awt.*;

class Teacher {

    //properties
    private int salary;
    private String post ;
    private String Name;

    //methods
    public void printTeacherInfo(){
        System.out.println("Name :" + Name);
        System.out.println("Salary of the teacher is :" + salary);
        System.out.println("POST : " + post);

    }

    //setter
    public void setsalary (int s , String n , String p){
        salary = s;
        Name = n;
        post = p;
    };

    //Getter
    public int getsalary(){
        return salary;
    };
}



public class setterAndGetter {
    static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setsalary(25000 , "Aakash" , "HOD Teacher");
        t1.printTeacherInfo();
    }

}
