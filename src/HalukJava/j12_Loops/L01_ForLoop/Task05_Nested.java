package HalukJava.j12_Loops.L01_ForLoop;

public class Task05_Nested {
    public static void main(String[] args) {
        /*
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
şekli print eden code create ediniz

    for (int i=1; i<=5; i++){
        System.out.println("#####");
    }


         */


        for (int apt = 1; apt <= 6; apt++) {//dış döngü

            for (int daire = 1; daire < 6; daire++) {
                System.out.print("# ");
            }
            System.out.println();//dumy->hayalet komut:işlevi olmayan satır atlatan komut
        }

    }
}











