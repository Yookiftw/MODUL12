import java.util.ArrayList;
import java.util.List;

class DBKereta implements PenyimpananKereta {
    List<Kereta> daftar = new ArrayList<>();

    public DBKereta() {
        daftar.add(new Kereta("K01", "Argo Bromo", "JKT - SBY", 50));
        daftar.add(new Kereta("K02", "Parahyangan", "JKT - BDG", 15));
    }

    public List<Kereta> ambilSemuaData() {
        return daftar;
    }

    public Kereta cariBerdasarkanKode(String kode) {
        for (Kereta k : daftar) {
            if (k.kode.equalsIgnoreCase(kode)) {
                return k;
            }
        }
        return null;
    }
}