import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        ((ArrayList<String>) list).add("a");
        ((ArrayList<String>) list).add("b");
        ((ArrayList<String>) list).add("c");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
