package items;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class OchelariVR extends Gadget implements Serializable {
     String tipDisplay;
     String dimensiuneDisplay;
     int refreshDisplay;
     int memInt;
     String compatibilitate;

    public OchelariVR() {
        super();
        this.tipDisplay = "n/a";
        this.dimensiuneDisplay = "n/a";
        this.refreshDisplay = 0;
        this.memInt = 0;
        this.compatibilitate = "n/a";
    }

    public OchelariVR(String nume, String culoare, float pret, int autonomie, String interfata, int stoc, String tipDisplay, String dimensiuneDisplay, int refreshDisplay, int memInt, String compatibilitate) {
        super(nume, culoare, pret, autonomie, interfata, stoc);
        this.tipDisplay = tipDisplay;
        this.dimensiuneDisplay = dimensiuneDisplay;
        this.refreshDisplay = refreshDisplay;
        this.memInt = memInt;
        this.compatibilitate = compatibilitate;
    }

    public OchelariVR(OchelariVR vr) {
        super(vr);
        this.tipDisplay = vr.tipDisplay;
        this.dimensiuneDisplay = vr.dimensiuneDisplay;
        this.refreshDisplay = vr.refreshDisplay;
        this.memInt = vr.memInt;
        this.compatibilitate = vr.compatibilitate;
    }

    public void setTipDisplay(String tipDisplay) {this.tipDisplay = tipDisplay;}
    public void setDimensiuneDisplay(String dimensiuneDisplay) {this.dimensiuneDisplay = dimensiuneDisplay;}
    public void setRefreshDisplay(int refreshDisplay) {this.refreshDisplay = refreshDisplay;}
    public void setMemInt(int memInt) {this.memInt = memInt;}
    public void setCompatibilitate(String compatibilitate) {this.compatibilitate = compatibilitate;}

    public String getTipDisplay() {return tipDisplay;}
    public String getDimensiuneDisplay() {return dimensiuneDisplay;}
    public int getRefreshDisplay() {return refreshDisplay;}
    public int getMemInt() {return memInt;}
    public String getCompatibilitate() {return compatibilitate;}

    @Override
    public String toString() {
        return "OchelariVR object {" +
                "nume= " + nume +
                ", culoare= " + culoare +
                ", pret= " + pret +
                ", autonomie= " + autonomie +
                ", interfata= " + interfata +
                ", stoc= " + stoc +
                ", tipDisplay= " + tipDisplay +
                ", dimensiuneDisplay= " + dimensiuneDisplay +
                ", refreshDisplay= " + refreshDisplay +
                ", memInt= " + memInt +
                ", compatibilitate= " + compatibilitate +'}';
    }

     public static ArrayList<OchelariVR> cautaTipDisplay(ArrayList<OchelariVR> listaOchelariVR, String valoare) {
        ArrayList<OchelariVR> rezultat = new ArrayList<>();
        for (OchelariVR a : listaOchelariVR) {
            if (a.getTipDisplay().equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<OchelariVR> cautaDimensiuneDisplay(ArrayList<OchelariVR> listaOchelariVR, String valoare) {
        ArrayList<OchelariVR> rezultat = new ArrayList<>();
        for (OchelariVR a : listaOchelariVR) {
            if (a.getDimensiuneDisplay().equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<OchelariVR> cautaRefreshDisplay(ArrayList<OchelariVR> listaOchelariVR,  String valoare) {
        ArrayList<OchelariVR> rezultat = new ArrayList<>();
        for (OchelariVR a : listaOchelariVR) {
            if (a.getRefreshDisplay() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<OchelariVR> cautaMemInt(ArrayList<OchelariVR> listaOchelariVR,  String valoare) {
        ArrayList<OchelariVR> rezultat = new ArrayList<>();
        for (OchelariVR a : listaOchelariVR) {
            if (a.getMemInt() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<OchelariVR> cautaCompatibilitate(ArrayList<OchelariVR> listaOchelariVR,  String valoare) {
        ArrayList<OchelariVR> rezultat = new ArrayList<>();
        for (OchelariVR a : listaOchelariVR) {
            if (a.getCompatibilitate().equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<OchelariVR> cautaPret(ArrayList<OchelariVR> listaOchelariVR,  String valoare) {
        ArrayList<OchelariVR> rezultat = new ArrayList<>();
        for (OchelariVR a : listaOchelariVR) {
            if (a.getPret() <= Float.parseFloat(valoare)+100 && a.getPret() >= Float.parseFloat(valoare)-100){
                rezultat.add(a);
            }
        }
        return rezultat;
    }


    public static ArrayList<OchelariVR> cautaOchelariVR(ArrayList<OchelariVR> listaOchelariVR, int optiune, String valoare){

        switch(optiune){
            case 1: return cautaTipDisplay(listaOchelariVR, valoare);
            case 2: return cautaDimensiuneDisplay(listaOchelariVR, valoare);
            case 3: return cautaRefreshDisplay(listaOchelariVR, valoare);
            case 4: return cautaMemInt(listaOchelariVR, valoare);
            case 5: return cautaCompatibilitate(listaOchelariVR, valoare);
            case 6: return cautaPret(listaOchelariVR, valoare);

            default:
                System.out.println("Optiune invalida!");
                return new ArrayList<>();
        }
    }
    
    public static void scrieFisierOVR(ArrayList<OchelariVR> listaOVR, String numeFisier) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(numeFisier));
            oos.writeObject(listaOVR);
            System.out.println("S-a scris");
            oos.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<OchelariVR> citesteOVRFisier(String numeFisier){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(numeFisier));
            return (ArrayList<OchelariVR>) ois.readObject();
        } catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
