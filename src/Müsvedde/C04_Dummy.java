package Müsvedde;

import java.util.Scanner;

public class C04_Dummy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        String id, login_id;
        int pass, login_pass;

        //KAYIT
        System.out.println("Kullanıcı adını giriniz");
        id = input.nextLine();

        System.out.println("Şifreniz");
        pass = input.nextInt();
        input.nextLine();

        System.out.println("Hoşgeldiniz" + "Lütfen Giriş Yapınız");

        //LOGİN
        System.out.println("Kullanıcı adınız");
        login_id = input.nextLine();
        System.out.println("Şifreniz");
        login_pass = input.nextInt();

        if (login_pass == pass && login_id.equals(id) == true)
            System.out.println("Giriş Başarılı");
        if (login_pass != pass || login_id.equals(id) == false)
            System.out.println("giriş başarılı");





    }
}
