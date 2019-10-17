package butelka;

public class glowna {
    public static void main(String[] args) {

        Butelka[] butelka= new Butelka[50];

        for(int x=0;x<butelka.length;x++)
        butelka[x]=new Butelka(40);

        butelka[0].wlej(17);
        System.out.println(butelka[0].getIleLitrow());

        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());
        butelka[1].przelej(40,butelka[2]);
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());
    }
}

    class Butelka {
        private double ileLitrow;
        Butelka() {
        }
        Butelka(double ileLitrow) {
            this.ileLitrow = ileLitrow;
        }
        double getIleLitrow()
        {
            return ileLitrow;

        }
        double wlej(double x) {
            double y=0;
            if(ileLitrow+x<=60)
                ileLitrow+=x;
            else {
                y=ileLitrow;
                ileLitrow = 60;
                return y+x-60;
            }
            return 0;

        }

        boolean wylej(double x) {
            if(x<=ileLitrow)
                ileLitrow -= x;
            else
                return false;
            return true;
        }
        void przelej(double ile,Butelka gdzieP)
        {
            if(this.wylej(ile)==true)
            {
                ile=(gdzieP.wlej(ile));
                this.wlej(ile);
                if(ile!=0)
                    System.out.println("Nie udało się przelać "+ile+" l. wody");
            }
            else
                System.out.println("Za malo wody w pierwszyej butelce");
        }

    }