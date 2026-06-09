class Reservasi {
    PenyimpananKereta db;

    public Reservasi(PenyimpananKereta db) {
        this.db = db;
    }

    public void pesan(String kode, String nik, String nama, int jumlah) throws RuteTidakDitemukanException, TiketHabisException {
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("NIK harus 16 digit angka.");
        }

        Kereta kereta = db.cariBerdasarkanKode(kode);
        if (kereta == null) {
            throw new RuteTidakDitemukanException("Kode kereta tidak ditemukan.");
        }

        if (jumlah > kereta.kursi) {
            throw new TiketHabisException(kereta.nama, kereta.kursi);
        }

        kereta.kursi -= jumlah;
    }
}