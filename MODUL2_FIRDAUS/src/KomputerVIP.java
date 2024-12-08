class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    public boolean vipCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    @Override
    public void Informasi() {
        if (vipCard) {
            System.out.println("Benefit Member VIP:");
            System.out.println("- diskon 10% untuk bermain diatas 3 jam");
            System.out.println("- gratis minuman setiap 4 jam bermain");
            System.out.println("- priotitas booking komputer gaming");
        }
        else {
            System.out.println("Benefit Member VIP : get a job");
        }
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username) {
        System.out.println("login dengan username   : " +username);
    }
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam) {
        System.out.println("bermain selama          : " +jam);
    }
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menitTambahan) {
        System.out.println("menambah biling selama : " + jam + " menit " + menitTambahan);
    }

}