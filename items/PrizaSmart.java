package items;

import java.util.ArrayList;

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
                "nume='" + nume +
                ", culoare='" + culoare +
                ", pret='" + pret +
                ", autonomie='" + autonomie +
                ", interfata='" + interfata +
                ", stoc='" + stoc +
                ", utilizare='" + utilizare +
                ", smart=" + smart +
                ", material='" + material +
                ", amperaj=" + amperaj +
                ", tensiune=" + tensiune +
                '}';
    }

    public static ArrayList<PrizaSmart> cautaUtilizare(ArrayList<PrizaSmart> listaPrize, String valoare) {
        ArrayList<PrizaSmart> rezultat = new ArrayList<>();

        for (PrizaSmart p : listaPrize) {
            if(p.getUtilizare().equalsIgnoreCase(valoare)) {
              rezultat.add(p);
            }
        }

        return rezultat;
    }

    public static ArrayList<PrizaSmart> cautaSmart(ArrayList<PrizaSmart> listaPrize, String valoare) {
        ArrayList<PrizaSmart> rezultat = new ArrayList<>();

        for (PrizaSmart p : listaPrize) {
            if(p.getSmart() == Boolean.parseBoolean(valoare)) {
                rezultat.add(p);
            }
        }

        return rezultat;
    }

    public static ArrayList<PrizaSmart> cautaMaterial(ArrayList<PrizaSmart> listaPrize, String valoare) {
        ArrayList<PrizaSmart> rezultat = new ArrayList<>();

        for (PrizaSmart p : listaPrize) {
            if(p.getMaterial().equalsIgnoreCase(valoare)) {
                rezultat.add(p);
            }
        }

        return rezultat;
    }

    public static ArrayList<PrizaSmart> cautaAmperaj(ArrayList<PrizaSmart> listaPrize, String valoare) {
        ArrayList<PrizaSmart> rezultat = new ArrayList<>();

        for (PrizaSmart p : listaPrize) {
            if(p.getAmperaj() == Integer.parseInt(valoare)) {
                rezultat.add(p);
            }
        }

        return rezultat;
    }

    public static ArrayList<PrizaSmart> cautaTensiune(ArrayList<PrizaSmart> listaPrize, String valoare) {
        ArrayList<PrizaSmart> rezultat = new ArrayList<>();

        for (PrizaSmart p : listaPrize) {
            if(p.getTensiune() == Integer.parseInt(valoare)) {
                rezultat.add(p);
            }
        }

        return rezultat;
    }

    public static ArrayList<PrizaSmart> cautaPret(ArrayList<PrizaSmart> listaPrize, String valoare) {
        ArrayList<PrizaSmart> rezultat = new ArrayList<>();

        for (PrizaSmart p : listaPrize) {
            if(p.getPret() == Float.parseFloat(valoare)) {
                rezultat.add(p);
            }
        }

        return rezultat;
    }


    public static ArrayList<PrizaSmart> cautaPrizaSmart(ArrayList<PrizaSmart> listaPrize, int optiune, String valoare) {

        switch(optiune){
            case 1: return cautaUtilizare(listaPrize, valoare);
            case 2: return cautaSmart(listaPrize, valoare);
            case 3: return cautaMaterial(listaPrize, valoare);
            case 4: return cautaAmperaj(listaPrize, valoare);
            case 5: return cautaTensiune(listaPrize, valoare);
            case 6: return cautaPret(listaPrize, valoare);

            default:
                System.out.println("Optiune invalida!");
                return new ArrayList<>();
        }
    }

       public static void scrieFisierPrize(ArrayList<PrizaSmart> listaPrize, String numeFisier) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(numeFisier));
            oos.writeObject(listaPrize);
            System.out.println("S-a scris");
            oos.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<PrizaSmart> citestePrizeFisier(String numeFisier){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(numeFisier));
            return (ArrayList<PrizaSmart>) ois.readObject();
        } catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}


