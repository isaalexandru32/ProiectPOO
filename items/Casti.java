package items;
import java.util.ArrayList;

public class Casti extends Gadget {
    private boolean microfon;
    private boolean true_wireless;
    private String tip;
    private int timp_incarcare;
    private int raspuns_in_frecventa;
    public Casti() {
        super();
        this.microfon = false;
        this.true_wireless = false;
        this.tip = "";
        this.timp_incarcare = 0;
        this.raspuns_in_frecventa = 0;
    }
    public Casti(String nume, String culoare, float pret, int autonomie, String interfata, int stoc, boolean microfon, boolean true_wireless, String tip, int timp_incarcare, int raspuns_in_frecventa) {
        super(nume, culoare, pret, autonomie, interfata, stoc);
        this.microfon = microfon;
        this.true_wireless = true_wireless;
        this.tip = tip;
        this.timp_incarcare = timp_incarcare;
        this.raspuns_in_frecventa = raspuns_in_frecventa;
    }
    public Casti(Casti gadget) {
        super(gadget);
        this.microfon = gadget.microfon;
        this.true_wireless = gadget.true_wireless;
        this.tip = gadget.tip;
        this.timp_incarcare = gadget.timp_incarcare;
        this.raspuns_in_frecventa = gadget.raspuns_in_frecventa;
    }

    public void setMicrofon(boolean microfon) { this.microfon = microfon;}
    public void setTrue_wireless(boolean true_wireless) { this.true_wireless = true_wireless;}
    public void setTip(String tip) { this.tip = tip;}
    public void setTimp_incarcare(int timp_incarcare) { this.timp_incarcare = timp_incarcare;}
    public void setRaspuns_in_frecventa(int raspuns_in_frecventa) {this.raspuns_in_frecventa = raspuns_in_frecventa;}

    public boolean getMicrofon() { return this.microfon; }
    public boolean getTrue_wireless() { return this.true_wireless; }
    public String getTip() {return this.tip; }
    public int getTimp_incarcare() {return this.timp_incarcare; }
    public int getRaspuns_in_frecventa() {return this.raspuns_in_frecventa; }

    @Override
    public String toString() {
        return "Casti object {" +
                "nume= " + nume +
                ", culoare= " + culoare +
                ", pret= " + pret +
                ", autonomie= " + autonomie +
                ", interfata= " + interfata +
                ", stoc= " + stoc +
                ", microfon= " + microfon +
                ", true_wireless= " + true_wireless +
                ", tip= " + tip +
                ", timp_incarcare= " + timp_incarcare +
                ", raspuns_in_frecventa= " + raspuns_in_frecventa +'}';

    }

    public static ArrayList<Casti> cautaMicrofon(ArrayList<Casti> listaCasti, String valoare) {
        ArrayList<Casti> rezultat = new ArrayList<>();
        boolean cautaMicrofon = Boolean.parseBoolean(valoare);
        for (Casti a : listaCasti) {
            if (a.getMicrofon() == cautaMicrofon) {
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<Casti> cautaTrueWireless(ArrayList<Casti> listaCasti, String valoare) {
        ArrayList<Casti> rezultat = new ArrayList<>();
        boolean cautaTrueWireless = Boolean.parseBoolean(valoare);
        for (Casti a : listaCasti) {
            if (a.getTrue_wireless() == cautaTrueWireless) {
                rezultat.add(a);
            }
        }
        return rezultat;
    }


    public static ArrayList<Casti> cautaTip(ArrayList<Casti> listaCasti, String valoare) {
        ArrayList<Casti> rezultat = new ArrayList<>();
        for (Casti a : listaCasti) {
            if (a.getTip().equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<Casti> cautaTimpIncarcare(ArrayList<Casti> listaCasti, String valoare) {
        ArrayList<Casti> rezultat = new ArrayList<>();
        for (Casti a : listaCasti) {
            if (a.getTimp_incarcare() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<Casti> cautaRaspunsInFrecventa(ArrayList<Casti> listaCasti,  String valoare) {
        ArrayList<Casti> rezultat = new ArrayList<>();
        for (Casti a : listaCasti) {
            if (a.getRaspuns_in_frecventa() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<Casti> cautaPret(ArrayList<Casti> listaCasti,  String valoare) {
        ArrayList<Casti> rezultat = new ArrayList<>();
        for (Casti a : listaCasti) {
            if (a.getPret() == Float.parseFloat(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }


    public static ArrayList<Casti> cautaCasti(ArrayList<Casti> listaCasti, int optiune, String valoare){

        switch(optiune){
            case 1: return cautaMicrofon(listaCasti, valoare);
            case 2: return cautaTrueWireless(listaCasti, valoare);
            case 3: return cautaTip(listaCasti, valoare);
            case 4: return cautaTimpIncarcare(listaCasti, valoare);
            case 5: return cautaRaspunsInFrecventa(listaCasti, valoare);
            case 6: return cautaPret(listaCasti, valoare);

            default:
                System.out.println("Optiune invalida!");
                return new ArrayList<>();
        }
    }
}
