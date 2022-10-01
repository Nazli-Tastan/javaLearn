package BenimJava.j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        //1.yol- best practise(Recomemded)tavsiye edilen
        int yas=48;//int tipinde yas isminde variable tanımlandı
        int maas=33000;
        System.out.println(yas);//48 yas variable call edildi
        System.out.println("yas");//yas
        System.out.println(maas);//33000
        System.out.println("nur hanım başlangıç maaşı " +maas);// nur hanımın maaşı 33000 yazar .Variable açıklaması için+ yazıp ek yazabiliriz
        //2.yol
        int boy;//değeri atanmayan boy isminde bir int tanımlandı
        //System.out.println(boy);//değeri atanmamış değişkeni hiç bir aksiyonda kullanılamaz
        boy=175;
        System.out.println("boyunuz:" +boy);//175
        //  3.yol
        int yevmiye,age,kilo;//birden çok aynı tipte değişken tanımlandı
        age=33;
        yevmiye=1000;
        kilo=99;//tanımlanan değişkenlere değer atandı

        int gunluk=1500, yil=2022,agırlık=99;
                //TRICK bir variable bir defa atanır birden fazla değer atanır
        System.out.println(gunluk);//1500
        gunluk=1800;//günlük değeri update edildi
        System.out.println("gunluk son değeri:"+gunluk);//1800
        System.out.println("gunluk değeri:"+gunluk+"yıl değeri:"+yil+yas+yevmiye+agırlık);


    }
}
