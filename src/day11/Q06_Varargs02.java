package day11;

public class Q06_Varargs02 {
    public static void main(String[] args) {

        carpımAll(11,5.1,14,50,101,1,3,8);
    }
    private static void carpımAll(double ...sayi) {

        double carpım = 1;
        for (double each :sayi) {
           carpım*= each;
        }
        System.out.println("çarpım = " +carpım);





    }
}
