package HalukJava.j12_Loops.L01_ForLoop;

public class Task11_Nested {
    public static void main(String[] args) {




        char c = 'A';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(c+j));
            }
            System.out.println();
        }










    }
}
