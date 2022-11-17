package j32_Abstract.j32_Abstract.j32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    }

    public Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();

    @Override
    public String toString() {
        return "ismi =" + this.name +
                "\n Alan = " + this.alan() +
                "\n Cevre = " + this.cevre();
    }

    public void ciz() {
        System.out.println(this.name + "çizildi...");

      /*
        private  String name;
​
    public Sekil() {//p'siz parent cons
    }
​
    public Sekil(String name) {//p'li parent cons
        setName(name);
    }
​
    public String getName() {
        return name;
    }
​
    public void setName(String name) {
        this.name = name;
    }

    public  abstract double alanHesapla();
    public  abstract double cevreHesapla();
    public void ciz(){
        System.out.println(this.name+ " cizildi ");
    }
​
    @Override
    public String toString() {//obj value'leri print eder
        return
                "sekil isim ='" + this.name + '\'' +
                        "\n sekil alanı : "+this.alanHesapla()+
                        "\n sekil cevre : "+this.cevreHesapla();

       */

    }
}
