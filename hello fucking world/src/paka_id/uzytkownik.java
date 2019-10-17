package paka_id;

class  uzytkownik
{
    uzytkownik(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        id=id+nastepna;
        nastepna++;
    }

    int id=1;
    String imie;
    String nazwisko;
    static int nastepna=0;

    void wypisz()
    {
        System.out.println("Id:"+ id + " Imie: "+ this.imie +" Nazwisko: "+ nazwisko);


    }
}