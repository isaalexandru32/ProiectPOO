package app;
import java.util.ArrayList;
import items.*;
public class InitListe {
    public static ArrayList<OchelariVR> initOchelariVR() {
        ArrayList<OchelariVR> ochelariVRList = new ArrayList<>();

        ochelariVRList.add(new OchelariVR("Meta Quest 3", "Alb", 599.99f, 120, "USB-C", 50,
                "LCD", "1832×1920 per ochi", 120, 128, "Android, iOS, PC"));

        ochelariVRList.add(new OchelariVR("Apple Vision Pro", "Argintiu", 3499.99f, 180, "USB-C", 30,
                "Micro-OLED", "3660×3200 per ochi", 90, 256, "iOS, macOS"));

        ochelariVRList.add(new OchelariVR("HTC Vive Pro 2", "Negru", 799.99f, 0, "DisplayPort", 25,
                "LCD", "2448×2448 per ochi", 120, 64, "PC"));

        ochelariVRList.add(new OchelariVR("Sony PlayStation VR2", "Alb", 549.99f, 0, "USB-C", 40,
                "OLED", "2000×2040 per ochi", 120, 0, "PlayStation 5"));

        ochelariVRList.add(new OchelariVR("Valve Index", "Negru", 999.99f, 0, "DisplayPort", 15,
                "LCD", "1440×1600 per ochi", 144, 0, "PC"));

        ochelariVRList.add(new OchelariVR("Pico 4", "Alb", 429.99f, 150, "USB-C", 35,
                "LCD", "2160×2160 per ochi", 90, 128, "Android, PC"));

        ochelariVRList.add(new OchelariVR("Oculus Quest 2", "Alb", 299.99f, 180, "USB-C", 60,
                "LCD", "1832×1920 per ochi", 120, 64, "Android, iOS, PC"));

        ochelariVRList.add(new OchelariVR("HP Reverb G2", "Negru", 599.99f, 120, "DisplayPort", 20,
                "LCD", "2160×2160 per ochi", 90, 0, "PC"));

        ochelariVRList.add(new OchelariVR("Varjo Aero", "Gri", 1990.00f, 0, "DisplayPort", 10,
                "Mini-LED", "2880×2720 per ochi", 90, 0, "PC"));

        ochelariVRList.add(new OchelariVR("Meta Quest Pro", "Negru", 999.99f, 120, "USB-C", 25,
                "LCD", "1800×1920 per ochi", 90, 256, "Android, iOS, PC"));

        return ochelariVRList;
    }


    public static ArrayList<BoxaPortabila> initBoxePortabile() {
        ArrayList<BoxaPortabila> boxePortabile = new ArrayList<>();

        boxePortabile.add(new BoxaPortabila("JBL Flip 6", "Negru", 129.99f, 12, "Bluetooth", 100,
                20, 63, 20000, "17.2 x 7.2 x 7.2 cm", 2));

        boxePortabile.add(new BoxaPortabila("Sony SRS-XB43", "Albastru", 199.99f, 24, "Bluetooth", 75,
                30, 20, 20000, "29.8 x 10.2 x 10.1 cm", 4));

        boxePortabile.add(new BoxaPortabila("Bose SoundLink Revolve", "Argintiu", 229.99f, 13, "Bluetooth", 60,
                15, 50, 14000, "15.2 x 8.3 x 8.3 cm", 1));

        boxePortabile.add(new BoxaPortabila("Marshall Kilburn II", "Negru", 249.99f, 20, "Bluetooth", 45,
                36, 52, 20000, "24.3 x 16.2 x 14.2 cm", 2));

        boxePortabile.add(new BoxaPortabila("Ultimate Ears MEGABOOM 3", "Rosu", 179.99f, 20, "Bluetooth", 80,
                40, 60, 20000, "22.9 x 8.3 x 8.3 cm", 2));

        boxePortabile.add(new BoxaPortabila("Anker Soundcore Motion+", "Albastru", 99.99f, 12, "Bluetooth", 120,
                30, 50, 40000, "16.3 x 6.9 x 5.7 cm", 4));

        boxePortabile.add(new BoxaPortabila("Harman Kardon Onyx Studio 6", "Alb", 199.99f, 8, "Bluetooth", 35,
                50, 50, 20000, "33.5 x 32.5 x 17.5 cm", 2));

        boxePortabile.add(new BoxaPortabila("Bang & Olufsen Beosound A1", "Verde", 249.99f, 18, "Bluetooth", 25,
                15, 45, 24000, "13.3 x 4.6 x 13.3 cm", 2));

        boxePortabile.add(new BoxaPortabila("Tribit StormBox Micro", "Negru", 49.99f, 8, "Bluetooth", 200,
                9, 70, 20000, "9.9 x 9.9 x 3.9 cm", 1));

        boxePortabile.add(new BoxaPortabila("Xiaomi SoundMaster 3", "Alb", 179.99f, 20, "Bluetooth", 90,
                5, 20, 20000, "10.1 x 5.8 x 3.3 cm", 2));
        return boxePortabile;
    }

