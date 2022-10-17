package day08;

public class C02_Arrays {


    /*
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */
    public static void main(String[] args) {
      /*fatih beuden
        int arr[]={1,2,3,4,5,6,7};


        int toplam=0;
        int ortalama=0;

        for(int i=1; i<arr.length; i++ ){

            toplam+=arr[i];
            ortalama=toplam/arr.length;
        }
        System.out.println("ortalama = " + ortalama);

        for(int i=0; i<arr.length; i++ ){
            if(arr[i]>ortalama) {
                System.out.println(i+" . sayı ortalamadan büyük");
            }}

*/

        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */
        int arr [] = {1,2,3,4,5,6,7};

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }

        double ortalama = toplam/arr.length;
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamadan buyuk olan elemanlar");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                System.out.print(arr[i] + " ");
            }
        }




    }
}