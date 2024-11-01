import java.util.Scanner;
public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai yang akan diinput: ");
        int jmlNilai = sc.nextInt();
        int[] arrNilai =new int[jmlNilai];

        for (int i=0; i<jmlNilai; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i]=sc.nextInt();
        }
        System.out.print("Masukkan nilai yang akan dicari: ");
        int key = sc.nextInt();

        int hasil = 0;
        for(int i=0; i<arrNilai.length; i++){
            if (key==arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }

    System.out.println();
    if (hasil != 0) {
        System.out.println("Nilai "+key+" ketemu, merupakan niai mahasiswa ke-"+hasil);
    }else{
    System.out.println("Nilai "+key+"tidak ditemukan dalam array.");
    }
    sc.close();
    }
}
