package items;
import java.util.ArrayList;
public class MiniCameraVideo extends Gadget {
    private int MemorieInterna;
    private String Rezolutie;
    private int MemorieExterna;
    private int CadrePeSecunda;
    private String Dimensiuni;
    public MiniCameraVideo() {
        super();
        this.MemorieInterna = 0;
        this.Rezolutie = "";
        this.MemorieExterna = 0;
        this.CadrePeSecunda = 0;
        this.Dimensiuni = "";
    }
    public MiniCameraVideo(String nume,String culoare,float pret,int autonomie,String interfata,int stoc,int MemorieInterna,String Rezolutie,int MemorieExterna,int CadrePeSecunda,String Dimensiuni) {
        super(nume,culoare,pret,autonomie,interfata,stoc );
        this.MemorieInterna=MemorieInterna;
        this.Rezolutie=Rezolutie;
        this.MemorieExterna=MemorieExterna;
        this.CadrePeSecunda=CadrePeSecunda;
        this.Dimensiuni=Dimensiuni;

    }
    public MiniCameraVideo(MiniCameraVideo minicamera) {
        super(minicamera);
        this.MemorieExterna=minicamera.MemorieExterna;
        this.Rezolutie=minicamera.Rezolutie;
        this.MemorieInterna=minicamera.MemorieInterna;
        this.CadrePeSecunda=minicamera.CadrePeSecunda;
        this.Dimensiuni=minicamera.Dimensiuni;
    }

    @Override
    public String toString() {
        return "Gadget object {" +
                "nume= " + nume +
                ", culoare= " + culoare +
                ", pret= " + pret +
                ", autonomie= " + autonomie +
                ", interfata= " + interfata +
                ", MemorieInterna= " + MemorieInterna +
                ", MemorieExterna= " + MemorieExterna +
                ", CadrePeSecunda= " + CadrePeSecunda +
                ", Dimensiuni= " + Dimensiuni +
                ", Rezolutie= " + Rezolutie +
                ", stoc= " + stoc + '}';
    }
    public void setMemorieInterna(int MemorieInterna) {
        this.MemorieInterna = MemorieInterna;
    }
    public void setRezolutie(String Rezolutie) {
        this.Rezolutie = Rezolutie;
    }
    public void setMemorieExterna(int MemorieExterna) {
        this.MemorieExterna = MemorieExterna;
    }
    public void setCadrePeSecunda(int CadrePeSecunda) {
        this.CadrePeSecunda = CadrePeSecunda;
    }
    public void setDimensiuni(String Dimensiuni) {
        this.Dimensiuni = Dimensiuni;
    }

    public int getMemorieInterna() {
        return MemorieInterna;
    }
    public String getRezolutie() {
        return Rezolutie;
    }
    public int getMemorieExterna() {
        return MemorieExterna;
    }
    public int getCadrePeSecunda() {
        return CadrePeSecunda;
    }
    public String getDimensiuni() {
        return Dimensiuni;
    }

    public static ArrayList<MiniCameraVideo> cautaDimensiuniRezolutie(ArrayList<MiniCameraVideo> listaMiniCameraVideo, String Dimensiuni, String Rezolutie) {
        ArrayList<MiniCameraVideo> gasit = new ArrayList<>();

        for (MiniCameraVideo cam : listaMiniCameraVideo) {
            if (cam.Dimensiuni == Dimensiuni && cam.Rezolutie == Rezolutie) {
                gasit.add(cam);
            }
        }

        return gasit;
    }

    public static ArrayList<MiniCameraVideo> cautaCadrePeSecundaMemorieInterna(ArrayList<MiniCameraVideo> listaMiniCameraVideo, int CadrePeSecunda, int MemorieInterna) {
        ArrayList<MiniCameraVideo> gasit = new ArrayList<>();

        for (MiniCameraVideo cam : listaMiniCameraVideo) {
            if (cam.CadrePeSecunda == CadrePeSecunda && cam.MemorieInterna == MemorieInterna) {
                gasit.add(cam);
            }
        }

        return gasit;
    }
}
