public class objektowe1 {
    public static void main(String[] args) {

        Monitor pierwszy = new Monitor();

        pierwszy.szerokosc = 421;
        pierwszy.wysokosc = 121;

        Monitor a = new Monitor(15,23);

        System.out.println("szerokosc a: "+a.wysokosc);
        System.out.println("wysokosc a: "+a.szerokosc);

        System.out.println("Wysokosc monitora: "+pierwszy.wysokosc);
        System.out.println("Szerokosc monitora: "+pierwszy.szerokosc);


        int[] testowaxd = {5, 18, 6, 13};

        int suma=0;
        for(int xddd: testowaxd)
        {
            suma+=xddd;
        }
        System.out.print("Suma to "+suma);
        System.out.println("\n");
        Monitor tescik_pusty= new Monitor();
    }
}
     class Monitor {

         Monitor()
         {
             System.out.println("konstruktor bezwarunkowy raz xd");


         }
         Monitor(int szerokosc,int wysokosc){
             System.out.println("Przyklad");
            this.szerokosc=szerokosc;
            this.wysokosc=wysokosc;


         }

         int szerokosc;
         int wysokosc;

}