    public static ArrayList<Boxe> initBoxe() {
        ArrayList<Boxe> boxeList = new ArrayList<>();
        boxeList.add(new Boxe("JBL PartyBox 310", "Negru", 899.99f, 12, "Bluetooth", 5, true, 2, 240, 20000, 40));
        boxeList.add(new Boxe("Sony SRS-XP700", "Albastru", 749.99f, 24, "Bluetooth", 8, true, 2, 180, 20000, 50));
        boxeList.add(new Boxe("Bose S1 Pro", "Alb", 599.99f, 11, "Bluetooth", 3, false, 1, 110, 18000, 55));
        boxeList.add(new Boxe("Marshall Tufton", "Maro", 449.99f, 20, "Bluetooth", 6, false, 2, 80, 20000, 45));
        boxeList.add(new Boxe("Anker Soundcore Rave", "Negru", 299.99f, 15, "Bluetooth", 10, true, 2, 120, 20000, 40));
        boxeList.add(new Boxe("Harman Kardon Onyx Studio 7", "Gri", 329.99f, 8, "Bluetooth", 4, true, 4, 100, 20000, 50));
        boxeList.add(new Boxe("LG XBOOM 360", "Alb", 699.99f, 10, "Bluetooth", 2, true, 2, 150, 20000, 40));
        boxeList.add(new Boxe("Ultimate Ears HYPERBOOM", "Negru", 399.99f, 24, "Bluetooth", 7, true, 4, 180, 20000, 35));
        boxeList.add(new Boxe("Sonos Move", "Negru", 399.99f, 10, "Wi-Fi/Bluetooth", 5, false, 2, 100, 20000, 40));
        boxeList.add(new Boxe("JBL Boombox 3", "Rosu", 499.99f, 24, "Bluetooth", 9, true, 4, 160, 20000, 45));
        return boxeList;
    }

    public static ArrayList<Casti> initCasti() {
        ArrayList<Casti> castiList = new ArrayList<>();
        castiList.add(new Casti("Sony WH-1000XM4", "Negru", 899.99f, 30, "Bluetooth", 15, true, false, "Over-ear", 3, 40000));
        castiList.add(new Casti("Apple AirPods Pro", "Alb", 799.99f, 6, "Bluetooth", 25, true, true, "In-ear", 1, 20000));
        castiList.add(new Casti("Bose QuietComfort 35", "Argintiu", 699.99f, 20, "Bluetooth", 8, true, false, "Over-ear", 2, 20000));
        castiList.add(new Casti("Samsung Galaxy Buds2", "Verde", 349.99f, 8, "Bluetooth", 20, true, true, "In-ear", 1, 20000));
        castiList.add(new Casti("JBL Tune 510BT", "Albastru", 199.99f, 40, "Bluetooth", 12, true, false, "On-ear", 2, 20000));
        castiList.add(new Casti("Sennheiser HD 450BT", "Alb", 449.99f, 30, "Bluetooth", 6, true, false, "Over-ear", 2, 18000));
        castiList.add(new Casti("Jabra Elite 75t", "Negru", 599.99f, 7, "Bluetooth", 18, true, true, "In-ear", 1, 20000));
        castiList.add(new Casti("Beats Studio Buds", "Rosu", 499.99f, 8, "Bluetooth", 14, true, true, "In-ear", 1, 20000));
        castiList.add(new Casti("Audio-Technica ATH-M50x", "Negru", 399.99f, 0, "Cablu", 9, false, false, "Over-ear", 0, 28000));
        castiList.add(new Casti("Huawei FreeBuds 4i", "Alb", 249.99f, 10, "Bluetooth", 22, true, true, "In-ear", 1, 20000));
        return castiList;
    }


