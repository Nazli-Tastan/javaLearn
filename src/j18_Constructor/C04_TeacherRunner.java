package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {
        C04_Teacher ogrt1= new C04_Teacher();//1.ögretmen create edildi
        ogrt1.ad="Muharrem";
        ogrt1.soyad="Tastan";
        ogrt1.branş="QA";
        ogrt1.emekli=false;
        ogrt1.maaş=23000;
        ogrt1.tecrübe=11;
        System.out.println(ogrt1);

    }


}
