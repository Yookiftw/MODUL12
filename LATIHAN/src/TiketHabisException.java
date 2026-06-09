class TiketHabisException extends Exception {
    String nama;
    int sisa;
    
    public TiketHabisException(String nama, int sisa) {
        super("Tiket habis untuk " + nama + ". Sisa: " + sisa);
        this.nama = nama;
        this.sisa = sisa;
    }
}