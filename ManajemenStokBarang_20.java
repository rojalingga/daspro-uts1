import java.util.Scanner;

public class ManajemenStokBarang_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaBarang;
        int jmlStok, hargaPerUnit, totalNilaiStok, permintaanBarang, StokAwal;

        while (true) {
            System.out.print("Masukkan Nama Barang (ketik 'selesai' untuk akhiri) : ");
            namaBarang = sc.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Berapa jumlah stok dari barang " +namaBarang+ "? : ");
            jmlStok = sc.nextInt();
            sc.nextLine();

            if (jmlStok == 0) {
                continue;
            }
            StokAwal = jmlStok;

            System.out.print("Masukkan harga per unit dari barang " +namaBarang+ " : ");
            hargaPerUnit = sc.nextInt();
            sc.nextLine();

            totalNilaiStok = jmlStok * hargaPerUnit;

            System.out.println("Jumlah total nilai stok dari barang " +namaBarang+ " : " +totalNilaiStok);

            System.out.print("Masukkan jumlah permintaan barang " +namaBarang+ " : ");
            permintaanBarang = sc.nextInt();
            sc.nextLine();

            if (permintaanBarang <= jmlStok) {
                System.out.println("Jumlah Stok barang " +namaBarang+ " : " +jmlStok);
                System.out.println("Jumlah Permintaan Barang " +namaBarang+ " : " +permintaanBarang);
                jmlStok -= permintaanBarang;
                System.out.println("Permintaan Barang dapat terpenuhi");
                System.out.println("Sisa Stok barang " +namaBarang+ " : " +jmlStok);
            } else if (permintaanBarang > jmlStok) {
                System.out.println("Jumlah Stok barang " +namaBarang+ " : " +jmlStok);
                System.out.println("Jumlah Permintaan Barang " +namaBarang+ " : " +permintaanBarang);
                System.out.println("Maaf Permintaan barang tidak dapat dipenuhi, dikarenakan jumlah permintaan melebihi jumlah stok");
            }

            System.out.println("==============================================");
            System.out.println("===============Hasil Akhir Stok===============");
            System.out.println("Nama Barang : " +namaBarang);
            System.out.println("Jumlah Stok Awal : " +StokAwal);
            System.out.println("Jumlah Permintaan Barang " +namaBarang+ " : " +permintaanBarang);
            System.out.println("Jumlah Stok Akhir : " +jmlStok);

        }
        
    }
}
