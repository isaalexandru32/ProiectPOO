package test;
import items.*;

public class TestAurelian {
    public static void main(String[] args) {
        Boxe[] vector = new Boxe[3];
        vector[0] = new Boxe();
        vector[1] = new Boxe("Logitech", "negru", 999.99f, 8, "Bluetooth / Aux", 20, true, 5, 500, 20000, 20);
        Boxe alt = new Boxe("Trust", "alb", 339.99f, 4, "Bluetooth", 30, false, 5, 180, 15000, 20);
        vector[2] = new Boxe(alt);
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);

        Casti[] vector1 = new Casti[3];
        vector1[0] = new Casti();
        vector1[1] = new Casti("Jbl", "negru", 129.99f, 20, "Bluetooth", 10, true, true, "In-ear", 3, 5000);
        Casti alt1 = new Casti("Sony", "albastru", 159.99f, 50, "Bluetooth", 30, true, true, "Over-ear", 3, 12000);
        vector1[2] = new Casti(alt1);
        System.out.println(vector1[0]);
        System.out.println(vector1[1]);
        System.out.println(vector1[2]);
    }
}
