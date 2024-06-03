import java.util.Scanner;

public class DriverMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayMahasiswa arrayMahasiswa = new ArrayMahasiswa();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Tampilkan Daftar Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (pilihan == 1) {
                System.out.print("Masukkan Nama          : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM           : ");
                String nim = scanner.nextLine();
                System.out.print("Masukkan Fakultas      : ");
                String fakultas = scanner.nextLine();
                System.out.print("Masukkan Program Studi : ");
                String programStudi = scanner.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, fakultas, programStudi);
                arrayMahasiswa.tambahMahasiswa(mahasiswa);
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = scanner.nextLine();
                arrayMahasiswa.hapusMahasiswa(nim);
            } else if (pilihan == 3) {
                System.out.println("Daftar Mahasiswa:");
                arrayMahasiswa.displayMahasiswa();
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
