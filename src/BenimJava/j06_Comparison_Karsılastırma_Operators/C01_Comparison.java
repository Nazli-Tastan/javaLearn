package BenimJava.j06_Comparison_Karsılastırma_Operators;

public class C01_Comparison {
    public static void main(String[] args) {


    /*

    ==     Esit               x == y
    !=     Esit degil         x != y
    >      buyuk              x > y
    <      kucuk              x < y
    >=     buyuk esit         x >= y
    <=     kücük esit         x <= y

    */

        int slmYs=33;
        int krmYs=41;

        System.out.println("krm b esit mi slm b-"+(krmYs==slmYs));//fals

        String name="kerem bey";
        String name1="kerem bey";
        System.out.println(name==name1);


        String s1="Kerem bey";
        String s2="kerem bey";

        System.out.println(s1==s2);



    }
}
