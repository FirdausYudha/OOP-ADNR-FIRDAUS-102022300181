import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DaftarPenerbangan> daftarPenerbangan = new ArrayList<>();
        ArrayList<Penumpang> daftarPesanan = new ArrayList<>();

        // Menambahkan beberapa penerbangan ke daftar
        daftarPenerbangan.add(new DaftarPenerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new DaftarPenerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        while (true) {
            System.out.println("==== EAD Ticket Booking System ====");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan Pilih Menu: ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Menampilkan daftar penerbangan
                    for (DaftarPenerbangan penerbangan : daftarPenerbangan) {
                        penerbangan.showDaftarPenerbangan();
                    }
                    break;

                case 2:
                    // Logika untuk membeli tiket
                    System.out.println("=== Pembelian Tiket ===");
                    System.out.print("Masukkan NIK: ");
                    String nik = scanner.next();
                    System.out.print("Masukkan Nama Depan: ");
                    String namaDepan = scanner.next();
                    System.out.print("Masukkan Nama Belakang: ");
                    String namaBelakang = scanner.next();

                    // Menampilkan daftar penerbangan untuk memilih
                    System.out.println("Pilih Penerbangan:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        daftarPenerbangan.get(i).showDaftarPenerbangan();
                    }

                    System.out.print("Masukkan nomor penerbangan yang dipilih: ");
                    int pilihanPenerbangan = scanner.nextInt() - 1;

                    if (pilihanPenerbangan >= 0 && pilihanPenerbangan < daftarPenerbangan.size()) {
                        Penumpang penumpang = new Penumpang(nik, namaDepan, namaBelakang);
                        daftarPesanan.add(penumpang);
                        System.out.println("Tiket berhasil dipesan!");
                    } else {
                        System.out.println("Nomor penerbangan tidak valid.");
                    }
                    break;

                case 3:
                    // Menampilkan pesanan tiket
                    System.out.println("=== Daftar Pesanan Tiket ===");
                    for (Penumpang pesanan : daftarPesanan) {
                        pesanan.showPenumpang();
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan EAD Ticket Booking System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
