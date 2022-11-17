package j33_Interface.j33_Interface.task01;

import j33_Interface.task01.Sekil;

public class Cember implements Sekil {
    int PI=3;
    public int cevre(int... boyut) {
        return (int) (2*PI*boyut[0]);
    }


    public int alan(int... boyut) {
        return (int) (PI*boyut[0]*boyut[0]);
    }
}
