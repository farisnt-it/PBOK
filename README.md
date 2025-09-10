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
<img width="879" height="789" alt="image" src="https://github.com/user-attachments/assets/74f3397d-307c-49e7-94fb-d795a7f1e80b" />
<img width="864" height="308" alt="image" src="https://github.com/user-attachments/assets/2868b674-3025-4994-b035-a3af292ca836" />

1. Saat dijalankan, program menampilkan menu utama.
2. Pengguna memilih menu dengan input angka (1–5).
3. Program akan menjalankan fungsi sesuai menu:
   - **1 (Tambah)** → Input nama tanaman, lalu simpan di `ArrayList`.
     <img width="706" height="196" alt="image" src="https://github.com/user-attachments/assets/815b6134-e74e-410c-8309-260b5b7d5202" />

   - **2 (Lihat)** → Menampilkan daftar tanaman dengan perulangan.
     <img width="869" height="483" alt="image" src="https://github.com/user-attachments/assets/47bee000-85d8-46d4-a582-5b2f68704f81" />

   - **3 (Ubah)** → Menampilkan daftar, pengguna pilih nomor, lalu input nama baru.
     <img width="855" height="303" alt="image" src="https://github.com/user-attachments/assets/66584d94-f9b9-4a5d-b181-d68fd1ad4122" />

   - **4 (Hapus)** → Menampilkan daftar, pengguna pilih nomor, lalu hapus dari `ArrayList`.
     <img width="893" height="456" alt="image" src="https://github.com/user-attachments/assets/3a62e812-e356-4c96-a821-0775752ad38d" />

   - **5 (Keluar)** → Program berhenti.
     
4. Setelah suatu aksi selesai, program kembali ke menu utama, kecuali pengguna memilih keluar.

