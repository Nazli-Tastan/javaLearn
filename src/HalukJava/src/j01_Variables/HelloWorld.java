package HalukJava.src.j01_Variables;

public class HelloWorld {

    //main method icinde kullanacaginiz hersey "static" olmalidir.
    public static void main(String[] args) {
        // System.out.println("merhaba dünya");// bu komut konsala yazılan metni print eder

        // dan yazılan ifadeler komut veya kod satırı olraka değil yorum olarak tanımlanır.
       /*
       bu araya yazılan her ifade yorum satırı olur java kod olarak derlemez
       başarı gayrete aşıktır
       bahanesi olanın başarısı olmaz
        */
        /*
        bu gibi şöyle yapılır haluk hoca dediki madem geldin dünyaya otur çalış javaya
         */
//imleçin oldugu satır ctrl+d cmd+d ile alt satıra kopyalanır


        /*
     TRICK -> javada code satırı cümle(statement) sonuna mutlaka  ; koyulmalı
     code satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
     CTE düzeltimeden code yazılmaz yazılan code çalışmaz
    */

        // System.out.println("hata");

//TASK:  ad soyad yas memleket ve meslek print ediniz(console yazdırınız)
        System.out.print("adım soyadım : haluk bilgin");
        System.out.println(" yaşım : 48");
        System.out.println("memeleketim denizli");
        System.out.println("mesleğim  : java developer");

        /*
        TRICK ->
        print-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println-> yazdırma işleminden sonraki komutu ALT satırda devam ettirir.
        javada space "boşluk" bir character olarak tanımlanır
        h a l u k->9 karakter
         */
        //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
        //Ekrana bir sey yazdirmak icin iki tane kod var
        // i)System.out.println() ==> Satirbasi yapar
        // ii)System.out.print() ==> Satirbasi yapmaz
    }


}
