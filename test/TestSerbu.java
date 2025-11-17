package test;
import items.*;

public class TestSerbu {
    public static void main(String[] args){

        PrizaSmart p1 = new PrizaSmart();
        PrizaSmart p2 = new PrizaSmart("Priza wifi", "Alba", 69.420f, 24, "WIFI", 67,
                "Priza", true, "plastic", 10, 220);
        PrizaSmart p3 = new PrizaSmart(p2);

        System.out.println("Instante prize");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        System.out.println("\nInstante alarme: ");
        AlarmaSmart a1 =  new AlarmaSmart();
        AlarmaSmart a2 =  new AlarmaSmart("Alarma smart", "Aurie", 69.2f, 48, "Bluetooth",
                20, "smart", 80, 5, "LCD",250);
        AlarmaSmart a3 =  new AlarmaSmart();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\nCauta dupa amperaj si tensiune");
        var rez1 = PrizaSmart.cautaAmperajTensiune(listaPrize, 10, 220);
        for (PrizaSmart p : rez1) System.out.println(p);

        System.out.println("\nCauta dupa smart si pret");
        var rez2 = PrizaSmart.cautaSmartPret(listaPrize, true, 50.0f);
        for (PrizaSmart p : rez2) System.out.println(p);

        System.out.println("\nCauta dupa nivelSunet si pret");
        var rez3 = AlarmaSmart.cautaNivelSunetPret(listaAlarme, 80, 95.0f);
        for (AlarmaSmart a : rez3) System.out.println(a);

        System.out.println("\ncauta dupa tensiune si tipEcran");
        var rez4 = AlarmaSmart.cautaTensiuneTipEcran(listaAlarme, 5, "LCD");
        for (AlarmaSmart a : rez4) System.out.println(a);
        }

    }




