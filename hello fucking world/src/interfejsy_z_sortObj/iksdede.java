package interfejsy_z_sortObj;

import java.util.Arrays;

public class iksdede {
    public static void main(String[] args) {

        Object Benq = new Monitor2();
        ((Monitor2) Benq).wlacz();

        Pracownik[] pracownik=new Pracownik[4];

        pracownik[0]=new Pracownik(17000);
        pracownik[1]=new Pracownik(20000);
        pracownik[2]=new Pracownik(1500);
        pracownik[3]=new Pracownik(1800);
        System.out.println(pracownik[0].equals(pracownik[1]));

        for(Pracownik p: pracownik)
            System.out.println(p.getZarobki());
        System.out.println("");
        Arrays.sort(pracownik);
        for(Pracownik p: pracownik)
            System.out.println(p.getZarobki());

        System.out.println(pracownik[0]);

    }

}
interface Monitor
        {
            void wlacz();

            void wylacz();

        }

interface MonitorLepszy
{
    void ZmienBarwe();

}


class Monitor2 implements Monitor, MonitorLepszy
{
    @Override
    public void wylacz() {
        System.out.println("wyl");
    }

    @Override
    public void wlacz() {
        System.out.println("wl");
    }

    @Override
    public void ZmienBarwe() {
        System.out.println("Inna barwa xd");
    }
}

class Pracownik implements Comparable {

    double Zarobki;

    Pracownik(double Zarobki) {
        this.Zarobki = Zarobki;
    }
    double getZarobki(){

        double zarobek=this.Zarobki;
    return zarobek;
    }
    public boolean equals(Object k) {
        Pracownik nowy = ((Pracownik) k);
        if (this.Zarobki == nowy.Zarobki)
            return true;
        else
            return false;
    }
    @Override
    public int compareTo(Object o) {
        Pracownik p=((Pracownik)o);
        if (this.Zarobki<p.Zarobki)
            return -1;
        else if(this.Zarobki>p.Zarobki)
            return 1;

        return 0;
    }

    @Override
    public String toString() {
        return getZarobki()+"";
    }
}