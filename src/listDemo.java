import java.util.ArrayList;
import java.util.List;

public class listDemo {
    static void main(String[] args) {
        ArrayList<Integer> al1 =new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(30,40,50,60));
        al1.add(40);
        al1.add(0,79);
        al1.addAll(1,al2);
        System.out.println(al1);
        System.out.println(al1.contains(67));
        System.out.println(al1.get(3));
        System.out.println(al1.getLast());
        System.out.println(al1.indexOf(40));
        System.out.println(al1.lastIndexOf(40));
        System.out.println("The elements in line :");
        for (int i = 0; i < al1.size(); i++) { //Using for loop we can print each element

            System.out.println(i+ ". " + al1.get(i));
        }
    }
}
