package HalukJava.src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        // size();-> listin eleman saysısını return eder (arr->length)
        ArrayList<String> listSehir = new ArrayList<>(Arrays.asList("Münih", "losAngeles", "Londra", "stockholm"));
        System.out.println(listSehir.size());//4

    }
}
