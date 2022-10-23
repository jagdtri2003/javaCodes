import java.util.*;
public class Linked_List {

    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<Integer>();
        a1.add(12);
        a1.add(12);
        a1.add(14);
        a1.remove(0);
        System.out.println(a1);

        Stack s1= new Stack();

        for (int i=0;i<10;i++){
            s1.push(i);
        }
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

    }


}
