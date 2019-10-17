package paka_id;

public class glowna {
    public static void main(String[] args) {

        uzytkownik pierwszy = new uzytkownik("Jacek", "Kalin");
        uzytkownik drugi = new uzytkownik("Barbara", "Osiol");
        uzytkownik trzeci = new uzytkownik("Bonifacy", "Pararara");

        System.out.println(pierwszy.id);
        System.out.println(drugi.id);
        System.out.println(trzeci.id);

        pierwszy.wypisz();
        drugi.wypisz();
    }
}
