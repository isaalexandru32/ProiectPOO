package items;

import java.util.ArrayList;

public class AlarmaSmart extends Gadget {
    private String tip;
    private int nivelSunet;
    private int tensiune;
    private String tipEcran;
    private int greutate;

    //fara parametri
    public AlarmaSmart() {
        super();
        this.tip = "Tip";
        this.nivelSunet = 0;
        this.tensiune = 0;
        this.tipEcran = "LCD";
        this.greutate = 0;
    }

    //cu parametri
    public AlarmaSmart(String nume, String culoare, float pret, int autonomie, String interfata, int stoc,
                       String tip, int nivelSunet, int tensiune, String tipEcran ,int greutate) {
        super(nume, culoare, pret, autonomie, interfata, stoc);
        this.tip = tip;
        this.nivelSunet = nivelSunet;
        this.tensiune = tensiune;
        this.tipEcran = tipEcran;
        this.greutate = greutate;
    }

    //copiere
    public AlarmaSmart(AlarmaSmart other) {
        super(other);
        this.tip = other.tip;
        this.nivelSunet = other.nivelSunet;
        this.tensiune = other.tensiune;
        this.tipEcran = other.tipEcran;
        this.greutate = other.greutate;
    }

    //get
    public String getTip(){ return this.tip; }
    public int getNivelSunet() { return this.nivelSunet; }
    public int getTensiune() { return this.tensiune; }
    public String getTipEcran() {  return this.tipEcran; }
    public int getGreutate() { return this.greutate; }

    //set
    public void setTip(String tip){this.tip = tip;}
    public void setNivelSunet(int nivelSunet) {this.nivelSunet = nivelSunet;}
    public void setTensiune(int tensiune) {this.tensiune = tensiune;}
    public void setTipEcran(String tipEcran) {this.tipEcran = tipEcran;}
    public void setGreutate(int greutate) {this.greutate = greutate;}



    //to string
    @Override
    public String toString() {
        return "AlarmaSmart object{" +
                "nume='" + nume +
                ", culoare='" + culoare +
                ", pret='" + pret +
                ", autonomie='" + autonomie +
                ", interfata='" + interfata +
                ", stoc='" + stoc +
                ", tip='" + tip +
                ", nivelSunet=" + nivelSunet +
                ", tensiune=" + tensiune +
                ", tipEcran='" + tipEcran +
                ", greutate=" + greutate +
                '}';
    }

    public static ArrayList<AlarmaSmart> cautaNivelSunetPret(ArrayList<AlarmaSmart> listaAlarme, int nivelSunet, float pret) {
        ArrayList<AlarmaSmart> rezultat = new ArrayList<>();

        for (AlarmaSmart a : listaAlarme) {
            if (a.getNivelSunet() == nivelSunet && a.getPret() == pret) {
                rezultat.add(a);
            }
        }

        return rezultat;
    }


    // Metoda tensiune tip ecran
    public static ArrayList<AlarmaSmart> cautaTensiuneTipEcran(ArrayList<AlarmaSmart> listaPrize, int tensiune, String tipEcran) {
        ArrayList<AlarmaSmart> rezultat = new ArrayList<>();

        for (AlarmaSmart a : listaPrize) {
            if (a.getTensiune() == tensiune && a.getTipEcran().equalsIgnoreCase(tipEcran)) {
                rezultat.add(a);
            }
        }

        return rezultat;
    }
}


