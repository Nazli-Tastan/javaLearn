package j17_ForEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // 00-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};


for (String i:arr1)
    for (String j:arr2)
        if(i.equalsIgnoreCase(j)){
            System.out.println(i);
        }

    }
}
