
package basicjava;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-3);
        number.add(30);
        number.add(92);
        number.add(0);
        number.add(2);
        
        System.out.println("before sorting:"+number);
        Collections.sort(number);
        System.out.println("after sorting in assending:"+number);
        
        Collections.sort(number,Collections.reverseOrder());
        
        System.out.println("after sorting in desinding:"+number);
    }
    
}
