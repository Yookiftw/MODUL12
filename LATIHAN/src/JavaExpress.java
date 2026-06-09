import java.util.*;


public class JavaExpress {
    public static void main(String[] args) {
        PenyimpananKereta db = new DBKereta();
        Reservasi layanan = new Reservasi(db);
        Scanner scanner = new Scanner(System.in);
        boolean jalan = true;

        try {
            while (jalan) {
                try {
                    System.out.println("\n1. Jadwal  2. Pesan Tiket  3. Keluar");
                    System.out.print("Pilih menu: ");
                    int menu = scanner.nextInt();
                    scanner.nextLine();

                    if (menu == 1) {
                        for (Kereta k : db.ambilSemuaData()) {
                            System.out.println(k.kode + " | " + k.nama + " | " + k.rute + " | Sisa: " + k.kursi);
                        }
                    } else if (menu == 2) {
                        System.out.print("Kode Kereta: ");
                        String kode = scanner.nextLine();
                        System.out.print("NIK (16 digit): ");
                        String nik = scanner.nextLine();
                        System.out.print("Nama Lengkap: ");
                        String nama = scanner.nextLine();
                        System.out.print("Jumlah Tiket: ");
                        int jumlah = scanner.nextInt();
                        scanner.nextLine();

                        layanan.pesan(kode, nik, nama, jumlah);
                        System.out.println("Sukses pesan " + jumlah + " tiket " + db.cariBerdasarkanKode(kode).nama + " untuk " + nama);
                        
                    } else if (menu == 3) {
                        jalan = false;
                    } else {
                        System.out.println("Pilihan tidak ada.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka.");
                    scanner.nextLine();
                } catch (DataPenumpangTidakValidException | RuteTidakDitemukanException | TiketHabisException e) {
                    System.out.println("Gagal: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Sistem error: " + e.getMessage());
                }
            }
        } finally {
            System.out.println("Mematikan sistem dan membersihkan memory...");
            scanner.close();
        }
    }
}