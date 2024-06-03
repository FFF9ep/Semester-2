public class Mahasiswa {
    private String nama;
    private String nim;
    private String fakultas;
    private String programStudi;

    // Constructor default
    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.fakultas = "";
        this.programStudi = "";
    }

    // Constructor dengan parameter
    public Mahasiswa(String nama, String nim, String fakultas, String programStudi) {
        this.nama = nama;
        this.nim = nim;
        this.fakultas = fakultas;
        this.programStudi = programStudi;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Fakultas: " + fakultas + ", Program Studi: " + programStudi;
    }
}
