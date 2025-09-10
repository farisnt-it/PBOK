package com.mycompany.posttest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Posttest1 {
    // ArrayList untuk menyimpan data tanaman
    static ArrayList<String> koleksiTanaman = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== MENU KOLEKSI TANAMAN =====");
            System.out.println("1. Tambah Tanaman");
            System.out.println("2. Lihat Tanaman");
            System.out.println("3. Ubah Tanaman");
            System.out.println("4. Hapus Tanaman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahTanaman();
                    break;
                case 2:
                    lihatTanaman();
                    break;
                case 3:
                    ubahTanaman();
                    break;
                case 4:
                    hapusTanaman();
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    // CREATE
    static void tambahTanaman() {
        System.out.print("Masukkan nama tanaman baru: ");
        String tanaman = input.nextLine();
        koleksiTanaman.add(tanaman);
        System.out.println("Tanaman berhasil ditambahkan!");
    }

    // READ
    static void lihatTanaman() {
        if (koleksiTanaman.isEmpty()) {
            System.out.println("Belum ada data tanaman.");
        } else {
            System.out.println("\nDaftar Koleksi Tanaman:");
            for (int i = 0; i < koleksiTanaman.size(); i++) {
                System.out.println((i+1) + ". " + koleksiTanaman.get(i));
            }
        }
    }

    // UPDATE
    static void ubahTanaman() {
        lihatTanaman();
        if (!koleksiTanaman.isEmpty()) {
            System.out.print("Pilih nomor tanaman yang ingin diubah: ");
            int index = input.nextInt();
            input.nextLine(); 

            if (index > 0 && index <= koleksiTanaman.size()) {
                System.out.print("Masukkan nama tanaman baru: ");
                String tanamanBaru = input.nextLine();
                koleksiTanaman.set(index - 1, tanamanBaru);
                System.out.println("Tanaman berhasil diubah!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    // DELETE
    static void hapusTanaman() {
        lihatTanaman();
        if (!koleksiTanaman.isEmpty()) {
            System.out.print("Pilih nomor tanaman yang ingin dihapus: ");
            int index = input.nextInt();
            input.nextLine();

            if (index > 0 && index <= koleksiTanaman.size()) {
                koleksiTanaman.remove(index - 1);
                System.out.println("Tanaman berhasil dihapus!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }
}
