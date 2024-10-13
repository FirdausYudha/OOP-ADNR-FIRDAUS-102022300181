public class DaftarPenerbangan {
    // Atribut Penerbangan (Private)
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public DaftarPenerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan,
                             String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    public void showDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan           : " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan       : " + bandaraKeberangkatan);
        System.out.println("Bandara Tujuan              : " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan         : " + waktuKeberangkatan);
        System.out.println("Waktu Kedatangan            : " + waktuKedatangan);
        System.out.println("Harga Tiket                 : Rp " + hargaTiket);
        System.out.println("--------------------------------------------");
    }
}
