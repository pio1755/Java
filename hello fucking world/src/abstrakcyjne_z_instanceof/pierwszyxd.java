package abstrakcyjne_z_instanceof;


public class pierwszyxd {

    public static void main(String[] args) {

        Osoba[] osoby = new Osoba[5];
        osoby[0] = new Pracownik("Franek", "Dudek", 1500);
        osoby[1] = new Student("Grzegorz", "Frankowski");
        osoby[2] = new Pracownik("Denis", "Bobek", 71500);


        for(Osoba osoba: osoby){

            if(osoba instanceof Pracownik) {
                ((Pracownik)osoba).Opis();
                System.out.println("");
            }
            else if(osoba instanceof Student){
                ((Student)osoba).Opis();
                System.out.println("");
            }
        }

    }
}
        abstract class Osoba {
            String imie;
            String nazwisko;

            Osoba(String imie, String nazwisko)
            {
                this.imie=imie;
                this.nazwisko=nazwisko;
            }

            abstract void Opis();
        }


        class Pracownik extends Osoba
        {
            int Zarobki;
            Pracownik(String imie, String nazwisko,int Zarobki)
            {
                super(imie, nazwisko);
                this.Zarobki=Zarobki;
            }

            void praca(){

                System.out.println("Pracuje sobie");
            }

            @Override
            void Opis() {
                System.out.println("Jestem Pracownikiem");
                System.out.println("Mam na imie: "+imie);
                System.out.println("Mam na nazwisko:"+nazwisko);
                System.out.println("Zarabiam: "+Zarobki);
                praca();
            }

        }

        class Student extends Osoba
        {
            Student(String imie, String nazwisko)
            {
                super(imie,nazwisko);
            }

            @Override
            void Opis() {
                System.out.println("Jestem biednym studentem xd");
                System.out.println("Mam na imie: "+imie);
                System.out.println("Mam na nazwisko:"+nazwisko);
            }
        }


