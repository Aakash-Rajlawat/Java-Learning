class Student1 {
    int rollNo ;
    String name ;
    String Subject;
    float m1 ,m2 ,m3 ;

    public float total (){
        return m1+m2+m3;
    };

    public float average (){
        return total()/3;
    };
    public char grade (){
      float avg = average();
        if (avg > 70) {
            return 'A';
        } else if (avg > 60 && avg <= 70) {
            return 'B';
        } else if (avg > 50 && avg <= 60) {
            return 'C';
        } else if (avg > 40 && avg <= 50) {
            return 'D';
        } else if (avg <= 40) {
            return 'F';
        } else {
            System.out.println("Please enter a valid grade between 0 to 100.");
            return 0;
        }



    };
};



public class student {
    static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.rollNo = 13;
        s1.name = "Aakash Rajlawat";
        s1.m1 = 67;
        s1.m2 = 68;
        s1.m3 = 67;
        System.out.println("Mr." + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Average :" + s1.average());
        System.out.println("Grade :" + s1.grade());
        System.out.println("Total :" + s1.total());

    }

}
