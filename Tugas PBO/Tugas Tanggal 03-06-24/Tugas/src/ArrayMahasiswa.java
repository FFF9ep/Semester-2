import java.util.ArrayList;

public class ArrayMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ArrayMahasiswa() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void hapusMahasiswa(String nim) {
        daftarMahasiswa.removeIf(mahasiswa -> mahasiswa.getNim().equals(nim));
    }

    public void displayMahasiswa() {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa);
        }
    }
}
