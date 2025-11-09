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
                "nume= " + nume + '\'' +
                ", culoare= " + culoare + '\'' +
                ", pret= " + pret + '\'' +
                ", autonomie= " + autonomie + '\'' +
                ", interfata= " + interfata + '\'' +
                ", stoc= " + stoc +
                ", microfon= " + microfon + '\'' +
                ", true_wireless= " + true_wireless + '\'' +
                ", tip= " + tip + '\'' +
                ", timp_incarcare= " + timp_incarcare + '\'' +
                ", raspuns_in_frecventa= " + raspuns_in_frecventa + '\'' +'}';

    }

}

