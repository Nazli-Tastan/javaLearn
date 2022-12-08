package HalukJava.src.j33_Interface;

import j33_Interface.Sahin;
import j33_Interface.dısDonanım;
import j33_Interface.icDonanım;

import static j33_Interface.Lastik.RENK;

public class Runner {
    public static void main(String[] args) {
        j33_Interface.Sahin dgshn = new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapi();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.koltuk();
        dgshn.motor();
        System.out.println("dgshn.sisLamp() = " + dgshn.sisLamp());//default conc. meth-> obj ile call
        dgshn.sunroof();
        dgshn.yakıt();

        System.out.println("dısDonanım.RENK = " + j33_Interface.dısDonanım.RENK);
        System.out.println("icDonanım.RENK = " + j33_Interface.icDonanım.RENK);
        System.out.println("Lastik.RENK = " +RENK);
       // System.out.println("Lastik.RENK = " + RENK);//-> aynı isimli variable interface name ile call edilir
        //icDonanım.KUMAS="deri";//-> CTE final variable atama ya-pıl-mazzz.
        System.out.println("icDonanım.KUMAS = " + j33_Interface.icDonanım.KUMAS);
        System.out.println("icDonanım.MUSIC = " + icDonanım.MUSIC);
        dısDonanım.anten();//static conc meth Interface name .call

    }
}