    public static ArrayList<PrizaSmart> initPrizeSmart() {
        ArrayList<PrizaSmart> listaPrize = new ArrayList<>();

        listaPrize.add(new PrizaSmart("Model A1", "Alb", 50.0f, 24, "WiFi", 15, "Casa", true, "Plastic", 10, 220));
        listaPrize.add(new PrizaSmart("Model A2", "Negru", 55.0f, 30, "WiFi", 10, "Birou", false, "Metal", 12, 230));
        listaPrize.add(new PrizaSmart("Model A3", "Gri", 60.0f, 20, "Bluetooth", 20, "Casa", true, "Plastic", 15, 220));
        listaPrize.add(new PrizaSmart("Model A4", "Rosu", 45.5f, 18, "WiFi", 25, "Garaj", false, "Plastic", 16, 240));
        listaPrize.add(new PrizaSmart("Model A5", "Albastru", 70.0f, 40, "WiFi", 5, "Casa", true, "Metal", 10, 220));
        listaPrize.add(new PrizaSmart("Model A6", "Negru", 49.0f, 22, "Bluetooth", 10, "Birou", true, "Ceramica", 8, 230));
        listaPrize.add(new PrizaSmart("Model A7", "Alb", 52.0f, 26, "WiFi", 12, "Casa", false, "Plastic", 14, 220));
        listaPrize.add(new PrizaSmart("Model A8", "Mov", 65.0f, 30, "WiFi", 18, "Garaj", true, "Metal", 13, 230));
        listaPrize.add(new PrizaSmart("Model A9", "Portocaliu", 68.0f, 33, "Bluetooth", 7, "Birou", false, "Plastic", 10, 220));
        listaPrize.add(new PrizaSmart("Model A10", "Negru", 75.0f, 36, "WiFi", 9, "Casa", true, "Metal", 12, 240));

        return listaPrize;
    }

    public static ArrayList<AlarmaSmart> initAlarmeSmart() {
        ArrayList<AlarmaSmart> listaAlarme = new ArrayList<>();

        listaAlarme.add(new AlarmaSmart("Alarm X1", "Alb", 80.0f, 50, "WiFi", 10, "Standard", 70, 3, "LCD", 220));
        listaAlarme.add(new AlarmaSmart("Alarm X2", "Negru", 85.0f, 55, "Bluetooth", 8, "Premium", 75, 4, "LED", 230));
        listaAlarme.add(new AlarmaSmart("Alarm X3", "Gri", 90.0f, 48, "WiFi", 12, "Standard", 65, 5, "LCD", 220));
        listaAlarme.add(new AlarmaSmart("Alarm X4", "Rosu", 95.0f, 60, "WiFi", 5, "Premium", 80, 4, "OLED", 240));
        listaAlarme.add(new AlarmaSmart("Alarm X5", "Albastru", 70.0f, 45, "Bluetooth", 11, "Standard", 60, 3, "LCD", 220));
        listaAlarme.add(new AlarmaSmart("Alarm X6", "Negru", 120.0f, 65, "WiFi", 6, "Smart", 90, 5, "LED", 230));
        listaAlarme.add(new AlarmaSmart("Alarm X7", "Alb", 110.0f, 58, "WiFi", 9, "Smart", 85, 4, "LCD", 220));
        listaAlarme.add(new AlarmaSmart("Alarm X8", "Mov", 95.5f, 52, "Bluetooth", 14, "Standard", 72, 3, "OLED", 240));
        listaAlarme.add(new AlarmaSmart("Alarm X9", "Gri", 88.0f, 47, "WiFi", 10, "Premium", 78, 5, "LCD", 230));
        listaAlarme.add(new AlarmaSmart("Alarm X10", "Negru", 130.0f, 70, "WiFi", 4, "Smart", 95, 4, "LED", 220));

        return listaAlarme;
    }

