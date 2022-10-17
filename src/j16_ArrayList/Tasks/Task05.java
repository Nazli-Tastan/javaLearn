package j16_ArrayList.Tasks;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task05 {
    public static void main(String[] args) {

        /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

CÜNEYT BEYDEN;

        String [][] str=  {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        List<String> name=new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                name.add(str[i][j]);
            }
        }
        Collections.sort(name);
        System.out.println(name);

      */
/*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */

        /*
        String isimArr[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        yeniList(isimArr);//[Ali, Ayse, Can, Hasan, Suzan, Veli]


    }//main sonu

    public static ArrayList<String> yeniList(String[][] isimArr) {
        List<ArrayList> isimList = new ArrayList<>();//boş list

        for (int i = 0; i < isimArr.length; i++) {//kat kontrolu
            for (int j = 0; j < isimArr[i].length; j++) {// her katın daire kontrolu
                isimList.add(isimArr[i][j]);//her katın her dairesindeki eleman döngü ile alınıp boş liste atandı
            }
        }
        System.out.println("isimList = " + isimList);//sırlama öncesi ->[Ali, Veli, Ayse, Hasan, Can, Suzan]

        Collections.sort(isimList);//isimList maturel sıralandı
        System.out.println("isimList = " + isimList);//sıralama sonrası ->[Ali, Ayse, Can, Hasan, Suzan, Veli]
        return isimList;

         */
    }


    }
