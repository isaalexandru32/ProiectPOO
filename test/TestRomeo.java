package test;
import items.*;
public class TestRomeo {
    public static void main(String[] args) {
        MiniCameraVideo[] vect = new MiniCameraVideo[3];
        vect[0] = new MiniCameraVideo();
        vect[1] = new MiniCameraVideo("camera spion", "negru", 1999.99f, 4, "USB / WIRELESS", 154, 64, "1920x1080", 128, 60, "12W 12 L 12 H");
        MiniCameraVideo alt = new MiniCameraVideo("camera spion 2", "alb", 3999.99f, 4, "USB / WIRELESS", 3, 64, "1920x1080", 64, 144, "12W 12 L 12 H");
        vect[2] = new MiniCameraVideo(alt);
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        Reportofon[] vect1 = new Reportofon[3];
        vect1[0] = new Reportofon();
        vect1[1] = new Reportofon("reportofon profesional", "rosu", 219.45f, 7, "BLUETOOTH / USB / WIFI", 87, 64, 128, "44kb/s", "94.3L 42.2W 75.7H", 1);
        Reportofon alt1 = new Reportofon("reportofon profesional 2", "verde", 119.45f, 7, "BLUETOOTH / USB", 90, 32, 256, "88kb/s", "94.3L 42.2W 75.7H", 1);
        vect1[2] = new Reportofon(alt1);
        System.out.println(vect1[0]);
        System.out.println(vect1[1]);
        System.out.println(vect1[2]);
    }
}