    public static ArrayList<Reportofon> initReportofon() {
        ArrayList<Reportofon> reportofoane = new ArrayList<>();

        reportofoane.add(new Reportofon("Zoom H1n", "Negru", 89.99f, 10, "USB-C", 50,
                16, 128, "12.5 x 5.0 x 2.5 cm", "Studio", 2));

        reportofoane.add(new Reportofon("Tascam DR-40X", "Alb", 169.99f, 15, "USB", 30,
                32, 256, "18.6 x 7.1 x 3.8 cm", "Profesional", 4));

        reportofoane.add(new Reportofon("Sony ICD-UX570", "Argintiu", 79.99f, 45, "USB", 80,
                4, 64, "10.6 x 3.5 x 1.5 cm", "Standard", 2));

        reportofoane.add(new Reportofon("Olympus WS-853", "Alb", 59.99f, 30, "USB", 100,
                8, 32, "10.3 x 3.8 x 1.5 cm", "Standard", 2));

        reportofoane.add(new Reportofon("Rode NT-USB+", "Negru", 149.99f, 0, "USB", 25,
                0, 0, "17.0 x 5.0 cm", "Studio", 1));

        reportofoane.add(new Reportofon("Shure MV88+", "Negru", 199.99f, 8, "Lightning", 40,
                0, 0, "10.5 x 2.1 cm", "Profesional", 1));

        reportofoane.add(new Reportofon("Philips DVT8010", "Gri", 49.99f, 25, "USB", 120,
                8, 16, "11.5 x 4.0 x 1.8 cm", "Standard", 1));

        reportofoane.add(new Reportofon("Samson Go Mic", "Alb", 39.99f, 0, "USB", 200,
                0, 0, "7.1 x 4.3 x 2.8 cm", "Studio", 1));

        reportofoane.add(new Reportofon("Blue Yeti Nano", "Alb", 99.99f, 0, "USB", 75,
                0, 0, "12.5 x 5.0 x 2.5 cm", "Studio", 2));

        reportofoane.add(new Reportofon("Saramonic Blink 500", "Negru", 129.99f, 6, "USB-C", 35,
                8, 128, "12.5 x 5.0 x 2.5 cm", "Profesional", 2));

        return reportofoane;
    }

    public static ArrayList<MiniCameraVideo> initMiniCameraVideo() {
        ArrayList<MiniCameraVideo> miniCamereVideo = new ArrayList<>();

        // Adăugarea a 10 elemente în ArrayList
        miniCamereVideo.add(new MiniCameraVideo("GoPro HERO11", "Negru", 399.99f, 90, "USB-C", 60,
                32, "5.3K", 256, 120, "7.1 x 5.0 x 3.3 cm"));

        miniCamereVideo.add(new MiniCameraVideo("DJI Osmo Action 3", "Gri", 329.99f, 160, "USB-C", 45,
                16, "4K", 128, 240, "7.0 x 4.4 x 3.3 cm"));

        miniCamereVideo.add(new MiniCameraVideo("Insta360 GO 2", "Alb", 299.99f, 30, "USB-C", 80,
                32, "1440p", 128, 120, "5.2 x 2.1 x 2.1 cm"));

        miniCamereVideo.add(new MiniCameraVideo("Sony RX0 II", "Negru", 699.99f, 240, "Micro USB", 25,
                16, "4K", 64, 1000, "5.9 x 4.1 x 3.5 cm"));

        miniCamereVideo.add(new MiniCameraVideo("Akaso Brave 7 LE", "Portocaliu", 179.99f, 120, "USB-C", 100,
                32, "4K", 128, 240, "6.2 x 4.1 x 3.3 cm"));

        miniCamereVideo.add(new MiniCameraVideo("Campark ACT74", "Verde", 89.99f, 90, "Micro USB", 150,
                16, "4K", 64, 120, "6.0 x 4.1 x 3.2 cm"));

        miniCamereVideo.add(new MiniCameraVideo("Runcam 5 Orange", "Portocaliu", 99.99f, 60, "Micro USB", 75,
                0, "4K", 64, 120, "5.8 x 3.4 x 2.1 cm"));

        miniCamereVideo.add(new MiniCameraVideo("Apeman A100", "Albastru", 69.99f, 70, "Micro USB", 200,
                16, "4K", 32, 60, "6.0 x 4.1 x 3.2 cm"));

        miniCamereVideo.add(new MiniCameraVideo("DBPOWER EX5000", "Rosu", 49.99f, 60, "Micro USB", 180,
                8, "1080p", 32, 30, "5.9 x 4.1 x 3.1 cm"));

        miniCamereVideo.add(new MiniCameraVideo("YI 4K+", "Negru", 199.99f, 120, "USB-C", 55,
                64, "4K", 128, 240, "6.5 x 4.5 x 3.0 cm"));

        return miniCamereVideo;
    }
}