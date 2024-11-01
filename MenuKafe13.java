import java.util.Scanner;

public class MenuKafe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cariMakanan = sc.nextLine();

        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(cariMakanan)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan '" + cariMakanan + "' tersedia di menu.");
        } else {
            System.out.println("Makanan '" + cariMakanan + "' tidak tersedia di menu.");
        }

        sc.close();
    }
}
