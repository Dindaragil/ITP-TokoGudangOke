import java.util.Scanner;

public class TokoGudangOke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Awal program dijalankan, minta user untuk menginput Nama.
        System.out.printf("Masukkan nama Anda: ");
        String name = input.nextLine();

        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");

        System.out.println("Selamat Datang " + name);
        
        // b. Minta user untuk menginput Nama Barang, Jumlah Barang, Harga Beli, dan Harga Jual. Harga Beli dan Harga Jual boleh berupa bilangan desimal.
        System.out.printf("Masukkan nama barang yang mau ditambah: ");
        String productName = input.nextLine();
        System.out.printf("Masukkan jumlah barang yang mau ditambah: ");
        int amount = input.nextInt();
        System.out.printf("Masukkan harga beli untuk barang tersebut: ");
        double buyPrice = input.nextDouble();
        System.out.printf("Masukkan harga jual untuk barang tersebut: ");
        double sellPrice = input.nextDouble();

        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        
        // c. Tampilkan Rincian Barang berupa Nama Barang, Jumlah Barang, Harga Beli, dan Harga Jual. Tampilkan Harga Beli dan Harga Jual dengan 2 angka dibelakang koma.

        System.out.println("Nama Barang: " + productName);
        System.out.println("Jumlah Barang: " + amount);
        System.out.printf("Harga Beli: Rp %.2f\n", buyPrice );
        System.out.printf("Harga Jual: Rp %.2f", sellPrice);
    }
}