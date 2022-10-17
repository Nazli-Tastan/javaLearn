package day06;

public class C07_ForLoop {
    public static void main(String[] args) {
        /*interview questıon
        1'den 100'e kadar olan sayıları yazdırınız ancak sayı kullanmayınız
         */

        String a = " ";

        for (int i = a.length(); i <= 'd'; i++) {
            ;
            System.out.println(i + " ");


        }

        //geçerli 2.çözüm
        int i='d';
        int j='e'-'d';
        for(int x=j; j<=i; j++){
            System.out.println(j);
        }

    }
}