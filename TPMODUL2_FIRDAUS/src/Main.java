public class Main {
    public static void main(String[] args) {
        Kucing ku = new Kucing("Kitty", 2, "Persia");
        Burung bu = new Burung("Cici", 1, "Kuning");

        System.out.println("Informasi Kucing");
        ku.infoHewan();
        ku.suara();
        ku.makan();
        ku.makan("ikan");

        System.out.println("Informasi Burung");
        bu.infoHewan();
        bu.suara();
        bu.makan();
        bu.makan("biji-bijian");
    }

}