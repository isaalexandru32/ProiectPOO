package items;
import java.io.Serializable;

public class Gadget implements Manageable {
    String nume;
    String culoare;
    float pret;
    int autonomie;
    String interfata;
    int stoc;

    public Gadget() {
        this.nume = "n/a";
        this.culoare = "n/a";
        this.pret = 0.0f;
        this.autonomie = 0;
        this.interfata = "n/a";
        this.stoc = 0;
    }
    public Gadget(String nume, String culoare, float pret, int autonomie, String interfata, int stoc) {
        this.nume = nume;
        this.culoare = culoare;
        this.pret = pret;
        this.autonomie = autonomie;
        this.interfata = interfata;
        this.stoc = stoc;
    }
    public Gadget(Gadget gadget) {
        this.nume = gadget.nume;
        this.culoare = gadget.culoare;
        this.pret = gadget.pret;
        this.autonomie = gadget.autonomie;
        this.interfata = gadget.interfata;
        this.stoc = gadget.stoc;
    }

    //getteri
    public String getNume(){ return this.nume; }
    public String getCuloare(){ return this.culoare; }
    public float getPret(){return this.pret; }
    public int getAutonomie(){return this.autonomie; }
    public String getInterfata(){return this.interfata; }
    public int getStoc(){return this.stoc; }

    public void setNume(String nume){ this.nume = nume;}
    public void setCuloare(String culoare){ this.culoare = culoare;}
    public void setPret(float pret){ this.pret = pret;}
    public void setAutonomie(int autonomie){ this.autonomie = autonomie;}
    public void setInterfata(String interfata){this.interfata = interfata;}
    public void setStoc(int stoc){ this.stoc = stoc;}

    @Override
    public String toString() {
        return "Gadget object {" +
                "nume= " + nume +
                ", culoare= " + culoare +
                ", pret= " + pret +
                ", autonomie= " + autonomie +
                ", interfata= " + interfata +
                ", stoc= " + stoc + '}';
    }


    public void removeStoc(int cantitate){
        this.stoc -= cantitate;
    }

    public void updateProd(Object obj) {
        System.out.println("under construction");
    }

    public void addStoc(int cantitate){
        this.stoc += cantitate;
    }
}