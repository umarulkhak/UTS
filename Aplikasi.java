import service.*;
import model.*;
import java.util.*;

public class Aplikasi {

    private static BukuService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new BukuService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("Input salah, tolong di cek mas/mba");
                opsi = 0;
            } catch(NoSuchElementException nsee) {

            }
            prosesOpsi(opsi);
        } while(opsi != 5);
    }

    private static void prosesOpsi(int pilihan) {
        switch(pilihan) {
            case 1:
                showFormTambahData();
                break;
            case 2:
                showFormEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan");
                System.out.println("Aplikasi kami.");
        }
    }

    private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\n--= Form Hapus Data =--");
        System.out.print("ID BUKU : ");
        String id_buku = scanner.nextLine();
        service.deleteData(id_buku);
    }

    private static void showFormEditData() {
        scanner = new Scanner(System.in);
        String id_buku, judul, harga;

        System.out.println("\n--= Form Ubah Data Buku=--");
        System.out.print("ID BUKU    : ");
        id_buku = scanner.nextLine();
        System.out.print("JUDUL BUKU : ");
        judul = scanner.nextLine();
        System.out.print("HARGA BUKU : ");
        harga = scanner.nextLine();
        service.updateData(new Buku(id_buku, judul, harga));
    }

    private static void showFormTambahData() {
        scanner = new Scanner(System.in);
        String id_buku, judul, harga;

        System.out.println("\n--= Form Entry Data Buku=--");
        System.out.print("ID BUKU    : ");
        id_buku = scanner.nextLine();
        System.out.print("JUDUL BUKU : ");
        judul = scanner.nextLine();
        System.out.print("HARGA BUKU : ");
        harga = scanner.nextLine();
        service.addData(new Buku(id_buku, judul, harga));
    }

    private static void showMenu() {
        System.out.println("------------------------------");
        System.out.println("---= Manajement Toko Buku =---");
        System.out.println("------------------------------");
        System.out.println("1. Tambah Data Buku");
        System.out.println("2. Ubah Data Buku");
        System.out.println("3. Hapus Data Buku");
        System.out.println("4. Tampilkan Data Buku");
        System.out.println("5. KELUAR");
        System.out.println("------------------------------");
        System.out.print  ("pilihan > ");
    }

}