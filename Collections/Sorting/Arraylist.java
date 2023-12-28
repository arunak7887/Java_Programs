package Collections;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Arun");
        al.add("Namdev");
        al.add("Shivam");
        al.add("Vijay");
        Collections.sort(al);
        Iterator it=al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }

    
}
