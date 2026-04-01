# Jobsheet-5
## Pertanyaan
1.	Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
2.	Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
3.	Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
4.	Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()!

## Jawaban
1. - if (n == 1): Berfungsi sebagai kondisi berhenti (base case) agar proses pemanggilan tidak terjadi terus-menerus.
- else: Berfungsi sebagai langkah conquer untuk memecahkan masalah secara rekursif dengan memanggil fungsinya sendiri.
2. 
```java
int i = 1;
while (i <= n) {
    faktorial = faktorial * i;
    i++;
}
```
3. - fakto *= i: Adalah proses iteratif, nilainya didapat dari perulangan yang berjalan maju.
- int fakto = n * faktorialDC(n-1): Adalah proses rekursif, nilainya didapat dengan memecah masalah menggunakan pemanggilan fungsinya sendiri.
4. - faktorialBF() (Brute Force): Memecahkan persoalan secara langsung dan sederhana dengan menghitung satu per satu secara berurutan menggunakan struktur perulangan.
- faktorialDC() (Divide and Conquer): Membagi masalah menjadi sub-masalah yang lebih kecil dan menyelesaikannya secara rekursif (tanpa perulangan looping biasa).

## Pertanyaan
1.	Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
2.	Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
3.	Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
4.	Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

## Jawaban
1. - pangkatBF(): Menggunakan pendekatan iteratif (perulangan for). Basis (a) dikalikan secara berurutan satu per satu sebanyak pangkatnya (n).
- pangkatDC(): Menggunakan pendekatan rekursif. Nilai pangkat dibagi menjadi dua (n/2) secara terus-menerus, kemudian hasil dari sub-masalah tersebut dihitung dan dikalikan.
2. Ya, sudah termasuk
- return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a); (menggabungkan hasil jika pangkat ganjil)
- return (pangkatDC(a, n/2) * pangkatDC(a, n/2)); (menggabungkan hasil jika pangkat genap)
3. Method tersebut menjadi kurang relevan untuk memiliki parameter karena class Pangkat sudah memiliki atribut nilai dan pangkat.
``` java
public int pangkatBF() {
    int hasil = 1;
    // Menggunakan atribut class langsung
    for (int i = 0; i < pangkat; i++) { 
        hasil = hasil * nilai;
    }
    return hasil;
}
```
4. - Cara Kerja pangkatBF(): Bekerja lurus secara sekuensial dengan melakukan operasi perkalian sebanyak n kali. Semakin besar pangkatnya, semakin lama perulangannya.
- Cara Kerja pangkatDC(): Bekerja dengan membelah masalah (membagi pangkat menjadi dua), menyelesaikannya, lalu menggabungkannya kembali.

## Pertanyaan
1.	Kenapa dibutuhkan variable mid pada method TotalDC()?
2.	Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
3.	Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
4.	Apakah base case dari totalDC()?
5.	Tarik Kesimpulan tentang cara kerja totalDC()

## Jawaban
1. Variabel mid digunakan sebagai titik tengah untuk membagi array menjadi dua bagian (sub-masalah), yaitu sisi kiri dan sisi kanan.
2. Statement tersebut merepresentasikan tahap Conquer. Tujuannya adalah untuk menyelesaikan (menghitung total) dari masing-masing sub-bagian array tersebut secara rekursif dengan memanggil kembali method totalDC().
3. Penjumlahan ini adalah tahap Combine yang dilakukan untuk menggabungkan total nilai dari bagian kiri sum dan total nilai bagian kanan sum agar mendapatkan hasil akhir berupa total nilai keseluruhan array semula.
4. Base case-nya adalah kondisi if `(l == r) { return arr[l]; }`. berarti proses rekursif (pembagian) akan berhenti jika bagian array yang sedang diproses hanya menyisakan 1 elemen, dan langsung mengembalikan nilai elemen tersebut.
5. Method totalDC() bekerja dengan membagi masalah (array) menjadi dua bagian secara terus-menerus hingga menyisakan satu elemen tunggal (Divide). Kemudian, ia akan mengembalikan nilai elemen terkecil tersebut (Conquer) , lalu menggabungkan dan menjumlahkannya kembali dari bawah ke atas secara bertahap hingga total nilai elemen array secara utuh.