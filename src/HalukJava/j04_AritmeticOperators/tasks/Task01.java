package HalukJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;
        x += x;
        --x;
        x = 7 + x;
        x *= x;
        x -= 3;

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;
        a+=d;
        d-=a;
        a-=d;

        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
        


        /*ödev
        int a=13;
        int b=14;
        System.out.println(a<b);



            int c=17;
            int d=20;
            System.out.println(c<d);

           // task 16
            int e=13;
            int f=13;
            System.out.println(e<=f);
             //task 17
            int num1=10;
            int num2=12;
            System.out.println(num1==num2);

            //task18
            //Scanner dp new Scanner(System.in);
            //Scanner.out.println("iki değer giriniz");
            //double numa=dp.nextDouble();
            //double numb=dp.nextDouble();
            //System.out.println(numa==numb);

            //task 19

            String s1="Apple";
            String s2="Apple";
            System.out.println(s1==s2);

            //task20
            float f1=14;
            float f2=17;
            System.out.println(f1<=f2|| f1<f2);

            //task21
            double d1=14.23;
            double d2=19.52;
            System.out.println(!(d1==d2));

            //task22
String s3="Techno Study";
String s4="Techno Study";
            System.out.println(s3!=s4);

            //task23

            double d3=14.23;
            double d4=14.23;
            System.out.println((d3<d4));

            //task 24
        int i1=120;
        int i2=158;
            System.out.println(i1<i2);
            
            

*/







	}

}
