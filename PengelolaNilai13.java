import java.util.Scanner;

public class PengelolaNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }

        double totalNilai = 0;
        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }
        
        double rataRata = totalNilai / jumlahNilai;

        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("\nNilai mahasiswa yang telah dimasukkan:");
        for (int nilai : nilaiMahasiswa) {
            System.out.println(nilai);
        }

        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        sc.close();
    }
}
