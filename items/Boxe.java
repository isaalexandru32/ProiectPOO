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
    public Boxe(String nume, String culoare, float pret, int autonomie, String interfata, int stoc, boolean subwoofer, int nr_difuzoare, int putere_rms, int frecventa_max, int frecventa_min) {
        super(nume, culoare, pret, autonomie, interfata, stoc);
        this.subwoofer = subwoofer;
        this.nr_difuzoare = nr_difuzoare;
        this.putere_rms = putere_rms;
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
                "nume= " + nume +
                ", culoare= " + culoare +
                ", pret= " + pret +
                ", autonomie= " + autonomie +
                ", interfata= " + interfata +
                ", stoc= " + stoc +
                ", subwoofer= " + subwoofer +
                ", nr_difuzoare= " + nr_difuzoare +
                ", putere_rms= " + putere_rms +
                ", frecventa_max= " + frecventa_max +
                ", frecventa_min= " + frecventa_min +'}';
    }

    public static ArrayList<Boxe> cautaSubwoofer(ArrayList<Boxe> listaBoxe, String valoare) {
        ArrayList<Boxe> rezultat = new ArrayList<>();
        boolean cautaSubwoofer = Boolean.parseBoolean(valoare);
        for (Boxe a : listaBoxe) {
            if (a.getSubwoofer() == cautaSubwoofer) {
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<Boxe> cautaNrDifuzoare(ArrayList<Boxe> listaBoxe, String valoare) {
        ArrayList<Boxe> rezultat = new ArrayList<>();
        for (Boxe a : listaBoxe) {
            if (a.getNr_difuzoare() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }


    public static ArrayList<Boxe> cautaPutereRms(ArrayList<Boxe> listaBoxe,  String valoare) {
        ArrayList<Boxe> rezultat = new ArrayList<>();
        for (Boxe a : listaBoxe) {
            if (a.getPutere_rms() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<Boxe> cautaFrecventaMax(ArrayList<Boxe> listaBoxe,  String valoare) {
        ArrayList<Boxe> rezultat = new ArrayList<>();
        for (Boxe a : listaBoxe) {
            if (a.getFrecventa_max() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<Boxe> cautaFrecventaMin(ArrayList<Boxe> listaBoxe,  String valoare) {
        ArrayList<Boxe> rezultat = new ArrayList<>();
        for (Boxe a : listaBoxe) {
            if (a.getFrecventa_min() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<Boxe> cautaPret(ArrayList<Boxe> listaBoxe,  String valoare) {
        ArrayList<Boxe> rezultat = new ArrayList<>();
        for (Boxe a : listaBoxe) {
            if (a.getPret() == Float.parseFloat(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }


    public static ArrayList<Boxe> cautaBoxe(ArrayList<Boxe> listaBoxe, int optiune, String valoare){

        switch(optiune){
            case 1: return cautaSubwoofer(listaBoxe, valoare);
            case 2: return cautaNrDifuzoare(listaBoxe, valoare);
            case 3: return cautaPutereRms(listaBoxe, valoare);
            case 4: return cautaFrecventaMax(listaBoxe, valoare);
            case 5: return cautaFrecventaMin(listaBoxe, valoare);
            case 6: return cautaPret(listaBoxe, valoare);

            default:
                System.out.println("Optiune invalida!");
                return new ArrayList<>();
        }
    }
}

