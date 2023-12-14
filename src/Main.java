import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan alamat: ");
        scanner.nextLine(); // Membersihkan newline character
        String alamat = scanner.nextLine();

        System.out.print("Masukkan pekerjaan: ");
        String pekerjaan = scanner.nextLine();

        // Menyimpan data ke dalam file txt menggunakan PrintWriter dan BufferedWriter
        simpanBiodataKeFile(nama, umur, alamat, pekerjaan);

        System.out.println("Biodata telah disimpan ke dalam file txt.");
    }

    private static void simpanBiodataKeFile(String nama, int umur, String alamat, String pekerjaan) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("biodata.txt")))) {
            writer.println("Nama: " + nama);
            writer.println("Umur: " + umur);
            writer.println("Alamat: " + alamat);
            writer.println("Pekerjaan: " + pekerjaan);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}