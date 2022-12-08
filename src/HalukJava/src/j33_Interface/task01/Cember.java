package HalukJava.src.j33_Interface.task01;

import j33_Interface.task01.Sekil;

import static HalukJava.src.j33_Interface.task01.Sekil.PI;

public class Cember implements Sekil {

    public int cevre(int... boyut) {
        return (int) (2*PI*boyut[0]);
    }


    public int alan(int... boyut) {
        return (int) (PI*boyut[0]*boyut[0]);
    }
}
