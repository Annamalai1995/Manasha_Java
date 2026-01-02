package Core_Java.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo_set {
    public static void main(String[] args) {
        HashSet hs= new HashSet();
        hs.add("Manasha");
        hs.add("VMK");
        hs.add(5.4);
        hs.add("salem");
        System.out.println("HASHSET VALUES:"+hs);
        Iterator it=hs.iterator();
        while (it.hasNext()) //if true
        {
            System.out.println(it.next());
        }
    }
}
