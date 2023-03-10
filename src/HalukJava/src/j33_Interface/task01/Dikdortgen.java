package HalukJava.src.j33_Interface.task01;

import j33_Interface.task01.Sekil;

public class Dikdortgen implements Sekil {



    public int cevre(int... boyut) {
        if (boyut.length==1){//varrags a grilen parametre 1 tane ise kare cevre  hesapla
            return (boyut[0]*4);
        }else //varargsa girilen parametre 1 tane değil se dikdörtgen cevre hesapla
            return (boyut[0]+boyut[1])*2;
    }


    public int alan(int... boyut) {
        if (boyut.length==1){//varrags a grilen parametre 1 tane ise kare alanı hesapla
            return (boyut[0]*boyut[0]);
        }else//varargsa girilen parametre 1 tane değil se dikdörtgen alan hesapla
            return (boyut[0]*boyut[1]);
    }
}
