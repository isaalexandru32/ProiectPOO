package items;

import java.util.ArrayList;

public class BoxaPortabila extends Gadget {
    private int putere;
    private int frecvMin;
    private int frecvMax;
    private String dimensiuni;
    private int nrDifuzoare;

    public BoxaPortabila() {
        super();
        putere = 0;
        frecvMin = 0;
        frecvMax = 0;
        dimensiuni = "n/a";
        nrDifuzoare = 0;
    }
    public BoxaPortabila(String nume, String culoare, float pret, int autonomie, String interfata, int stoc, int putere, int frecvMin, int frecvMax, String dimensiuni, int nrDifuzoare) {
        super(nume, culoare, pret, autonomie, interfata, stoc);
        this.putere = putere;
        this.frecvMin = frecvMin;
        this.frecvMax = frecvMax;
        this.dimensiuni = dimensiuni;
        this.nrDifuzoare = nrDifuzoare;
    }
    public BoxaPortabila(BoxaPortabila boxa) {
        super(boxa);
        this.putere = boxa.putere;
        this.frecvMin = boxa.frecvMin;
        this.frecvMax = boxa.frecvMax;
        this.dimensiuni = boxa.dimensiuni;
        this.nrDifuzoare = boxa.nrDifuzoare;
    }

    public void setPutere(int putere) {this.putere = putere;}
    public void setFrecvMin(int frecvMin) {this.frecvMin = frecvMin;}
    public void setFrecvMax(int frecvMax) {this.frecvMax = frecvMax;}
    public void setDimensiuni(String dimensiuni) {this.dimensiuni = dimensiuni;}
    public void setNrDifuzoare(int nrDifuzoare) {this.nrDifuzoare = nrDifuzoare;}

    public int getFrecvMax() {return frecvMax;}
    public String getDimensiuni() {return dimensiuni;}
    public int getNrDifuzoare() {return nrDifuzoare;}
    public int getPutere() {return putere;}
    public int getFrecvMin() {return frecvMin;}

    @Override
    public String toString() {
        return "BoxaPortabila object {" +
                "nume= " + nume + '\'' +
                ", culoare= " + culoare + '\'' +
                ", pret= " + pret + '\'' +
                ", autonomie= " + autonomie + '\'' +
                ", interfata= " + interfata + '\'' +
                ", stoc= " + stoc +
                ", putere= " + putere + '\'' +
                ", frecvMin= " + frecvMin + '\'' +
                ", frecvMax= " + frecvMax + '\'' +
                ", dimensiuni= " + dimensiuni + '\'' +
                ", nrDifuzoare= " + nrDifuzoare + '\'' +'}';
    }
}

