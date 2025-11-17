package items;

import java.util.ArrayList;

public class OchelariVR extends Gadget {
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

    public static ArrayList<OchelariVR> cautaPretAuton(ArrayList<OchelariVR> lista, float optPret,int optAuton) {
        ArrayList<OchelariVR> listamod = new ArrayList<OchelariVR>();
        for(OchelariVR vr : lista) {
            if (vr.pret == optPret && vr.autonomie == optAuton) {
                listamod.add(vr);
            }
        }
        return listamod;
    }

    public static ArrayList<OchelariVR> cautaRefreshMem(ArrayList<OchelariVR> lista, int refreshDisplay ,int memInt) {
        ArrayList<OchelariVR> listamod = new ArrayList<OchelariVR>();
        for(OchelariVR vr : lista) {
            if (vr.refreshDisplay == refreshDisplay && vr.memInt == memInt) {
                listamod.add(vr);
            }
        }
        return listamod;
    }

}
