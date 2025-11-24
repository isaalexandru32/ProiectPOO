package items;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class BoxaPortabila extends Gadget implements Serializable {
    public int putere;
    public int frecvMin;
    public int frecvMax;
    public String dimensiuni;
    public int nrDifuzoare;

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
                "nume= " + nume +
                ", culoare= " + culoare +
                ", pret= " + pret +
                ", autonomie= " + autonomie +
                ", interfata= " + interfata +
                ", stoc= " + stoc +
                ", putere= " + putere +
                ", frecvMin= " + frecvMin +
                ", frecvMax= " + frecvMax +
                ", dimensiuni= " + dimensiuni +
                ", nrDifuzoare= " + nrDifuzoare + '}';
    }

     public static ArrayList<BoxaPortabila> cautaPutere(ArrayList<BoxaPortabila> listaBP, String valoare) {
        ArrayList<BoxaPortabila> rezultat = new ArrayList<>();
        for (BoxaPortabila a : listaBP) {
            if (a.getPutere() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<BoxaPortabila> cautaFrecvMin(ArrayList<BoxaPortabila> listaBP, String valoare) {
        ArrayList<BoxaPortabila> rezultat = new ArrayList<>();
        for (BoxaPortabila a : listaBP) {
            if (a.getFrecvMin() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<BoxaPortabila> cautaFrecvMax(ArrayList<BoxaPortabila> listaBP,  String valoare) {
        ArrayList<BoxaPortabila> rezultat = new ArrayList<>();
        for (BoxaPortabila a : listaBP) {
            if (a.getFrecvMax() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<BoxaPortabila> cautaDimensiuni(ArrayList<BoxaPortabila> listaBP,  String valoare) {
        ArrayList<BoxaPortabila> rezultat = new ArrayList<>();
        for (BoxaPortabila a : listaBP) {
            if (a.getDimensiuni().equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<BoxaPortabila> cautaNrDifuzoare(ArrayList<BoxaPortabila> listaBP,  String valoare) {
        ArrayList<BoxaPortabila> rezultat = new ArrayList<>();
        for (BoxaPortabila a : listaBP) {
            if (a.getNrDifuzoare() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<BoxaPortabila> cautaPret(ArrayList<BoxaPortabila> listaBP,  String valoare) {
        ArrayList<BoxaPortabila> rezultat = new ArrayList<>();
        for (BoxaPortabila a : listaBP) {
            if (a.getPret() <= Float.parseFloat(valoare)+100 && a.getPret() >= Float.parseFloat(valoare)-100){
                rezultat.add(a);
            }
        }
        return rezultat;
    }


    public static ArrayList<BoxaPortabila> cautaBoxePortabile(ArrayList<BoxaPortabila> listaBP, int optiune, String valoare){

        switch(optiune){
            case 1: return cautaPutere(listaBP, valoare);
            case 2: return cautaFrecvMin(listaBP, valoare);
            case 3: return cautaFrecvMax(listaBP, valoare);
            case 4: return cautaDimensiuni(listaBP, valoare);
            case 5: return cautaNrDifuzoare(listaBP, valoare);
            case 6: return cautaPret(listaBP, valoare);

            default:
                System.out.println("Optiune invalida!");
                return new ArrayList<>();
        }
    }
    
    public static void scrieFisierBP(ArrayList<BoxaPortabila> listaBP, String numeFisier) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(numeFisier));
            oos.writeObject(listaBP);
            System.out.println("S-a scris");
            oos.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<BoxaPortabila> citesteBPFisier(String numeFisier){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(numeFisier));
            return (ArrayList<BoxaPortabila>) ois.readObject();
        } catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
