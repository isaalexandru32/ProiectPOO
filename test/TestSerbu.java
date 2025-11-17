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


        }

    }





