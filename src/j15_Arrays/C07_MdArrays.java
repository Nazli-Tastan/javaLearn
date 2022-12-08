package j15_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {


        int arr[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt


        for (int kat=0; kat<arr.length; kat++) {
            int toplam=0;
            for (int daire=0; daire<arr[kat].length; daire++) {
                toplam+=arr[kat][daire];


            }
            System.out.println("kattaki daire toplamı : "+toplam);
        }




    }
}
