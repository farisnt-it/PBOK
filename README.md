# post test 1 pbo

# Program CRUD Koleksi Tanaman

## Deskripsi Singkat
Program ini adalah aplikasi sederhana berbasis console untuk mengelola koleksi tanaman.  
Program menggunakan **Java** dengan `ArrayList` untuk menyimpan data, serta menyediakan fitur **CRUD** (Create, Read, Update, Delete).  
Tema yang dipilih adalah **koleksi tanaman**, sehingga pengguna dapat menambah, melihat, mengubah, dan menghapus daftar tanaman yang mereka miliki.

## Fitur Program
1. **Tambah Tanaman** → Menambahkan data tanaman baru ke koleksi.
2. **Lihat Tanaman** → Menampilkan seluruh daftar tanaman dalam koleksi.
3. **Ubah Tanaman** → Mengedit data tanaman berdasarkan nomor urut.
4. **Hapus Tanaman** → Menghapus tanaman dari daftar.
5. **Keluar** → Mengakhiri program.

## Alur Program
1. Saat dijalankan, program menampilkan menu utama.
2. Pengguna memilih menu dengan input angka (1–5).
3. Program akan menjalankan fungsi sesuai menu:
   - **1 (Tambah)** → Input nama tanaman, lalu simpan di `ArrayList`.
   - **2 (Lihat)** → Menampilkan daftar tanaman dengan perulangan.
   - **3 (Ubah)** → Menampilkan daftar, pengguna pilih nomor, lalu input nama baru.
   - **4 (Hapus)** → Menampilkan daftar, pengguna pilih nomor, lalu hapus dari `ArrayList`.
   - **5 (Keluar)** → Program berhenti.
4. Setelah suatu aksi selesai, program kembali ke menu utama, kecuali pengguna memilih keluar.

## Cara Menjalankan
1. Clone repository ini.
2. Compile program dengan perintah:
   ```bash
   javac Main.java
