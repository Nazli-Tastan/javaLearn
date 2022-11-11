package Müsvedde;

import java.util.ArrayList;

public class ÖrnekMutableImmutable {
    public static void main(String[] args) {


        ArrayList<Integer> value = new ArrayList<>();
        value.add(4);
        value.add(5);
        value.set(1, 6);
        value.remove(0);
        for (Integer v : value) {
            System.out.println(v);
        }
    }

}
