package app;
import java.util.Scanner;
import items.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<PrizaSmart> listaPrize = InitListe.initPrizeSmart();      //SERBU
        for(PrizaSmart ps : listaPrize) System.out.println(ps);
        ArrayList<AlarmaSmart> listaAlarme = InitListe.initAlarmeSmart();
        for(AlarmaSmart als : listaAlarme) System.out.println(als);

        System.out.println("\n Utilizare");
        var r1 = PrizaSmart.cautaUtilizare(listaPrize, "Casa");
        for (PrizaSmart p : r1) System.out.println(p);

        System.out.println("\nSmart");
        var r2 = PrizaSmart.cautaSmart(listaPrize, "true");
        for (PrizaSmart p : r2) System.out.println(p);

        System.out.println("\nMaterial");
        var r3 = PrizaSmart.cautaMaterial(listaPrize, "Plastic");
        for (PrizaSmart p : r3) System.out.println(p);

        System.out.println("\nAmperaj");
        var r4 = PrizaSmart.cautaAmperaj(listaPrize, "10");
        for (PrizaSmart p : r4) System.out.println(p);

        System.out.println("\nTensiune");
        var r5 = PrizaSmart.cautaTensiune(listaPrize, "220");
        for (PrizaSmart p : r5) System.out.println(p);

        System.out.println("\nPret");
        var r6 = PrizaSmart.cautaPret(listaPrize, "50.0");
        for (PrizaSmart p : r6) System.out.println(p);

        System.out.println("\n1-Utilizare 2-Smart 3-Material 4-Amperaj 5-Tensiune 6-Pret");
        int optiune = input.nextInt();
        System.out.println("Introduceti valoarea dorita: ");
        String valoare = input.next();


        ArrayList<OchelariVR> listaOchelariVR = InitListe.initOchelariVR();      //ISAIA
        for(OchelariVR o : listaOchelariVR){
            System.out.println(o.toString());
        }
        ArrayList<BoxaPortabila> listaBoxePortabile = InitListe.initBoxePortabile();
        for(BoxaPortabila o : listaBoxePortabile){
            System.out.println(o.toString());
        }

        var rezOc1 = OchelariVR.cautaPretAuton(listaOchelariVR,599.99f, 120);
        var rezOc2 = OchelariVR.cautaRefreshMem(listaOchelariVR, 90, 0);
        System.out.println("Rezultate pret 599.99f, autonomie 120\n");
        for (OchelariVR o : rezOc1) System.out.println(o);
        System.out.println("Rezultate refresh 90, memint 0\n");
        for (OchelariVR o : rezOc2) System.out.println(o);

        var rezBp1 = BoxaPortabila.cautaPretAuton(listaBoxePortabile, 179.99f, 20);
        var rezBp2 = BoxaPortabila.cautaPutereDifuzoare(listaBoxePortabile, 30, 4);
        System.out.println("Rezultate pret 179.99f, autonomie 20\n");
        for (BoxaPortabila o : rezBp1) System.out.println(o);
        System.out.println("Rezultate putere 30, nr difuzoare 4\n");
        for (BoxaPortabila o : rezBp2) System.out.println(o);

        ArrayList<Boxe> listaBoxe = InitListe.initBoxe();     //AURELIAN
        for(Boxe box : listaBoxe){
            System.out.println(box.toString());
        }
        ArrayList<Casti> listaCasti = InitListe.initCasti();
        for(Casti c : listaCasti){
            System.out.println(c.toString());
        }

        System.out.println("Cautare dupa putere rms si nr difuzoare\n");
        var rezBoxe1 = Boxe.cautareNrDifuzoare(listaBoxe,2,80);
        for (Boxe o : rezBoxe1) System.out.println(o);

        System.out.println("Cautare dupa frecventa min si max\n");
        var rezBoxe2 = Boxe.cautareFrecventa(listaBoxe,18000,50);
        for (Boxe o : rezBoxe2) System.out.println(o);

        System.out.println("Cautare dupa frecventa min si max\n");
        var rezCasti1 = Casti.cautareTimpIncarcare(listaCasti,2,20000);
        for (Casti p : rezCasti1) System.out.println(p);

        System.out.println("Cautare dupa frecventa min si max\n");
        var rezCasti2 = Casti.cautareTrueWireless(listaCasti,true,true);
        for (Casti p : rezCasti2) System.out.println(p);

        ArrayList<Reportofon> listaReportofon = InitListe.initReportofon();     //ROMEO
        for(Reportofon r : listaReportofon){
            System.out.println(r.toString());
        }

        ArrayList<MiniCameraVideo> listaMiniCameraVideo = InitListe.initMiniCameraVideo();
        for(MiniCameraVideo m : listaMiniCameraVideo){
            System.out.println(m.toString());
        }

    }
}

