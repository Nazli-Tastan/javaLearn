package j32_Abstract.j32_Abstract.j32_Abstract.Ornek2;

public class Dikdortgen extends Sekil {
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alan() {
        return this.uzunluk * this.genislik;
    }

    @Override
    public double cevre() {
        return (this.uzunluk + this.genislik) * 2;

       /*
        private double uzunKenar;
    private double kisaKenar;
​
    public Dikdortgen(double uzunKenar, double kisaKenar) {//fuul p'li cons
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }
​
    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kisaKenar;
    }
​
    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }
}
        */


    }
}
