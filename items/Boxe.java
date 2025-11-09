package items;
import java.util.ArrayList;

public class Boxe extends Gadget {
    private boolean subwoofer;
    private int nr_difuzoare;
    private int putere_rms;
    private int frecventa_max;
    private int frecventa_min;
    public Boxe() {
        super();
        this.subwoofer = false;
        this.nr_difuzoare = 0;
        this.putere_rms = 0;
        this.frecventa_max = 0;
        this.frecventa_min = 0;
    }
    public Boxe(String nume, String culoare, float pret, int autonomie, String interfata, int stoc, boolean subwoofer, int nr_difuzoare, int putere_max, int frecventa_max, int frecventa_min) {
        super(nume, culoare, pret, autonomie, interfata, stoc);
        this.subwoofer = subwoofer;
        this.nr_difuzoare = nr_difuzoare;
        this.putere_rms = putere_max;
        this.frecventa_max = frecventa_max;
        this.frecventa_min = frecventa_min;
    }
    public Boxe(Boxe gadget) {
        super(gadget);
        this.subwoofer = gadget.subwoofer;
        this.nr_difuzoare = gadget.nr_difuzoare;
        this.putere_rms = gadget.putere_rms;
        this.frecventa_max = gadget.frecventa_max;
        this.frecventa_min = gadget.frecventa_min;
    }

    public void setSubwoofer(boolean subwoofer) { this.subwoofer = subwoofer; }
    public void setNr_difuzoare(int nr_difuzoare) { this.nr_difuzoare = nr_difuzoare; }
    public void setPutere_rms(int putere_rms) { this.putere_rms = putere_rms; }
    public void setFrecventa_max(int frecventa_max) { this.frecventa_max = frecventa_max; }
    public void setFrecventa_min(int frecventa_min) {this.frecventa_min = frecventa_min; }

    public boolean getSubwoofer() { return this.subwoofer; }
    public int getNr_difuzoare() { return this.nr_difuzoare; }
    public int getPutere_rms() {return this.putere_rms; }
    public int getFrecventa_max() {return this.frecventa_max; }
    public int getFrecventa_min() {return this.frecventa_min; }

    @Override
    public String toString() {
        return "Gadget object {" +
                "nume= " + nume + '\'' +
                ", culoare= " + culoare + '\'' +
                ", pret= " + pret + '\'' +
                ", autonomie= " + autonomie + '\'' +
                ", interfata= " + interfata + '\'' +
                ", stoc= " + stoc +
                ", subwoofer= " + subwoofer + '\'' +
                ", nr_difuzoare= " + nr_difuzoare + '\'' +
                ", putere_rs= " + putere_rms + '\'' +
                ", frecventa_max= " + frecventa_max + '\'' +
                ", frecventa_min= " + frecventa_min + '\'' +'}';
    }
   

}


