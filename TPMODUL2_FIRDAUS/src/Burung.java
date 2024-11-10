class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    // Overrides
    @Override
    public void suara() {
        System.out.println(nama + " mengeluarkan suara: Cuit cuit!");
    }
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
