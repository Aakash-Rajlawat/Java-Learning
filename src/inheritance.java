class Teacher1 {
    private int salary;
    public  int name;
    public int age;

    public String votingStatus (){
        if(age>=18){
            return "You can vote";
        }
        else {
            return "You can't vote";
        }
    };
};

class student1 extends Teacher1 {

}



public class inheritance {
    static void main(String[] args) {
        student1 s1 = new student1();
        s1.age = 19;
        System.out.println(s1.votingStatus());
    }
}
