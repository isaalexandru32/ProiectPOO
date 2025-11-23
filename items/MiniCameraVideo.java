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

     public static ArrayList<MiniCameraVideo> cautaMemorieInterna(ArrayList<MiniCameraVideo> listaMiniCameraVideo, String valoare) {
        ArrayList<MiniCameraVideo> rezultat = new ArrayList<>();
        for (MiniCameraVideo a : listaMiniCameraVideo) {
            if (a.getMemorieInterna()== Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<MiniCameraVideo> cautaRezolutie(ArrayList<MiniCameraVideo> listaMiniCameraVideo, String valoare) {
        ArrayList<MiniCameraVideo> rezultat = new ArrayList<>();
        for (MiniCameraVideo a : listaMiniCameraVideo) {
            if (a.getRezolutie().equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<MiniCameraVideo> cautaMemorieExterna(ArrayList<MiniCameraVideo> listaMiniCameraVideo, String valoare) {
        ArrayList<MiniCameraVideo> rezultat = new ArrayList<>();
        for (MiniCameraVideo a : listaMiniCameraVideo) {
            if (a.getMemorieExterna() == Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<MiniCameraVideo> cautaCadrePeSecunda(ArrayList<MiniCameraVideo> listaMiniCameraVideo, String valoare) {
        ArrayList<MiniCameraVideo> rezultat = new ArrayList<>();
        for (MiniCameraVideo a : listaMiniCameraVideo) {
            if (a.getCadrePeSecunda()== Integer.parseInt(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<MiniCameraVideo> cautaDimensiuni(ArrayList<MiniCameraVideo> listaMiniCameraVideo, String valoare) {
        ArrayList<MiniCameraVideo> rezultat = new ArrayList<>();
        for (MiniCameraVideo a : listaMiniCameraVideo) {
            if (a.getDimensiuni() .equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<MiniCameraVideo> cautaPret(ArrayList<MiniCameraVideo> listaMiniCameraVideos, String valoare) {
        ArrayList<MiniCameraVideo> rezultat = new ArrayList<>();
        for (MiniCameraVideo a : listaMiniCameraVideos) {
            if (a.getPret() == Float.parseFloat(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }
    public static ArrayList<MiniCameraVideo> cautaNume(ArrayList<MiniCameraVideo> listaMiniCameraVideo,  String valoare) {
        ArrayList<MiniCameraVideo> rezultat = new ArrayList<>();
        for (MiniCameraVideo a : listaMiniCameraVideo) {
            if (a.getNume().equalsIgnoreCase(valoare)){
                rezultat.add(a);
            }
        }
        return rezultat;
    }

    public static ArrayList<MiniCameraVideo> cautaMiniCameraVideo(ArrayList<MiniCameraVideo> listaMiniCameraVideo, int optiune, String valoare){

        switch(optiune){
            case 1: return cautaMemorieInterna(listaMiniCameraVideo, valoare);
            case 2: return cautaRezolutie(listaMiniCameraVideo, valoare);
            case 3: return cautaMemorieExterna(listaMiniCameraVideo, valoare);
            case 4: return cautaCadrePeSecunda(listaMiniCameraVideo, valoare);
            case 5: return cautaDimensiuni(listaMiniCameraVideo, valoare);
            case 6: return cautaPret(listaMiniCameraVideo, valoare);
            case 7: return cautaNume(listaMiniCameraVideo, valoare);

            default:
                System.out.println("Optiune invalida!");
                return new ArrayList<>();
        }
    }
}

