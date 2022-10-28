package Müsvedde;

import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */


            ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(8,7,9,6,7));
            ArrayList<Integer> list2 = new ArrayList<Integer>(List.of(6,7,12,3,1));
            List<Integer> listortak = new ArrayList<Integer>();
            System.out.println(OrtakBul(list1, list2, (ArrayList<Integer>) listortak));



        }

        private static ArrayList<Integer> OrtakBul(ArrayList<Integer> list1, ArrayList<Integer> list2,ArrayList<Integer> listortak) {

            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (list1.get(i) == list2.get(j) &&!listortak.contains(list1.get(i)) ) {      //ortak eleman olup ortaklistte olmayan demek
                        listortak.add(list1.get(i));

                    }

                }
            }

        return listortak;
        }



    }

