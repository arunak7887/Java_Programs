package Collections.Sorting;
import java.util.*;
public class ReverseSort {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");
        Collections.sort(al,Collections.reverseOrder());
        Iterator it=al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
    
}
