package perulangan;

import java.util.Scanner;

public class HargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Item yang Dibeli : ");
        int jumlahitem = input.nextInt();

        int i = 1;
        int harga = 0;
        int jumlahBarang = 0;
        int totalPembelian= 0;
        while (jumlahitem >= i) {

        System.out.print(i + ". " + "Nama Barang : ");
        String namaBarang = input.next();

        System.out.print(i + ". " +"Harga : ");
        harga = input.nextInt();

        System.out.print(i + ". " +"Jumlah : ");
        jumlahBarang = input.nextInt();
        System.out.println("======================");

        totalPembelian += harga * jumlahBarang;
        i++;
    }
    
    System.out.println("Jumlah Item Yang Dibeli : " + jumlahitem);
    System.out.println("Total Pembelian : " + totalPembelian);
    }
}
