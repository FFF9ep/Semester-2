import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama: ");
        String nama = input.nextLine();

        System.out.println("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = input.nextLine();
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("L") ? "laki-laki" : "perempuan";

        System.out.println("Tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate tanggalSekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, tanggalSekarang);
        // int tahun = selisih.getYears();
        int bulan = selisih.getMonths();
        int hari = selisih.getDays();
        int umur = Period.between(tanggalLahir, tanggalSekarang).getYears();

        System.out.println("\nData Diri");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur : " + umur + " tahun " + bulan + " bulan" + hari + " hari ");

        input.close();
    }
}