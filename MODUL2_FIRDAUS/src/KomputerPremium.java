class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    public boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    @Override
    public void Informasi() {
        super.Informasi();
        if(ruangPrivat) {
            System.out.println("Fasilitas Ruang Premium");
            System.out.println("- Ruangan Ber-AC");
            System.out.println("- sofa gaming exclusive");
            System.out.println("- komputer spec tinggi");
            System.out.println("- internet dedicated 100Mbps");
        }
        else {
            System.out.println("Fasilitas Ruang Standar");
            System.out.println("- ruangan gerah");
            System.out.println("- sofa majapahit");
            System.out.println("- komputer spec rendah");
            System.out.println("- internet dedicated 1Mbps");
        }
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        
    }
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan) {
        
    }
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman) {
        
    }
    
}
