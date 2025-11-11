package test;
import items.*;

public class TestIsaia {
    public static void main(String[] args) {
        OchelariVR[] vect = new OchelariVR[3];
        vect[0] = new OchelariVR();
        vect[1] = new OchelariVR("oculus rift", "negru", 1999.99f, 4, "HDMI / WIRELESS", 154, "AMOLED", "1920x1080", 144, 32, "Windows 10+");
        OchelariVR alt = new OchelariVR("meta quest", "alb", 3999.99f, 4, "HDMI / WIRELESS", 3, "IPS", "1920x1080", 280, 128, "Windows 10+");
        vect[2] = new OchelariVR(alt);
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        BoxaPortabila[] vect1 = new BoxaPortabila[3];
        vect1[0] = new BoxaPortabila();
        vect1[1] = new BoxaPortabila("JBL Go 4", "rosu", 219.45f, 7, "BLUETOOTH", 87, 400, 20, 20000, "94.3L 42.2W 75.7H", 1);
        BoxaPortabila alt1 = new BoxaPortabila("JBL Go 3", "verde", 119.45f, 7, "BLUETOOTH", 87, 350, 20, 20000, "94.3L 42.2W 75.7H", 1);
        vect1[2] = new BoxaPortabila(alt1);
        System.out.println(vect1[0]);
        System.out.println(vect1[1]);
        System.out.println(vect1[2]);
    }
}
