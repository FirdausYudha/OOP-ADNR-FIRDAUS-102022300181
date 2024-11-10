class Hewan {
    protected String nama;
    protected int umur;

    // Constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Methods
    public void suara() {
        System.out.println("Hewan mengeluarkan suara.");
    }
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan + ".");
    }
    public void infoHewan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}
