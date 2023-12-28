package Collections.Sorting;
import java.util.*;
public class Wapper {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(Integer.valueOf(201));
        al.add(Integer.valueOf(101));
        Collections.sort(al);
        Iterator itr=al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
    
}
