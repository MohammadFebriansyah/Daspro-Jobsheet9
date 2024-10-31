import java.util.Scanner;
public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs= new int[jumlahMhs];
        double totalLulus=0, totalTdkLulus=0;
        int jmlLulus=0, jmlTdkLulus=0;

        for (int i=0; i<jumlahMhs; i++){
            System.out.print("Masukkan nilai mahasiswa ke- "+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] >70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            }else{
                totalTdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            }
        }
        double rata2Lulus = jmlLulus > 0 ? totalLulus/jmlLulus : 0;
        double rata2TdkLulus = jmlTdkLulus > 0 ? totalTdkLulus / jmlTdkLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);

        sc.close();
    }
}
