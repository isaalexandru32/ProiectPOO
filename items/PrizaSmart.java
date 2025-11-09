package items;

public class PrizaSmart extends Gadget  {
    private String utilizare;
    private boolean smart;
    private String material;
    private int amperaj;
    private int tensiune;

    //fara
    public PrizaSmart() {
        super();
        this.utilizare = "Casa";
        this.smart = true;
        this.material = "Plastic";
        this.amperaj = 0;
        this.tensiune = 0;
    }

    //cu
    public PrizaSmart(String nume, String culoare, float pret, int autonomie, String interfata, int stoc,
                      String utilizare, boolean smart, String material, int amperaj, int tensiune) {
        super(nume, culoare, pret, autonomie, interfata, stoc);
        this.utilizare = utilizare;
        this.smart = smart;
        this.material = material;
        this.amperaj = amperaj;
        this.tensiune = tensiune;
    }

    //copi
    public PrizaSmart(PrizaSmart other) {
        super(other);
        this.utilizare = other.utilizare;
        this.smart = other.smart;
        this.material = other.material;
        this.amperaj = other.amperaj;
        this.tensiune = other.tensiune;
    }

    //get
    public String getUtilizare(){ return this.utilizare; }
    public boolean getSmart() { return this.smart; }
    public String getMaterial(){ return this.material; }
    public int getAmperaj(){ return this.amperaj; }
    public int getTensiune(){ return this.tensiune; }



    public void setUtilizare(String utilizare){this.utilizare = utilizare;}
    public void setSmart(boolean smart){this.smart = smart;}
    public void setMaterial(String material){this.material = material;}
    public void setAmperaj(int amperaj){this.amperaj = amperaj;}
    public void setTensiune(int tensiune){this.tensiune = tensiune;}


    @Override
    public String toString() {
        return "PrizaSmart object{" +
                "nume='" + nume + '\'' +
                "culoare='" + culoare + '\'' +
                "pret='" + pret + '\'' +
                "autonomie='" + autonomie + '\'' +
                "interfata='" + interfata + '\'' +
                "stoc='" + stoc + '\'' +
                "utilizare='" + utilizare + '\'' +
                ", smart=" + smart +    '\''+
                ", material='" + material + '\'' +
                ", amperaj=" + amperaj +    '\''+
                ", tensiune=" + tensiune +  '\''+
                '}';
    }

}

