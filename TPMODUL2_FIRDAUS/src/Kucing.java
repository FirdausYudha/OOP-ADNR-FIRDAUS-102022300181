class Kucing extends Hewan {
    private String ras;

    // Constructor
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    // Overrides
    @Override
    public void suara() {
        System.out.println(nama + " mengeluarkan suara: Meong!");
    }
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Ras: " + ras);
    }
}
