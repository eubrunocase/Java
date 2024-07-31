package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetNaoOrdenado {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.0);
        conjunto.add(10);
        conjunto.add(true);
        conjunto.add("Bruno");

        System.out.println(conjunto.size());

        conjunto.remove(10);
        conjunto.remove(1.0);
        System.out.println(conjunto.size());

        Set conjunto2 = new HashSet();

        conjunto2.add(5.0);
        conjunto2.add("Zaira");
        conjunto2.add(false);
        System.out.println(conjunto2.size());

        conjunto.addAll(conjunto2);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);


    }
}
