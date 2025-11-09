package items;

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
    public Reportofon(String nume,String culoare,float pret,int autonomie,String interfata,int stoc,int MemorieInterna,int MemorieExterna,int CadrePeSecunda,String Dimensiuni,int NumarMicrofoane) {
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
                "nume= " + nume + '\'' +
                ", culoare= " + culoare + '\'' +
                ", pret= " + pret + '\'' +
                ", autonomie= " + autonomie + '\'' +
                ", interfata= " + interfata + '\'' +
                ", stoc= " + stoc + '\'' +
                ", MemorieInterna= " + MemorieInterna + '\'' +
                ", MemorieExterna= " + MemorieExterna + '\'' +
                ", NumarMicrofoane= " + NumarMicrofoane + '\'' +
                ", CalitateSunet= " + CalitateSunet + '\'' +
                ", Dimensiuni= " + Dimensiuni + '\'' + '}';

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
    public String getCalitateSunet() {
        return CalitateSunet;
    }
    public int getNumarMicrofoane() {
        return NumarMicrofoane;
    }
}

