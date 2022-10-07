package HalukJava.j12_Loops.L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

       /*

        eger bir döngünün body sinde bir döngü bulunuyorsa bu tür döngülere
        Nested-Loop -> içiçe döngü denir içiçe döngülerde en içteki döngü önce çalışır


         */

        for (int apt=0; apt<=10; apt++){
            System.out.println("dış döngü:" +apt);
        for (int daire=1; daire<6;daire++){
            System.out.println("apt"+apt+"için iç gödü daire:" +daire);
        }

        }
























    }
}
