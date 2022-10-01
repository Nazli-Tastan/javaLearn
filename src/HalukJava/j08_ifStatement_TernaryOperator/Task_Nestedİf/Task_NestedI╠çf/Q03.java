package HalukJava.j08_ifStatement_TernaryOperator.Task_Nestedİf.Task_NestedI;

import java.util.Scanner;

public class
Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */


        Scanner sc = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        double kilo= sc.nextDouble();
        System.out.print("Boyunuzu giriniz : ");
        double boy = sc.nextDouble();

        if(kilo/(boy*boy)<=20){
                System.out.println("oldukça zayıfsınız");
        }

           if (kilo/(boy*boy)>20){
                if(kilo/(boy*boy)<=25)
                        System.out.println("Normal sinirlardasiniz");
            }
            if (kilo/boy*boy > 25) {
                    if(kilo/(boy*boy)<=30)
                            System.out.println("Sisman kategorisindesiniz");
            }else{
                    System.out.println("Obez grubundasınız");
            }

    }

}
