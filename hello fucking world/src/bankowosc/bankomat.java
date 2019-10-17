package bankowosc;

public class bankomat {

 public static void main(String[] args){


  saldo a=new saldo();

  a.wplata(20);
  a.wyplata(50);
  a.wypisz();

  System.out.println();



  String imie = "Arek";
  String imie2=imie;

  System.out.println(imie2);
 }
}
class saldo {
 saldo()

 {
  saldo=1000;
 }
 saldo(int kwota)

 {
  saldo=kwota;
 }

 private int saldo;


 int getSaldo()
 {
  int wyciago=saldo;
  return wyciago;
 }

 void setSaldo(int kwota)
 {

  saldo=kwota;


 }

 void wplata(int kwota)
 {

  int dodatnie=getSaldo()+kwota;
  setSaldo(dodatnie);

 }

 void wyplata(int kwota)
 {

  int ujemne=getSaldo()-kwota;
  setSaldo(ujemne);

 }

 void wypisz()
 {

  int aktualna=getSaldo();
  System.out.println("Aktualny stan konta wynosi: "+ aktualna);
 }


}