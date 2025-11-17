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

        ArrayList<PrizaSmart> listaPrize = new ArrayList<>();

        listaPrize.add(new PrizaSmart("Model A1", "Alb", 50.0f, 24, "WiFi", 15, "Casa", true, "Plastic", 10, 220));
        listaPrize.add(new PrizaSmart("Model A2", "Negru", 55.0f, 30, "WiFi", 10, "Birou", false, "Metal", 12, 230));
        listaPrize.add(new PrizaSmart("Model A3", "Gri", 60.0f, 20, "Bluetooth", 20, "Casa", true, "Plastic", 15, 220));
        listaPrize.add(new PrizaSmart("Model A4", "Rosu", 45.5f, 18, "WiFi", 25, "Garaj", false, "Plastic", 16, 240));
        listaPrize.add(new PrizaSmart("Model A5", "Albastru", 70.0f, 40, "WiFi", 5, "Casa", true, "Metal", 10, 220));
        listaPrize.add(new PrizaSmart("Model A6", "Negru", 49.0f, 22, "Bluetooth", 10, "Birou", true, "Ceramica", 8, 230));
        listaPrize.add(new PrizaSmart("Model A7", "Alb", 52.0f, 26, "WiFi", 12, "Casa", false, "Plastic", 14, 220));
        listaPrize.add(new PrizaSmart("Model A8", "Mov", 65.0f, 30, "WiFi", 18, "Garaj", true, "Metal", 13, 230));
        listaPrize.add(new PrizaSmart("Model A9", "Portocaliu", 68.0f, 33, "Bluetooth", 7, "Birou", false, "Plastic", 10, 220));
        listaPrize.add(new PrizaSmart("Model A10", "Negru", 75.0f, 36, "WiFi", 9, "Casa", true, "Metal", 12, 240));

        
        ArrayList<AlarmaSmart> listaAlarme = new ArrayList<>();

        listaAlarme.add(new AlarmaSmart("Alarm X1", "Alb", 80.0f, 50, "WiFi", 10, "Standard", 70, 3, "LCD", 220));
        listaAlarme.add(new AlarmaSmart("Alarm X2", "Negru", 85.0f, 55, "Bluetooth", 8, "Premium", 75, 4, "LED", 230));
        listaAlarme.add(new AlarmaSmart("Alarm X3", "Gri", 90.0f, 48, "WiFi", 12, "Standard", 65, 5, "LCD", 220));
        listaAlarme.add(new AlarmaSmart("Alarm X4", "Rosu", 95.0f, 60, "WiFi", 5, "Premium", 80, 4, "OLED", 240));
        listaAlarme.add(new AlarmaSmart("Alarm X5", "Albastru", 70.0f, 45, "Bluetooth", 11, "Standard", 60, 3, "LCD", 220));
        listaAlarme.add(new AlarmaSmart("Alarm X6", "Negru", 120.0f, 65, "WiFi", 6, "Smart", 90, 5, "LED", 230));
        listaAlarme.add(new AlarmaSmart("Alarm X7", "Alb", 110.0f, 58, "WiFi", 9, "Smart", 85, 4, "LCD", 220));
        listaAlarme.add(new AlarmaSmart("Alarm X8", "Mov", 95.5f, 52, "Bluetooth", 14, "Standard", 72, 3, "OLED", 240));
        listaAlarme.add(new AlarmaSmart("Alarm X9", "Gri", 88.0f, 47, "WiFi", 10, "Premium", 78, 5, "LCD", 230));
        listaAlarme.add(new AlarmaSmart("Alarm X10", "Negru", 130.0f, 70, "WiFi", 4, "Smart", 95, 4, "LED", 220));


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



