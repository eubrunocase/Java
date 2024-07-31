package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetOrdenado {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<String>();

       lista.add("Bruno");
       lista.add("Zaira");

       for (String devs : lista) {
          System.out.println(devs);
       }

       


    }
}
