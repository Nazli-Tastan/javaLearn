package J99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args)throws IOException {

       // task->dosyayı okuyup consola creat ediniz

       /*
        Path nzl=Path.of("src/J99_Lambda/nazli");//erişilecek dosya pathi verildi

        Stream<String> akıs= Files.lines(nzl);
        akıs.forEach(System.out::println);//AKISTAKİ LİNE LAR YAZDIRILDI

        //TASK 02-> TASKI BÜYÜK HARF YAZDIRINIZ
        System.out.println("\n   ***TASK 02 DOSYASINI BÜYÜK HARFLERELE OKUYUNUZ");
        Files.lines(Paths.get("src/J99_Lambda/nazli"))
        .map(String::toUpperCase).
        forEach(System.out::println);

        //TASK 03- >dosyanın küçük harferele yazdırılması
        System.out.println("\n   ***TASK 02 DOSYASINI BÜYÜK HARFLERELE OKUYUNUZ");
        Files.lines(Paths.get("src/J99_Lambda/nazli"))
                .map(String::toLowerCase).
                forEach(System.out::println);
//ilkini bul
        System.out.println("\n   ***TASK 02 DOSYASINI BÜYÜK HARFLERELE OKUYUNUZ");
        Files.lines(Paths.get("src/J99_Lambda/nazli"))
                .map(String::toLowerCase).
               findFirst();

        //task "başarı" kelimesi kaç defa gecer
        System.out.println("\n   ***TASK 02 DOSYASINI BÜYÜK HARFLERELE OKUYUNUZ");
        System.out.println(Files.lines(Paths.get("src/J99_Lambda/nazli"))
                .filter(t -> t.contains("başarı")).
                count());


        */

//TASK 01 --> haluk dosyasini okuyunuz.(Console'a print ediniz.)
            System.out.println("\n TASK 01 --> haluk dosyasini okuyunuz ");
            Path hlk = Path.of("src/J99_Lambda/haluk");//erişilecek dosyanın path'i tanımlandı
            Stream<String> akıs = Files.lines(hlk);
            //Stream<String> akıs1= Files.lines(Path.of("src/J99_Lambda/haluk"));

            akıs.//erişimi verilen dasyadaki satırlar akısa alındı
                    forEach(System.out::println);//akısdaki satırlar(lines) print edildi

            //TASK 02 --> haluk.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print ediniz.)
            System.out.println("\n TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz ");
            Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                    map(String::toUpperCase).//akısdaki  satırların Stringleri byk hrf update edildi
                    forEach(System.out::println);

            //TASK 03 --> haluk dosyasindaki ilk satiri kucuk harflerle print ediniz..
            System.out.println("\n TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz.. ");

            Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                    map(String::toLowerCase).//akısdaki  satırların Stringleri kck hrf update edildi
                    limit(1).//akısdaki ilk eleman(ilk satır) alındı
                    //  findFirst();//akısdaki ilk eleman(ilk satır) alındı
                            forEach(System.out::println);

            //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
            System.out.println("\n TASK 04 --> haluk dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print ediniz.");

            System.out.println(Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                    map(String::toLowerCase).//akısdaki  satırların Stringleri kck hrf update edildi
                    filter(t -> t.contains("basarı")).//akısdaki elemanların basarı içerenleri filtrelendi
                    count()//akısdaki elelmanlar saydırıldı
            );


        }
    }


