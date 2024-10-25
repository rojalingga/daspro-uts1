import java.util.Scanner;


public class ManajemenNilai_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaSiswa;
        double nilai, rata, total = 0;
        int jmlSiswa = 0, diatasRR  = 0, dibawahRR = 0;

        while (true) {
            System.out.print("Masukkan Nama Siswa (ketik 'selesai' untuk akhiri) : ");
            namaSiswa = sc.nextLine();

            if (namaSiswa.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan Nilai Siswa "+namaSiswa+ " : ");
            nilai = sc.nextDouble();

            sc.nextLine();

            total += nilai;
            jmlSiswa++;

            rata = total / jmlSiswa;

            if (nilai > rata) {
                diatasRR++;
            } else if (nilai < rata) {
                dibawahRR++;
            }
            System.out.println("Rata-rata saat ini : " +rata);
        }

        if (jmlSiswa > 0) {
            rata = total / jmlSiswa;

            System.out.println("Rata-rata nilai kelas : " + rata);

            System.out.println("Jumlah siswa dengan nilai di atas rata-rata: " + diatasRR);
            System.out.println("Jumlah siswa dengan nilai di bawah rata-rata: " + dibawahRR);

            if (diatasRR / jmlSiswa > 0.5) {
                System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa memiliki nilai di bawah rata-rata.");
            }
        } else {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
        }

    }
    }
