# Posttest1 - Aplikasi CRUD Koleksi Tanaman (Java Console)

Program ini adalah aplikasi sederhana berbasis console untuk mengelola koleksi tanaman.  
Program menggunakan *Java* dengan ArrayList untuk menyimpan data, serta menyediakan fitur *CRUD* (Create, Read, Update, Delete).  
Tema yang dipilih adalah *koleksi tanaman*, sehingga pengguna dapat menambah, melihat, mengubah, dan menghapus daftar tanaman yang mereka miliki.

## Fitur

- *Tambah Tanaman:* Menambah nama tanaman baru ke koleksi
- *Lihat Tanaman:* Melihat daftar tanaman yang sudah ditambahkan
- *Ubah Tanaman:* Mengubah nama tanaman yang sudah ada
- *Hapus Tanaman:* Menghapus tanaman dari daftar
- *Keluar:* Menutup aplikasi

##  Alur Program
1. Program menampilkan **menu utama** berisi pilihan fitur.  
2. Pengguna memilih menu dengan memasukkan angka (1–5)
   <img width="908" height="591" alt="image" src="https://github.com/user-attachments/assets/df48a351-6169-4f2a-adcd-cffbee3a530a" />
  
4. Program menjalankan aksi sesuai menu:
   - **1 → Tambah Tanaman**
     <img width="921" height="195" alt="image" src="https://github.com/user-attachments/assets/d9fd0a3a-410f-45ec-877e-52be9a0f9d0e" />

   - **2 → Lihat Tanaman**
     <img width="921" height="300" alt="image" src="https://github.com/user-attachments/assets/4f92e3f1-6f02-402c-9d36-618ecba26fa4" />

   - **3 → Ubah Tanaman**
     <img width="915" height="488" alt="image" src="https://github.com/user-attachments/assets/3a710359-3879-43c1-a223-9861abddcfc1" />

   - **4 → Hapus Tanaman**
     <img width="954" height="464" alt="image" src="https://github.com/user-attachments/assets/6eaac809-b6a2-42c1-9019-dbd226ff00ec" />

   - **5 → Keluar**  
5. Setelah setiap aksi, program kembali ke menu utama, kecuali jika pengguna memilih keluar.

## Contoh input & output
- **Tampilan Menu Utama User diberikan 5 pilihan menu: Menambah Tanaman, Lihat Tanaman, Ubah Tanaman, Hapus Tanaman, atau Keluar.**


<img width="361" height="173" alt="image" src="https://github.com/user-attachments/assets/aaecb2cb-b08a-4733-9bdb-8f875495ef96" />



- **Tambah Tanaman Baru (Create),
Input: Nama tanaman,
Kemudian Tanaman otomatis disimpan dalam ArrayList<Tanaman>.**


<img width="397" height="234" alt="image" src="https://github.com/user-attachments/assets/dbd5246f-e242-4e9c-8204-6c57a81321ec" />

- **Lihat Tanaman (Read),**

**Jika daftar kosong → tampil pesan "Belum ada tanaman".**

<img width="373" height="201" alt="image" src="https://github.com/user-attachments/assets/4ec191f0-7138-4ece-9b47-e2652fbd9887" />


**Jika ada → tampil semua tanaman dengan format:**


<img width="338" height="244" alt="image" src="https://github.com/user-attachments/assets/e0d247c7-25f4-450f-bb38-030e6437e27a" />

- **Ubah Tanaman (Update)**

**Cari tanaman berdasarkan nama.**

**Jika ketemu → user bisa mengganti Tanaman di koleksi**

<img width="415" height="333" alt="image" src="https://github.com/user-attachments/assets/778bac31-4e8b-4afc-9b80-a471cb22fc97" />


**Jika tidak ditemukan → tampil pesan "Belum ada Tanaman".**

<img width="395" height="203" alt="image" src="https://github.com/user-attachments/assets/3054377f-c388-4a8c-9ec1-afeaa79159db" />

- **Hapus Tanaman (Delete)**

**Cari tanaman berdasarkan nama.**

**Jika ketemu → tanaman dapat dihapus dari daftar.**

<img width="457" height="303" alt="image" src="https://github.com/user-attachments/assets/c3369e93-361f-4a53-8ba8-1bba1e61a8df" />


**Jika tidak ditemukan → tampil pesan "Tanaman Tidak Ada".**

<img width="380" height="201" alt="image" src="https://github.com/user-attachments/assets/46402560-b73e-4b4d-81e9-929834ea3f0e" />

- **Keluar Program**

**Program berhenti saat user memilih menu 5**
<img width="759" height="340" alt="image" src="https://github.com/user-attachments/assets/a350099b-30dd-4926-9e73-c178ad4c77a3" />








## Teknologi yang Digunakan
- **Java** (JDK 8+)
- **ArrayList** untuk menyimpan data
- **Scanner** untuk input pengguna
- **Switch-case** untuk pemilihan menu
- **Perulangan do-while** untuk menampilkan menu berulang kali
