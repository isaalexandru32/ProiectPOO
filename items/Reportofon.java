package items;
import java.util.ArrayList;
public class Reportofon extends Gadget{
    private int MemorieInterna;
    private int MemorieExterna;
    private String Dimensiuni;
    private String CalitateSunet;
    private int NumarMicrofoane;
    public Reportofon(){
        super();
        this.MemorieInterna = 0;
        this.MemorieExterna = 0;
        this.Dimensiuni = "";
        this.CalitateSunet = "";
        this.NumarMicrofoane = 0;

    }
    public Reportofon(String nume,String culoare,float pret,int autonomie,String interfata,int stoc,int MemorieInterna,int MemorieExterna,String CalitateSunet,String Dimensiuni,int NumarMicrofoane) {
        super(nume,culoare,pret,autonomie,interfata,stoc );
        this.MemorieInterna = MemorieInterna;
        this.MemorieExterna = MemorieExterna;
        this.Dimensiuni = Dimensiuni;
        this.CalitateSunet = CalitateSunet;
        this.NumarMicrofoane = NumarMicrofoane;
    }
    public Reportofon(Reportofon reportofon){
        super(reportofon);
        this.MemorieInterna= reportofon.MemorieInterna;
        this.MemorieExterna= reportofon.MemorieExterna;
        this.Dimensiuni= reportofon.Dimensiuni;
        this.CalitateSunet= reportofon.CalitateSunet;
        this.NumarMicrofoane= reportofon.NumarMicrofoane;

    }
    @Override
    public String toString() {
        return "Gadget object {" +
                "nume= " + nume +
                ", culoare= " + culoare +
                ", pret= " + pret +
                ", autonomie= " + autonomie +
                ", interfata= " + interfata +
                ", stoc= " + stoc +
                ", MemorieInterna= " + MemorieInterna +
                ", MemorieExterna= " + MemorieExterna +
                ", NumarMicrofoane= " + NumarMicrofoane +
                ", CalitateSunet= " + CalitateSunet +
                ", Dimensiuni= " + Dimensiuni + '}';

    }
    public void setMemorieInterna(int MemorieInterna) {
        this.MemorieInterna = MemorieInterna;
    }
    public void setMemorieExterna(int MemorieExterna) {
        this.MemorieExterna = MemorieExterna;
    }
    public void setDimensiuni(String Dimensiuni) {
        this.Dimensiuni = Dimensiuni;
    }
    public void setCalitateSunet(String CalitateSunet) {
        this.CalitateSunet = CalitateSunet;
    }
    public void setNumarMicrofoane(int NumarMicrofoane) {
        this.NumarMicrofoane = NumarMicrofoane;
    }
    public int getMemorieInterna() {
        return MemorieInterna;
    }
    public int getMemorieExterna() {
        return MemorieExterna;
    }
    public String getDimensiuni() {
        return Dimensiuni;
    }
    public String getCalitateSunet() { return CalitateSunet; }
    public int getNumarMicrofoane() {
        return NumarMicrofoane;
    }

    public static ArrayList<Reportofon> cautaMemorieInterna(ArrayList<Reportofon> listaReportofon, String valoare) {
            ArrayList<Reportofon> rezultat = new ArrayList<>();
            for (Reportofon a : listaReportofon) {
                if (a.getMemorieInterna() == Integer.parseInt(valoare)){
                    rezultat.add(a);
                }
            }
            return rezultat;
        }

            public static ArrayList<Reportofon> cautaMemorieExterna(ArrayList<Reportofon> listaReportofon, String valoare) {
            ArrayList<Reportofon> rezultat = new ArrayList<>();
                    for (Reportofon a : listaReportofon) {
                if (a.getMemorieExterna() == Integer.parseInt(valoare)){
                    rezultat.add(a);
                }
            }
            return rezultat;
        }

        public static ArrayList<Reportofon> cautaDimensiuni(ArrayList<Reportofon> listaReportofon,  String valoare) {
            ArrayList<Reportofon> rezultat = new ArrayList<>();
            for (Reportofon a : listaReportofon) {
                if (a.getDimensiuni().equalsIgnoreCase(valoare)){
                    rezultat.add(a);
                }
            }
            return rezultat;
        }

        public static ArrayList<Reportofon> cautaCaliateSunet(ArrayList<Reportofon> listaReportofon,  String valoare) {
            ArrayList<Reportofon> rezultat = new ArrayList<>();
            for (Reportofon a : listaReportofon) {
                if (a.getCalitateSunet().equalsIgnoreCase(valoare)){
                    rezultat.add(a);
                }
            }
            return rezultat;
        }

            public static ArrayList<Reportofon> cautaNumarMicrofoane(ArrayList<Reportofon> listaReportofon,  String valoare) {
            ArrayList<Reportofon> rezultat = new ArrayList<>();
            for (Reportofon a : listaReportofon) {
                if (a.getNumarMicrofoane() == Integer.parseInt(valoare)){
                    rezultat.add(a);
                }
            }
            return rezultat;
        }

        public static ArrayList<Reportofon> cautaPret(ArrayList<Reportofon> listaReportofon,  String valoare) {
            ArrayList<Reportofon> rezultat = new ArrayList<>();
            for (Reportofon a : listaReportofon) {
                if (a.getPret() == Float.parseFloat(valoare)){
                    rezultat.add(a);
                }
            }
            return rezultat;
        }
    public static ArrayList<Reportofon> cautaNume(ArrayList<Reportofon> listaReportofon,  String valoare) {
        ArrayList<Reportofon> rezultat = new ArrayList<>();
        for (Reportofon a : listaReportofon) {
            if (a.getNume().equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }
    public static ArrayList<Reportofon> cautaReportofon(ArrayList<Reportofon> listaReportofon, int optiune, String valoare){

        switch(optiune){
            case 1: return cautaMemorieInterna(listaReportofon, valoare);
            case 2: return cautaMemorieExterna(listaReportofon, valoare);
            case 3: return cautaDimensiuni(listaReportofon, valoare);
            case 4: return cautaCaliateSunet(listaReportofon, valoare);
            case 5: return cautaNumarMicrofoane(listaReportofon, valoare);
            case 6: return cautaPret(listaReportofon, valoare);
            case 7: return cautaNume(listaReportofon, valoare);
            default:
                System.out.println("Optiune invalida!");
                return new ArrayList<>();
        }
    }
     public static void scrieFisierReportofon(ArrayList<Reportofon> listaReportofon, String numeFisier) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(numeFisier));
            oos.writeObject(listaReportofon);
            System.out.println("S-a scris");
            oos.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Reportofon> citesteReportofonFisier(String numeFisier){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(numeFisier));
            return (ArrayList<Reportofon>) ois.readObject();
        } catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}


