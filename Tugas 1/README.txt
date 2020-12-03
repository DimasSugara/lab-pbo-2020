NAMA	: Dimas Rendy Sugara
NIM	: 1908107010040

==> CODE Main.java <==

Line 3   : Deklarasi variable class main
Line 8   : Method public Main
Line 12  : deklarasi variable baru Method main
Line 17  : deklarasi variable baru Method mainkan
Line 20  : Selama True, maka
		Line 21-28 : Menampilkan menu Bus dan Perintah Input
		Line 30-41 : Jika Input adalah 1 (Naikkan Penumpang), akan muncul perintah memasukkan Nama, Umur, dan cek Hamil. Lalu disimpan kedalam array Penumpang.
			     Kemudian dijalankan method naikPenumpang dan toString.
		Line 43-49 : Jika Input adalah 2 (Turunkan Penumpang), akan muncul perintah memasukkan Nama Penumpang yang ada. Kemudian dijalankan method turunkanPen-
			     umpang dan toString.
		Line 51-55 : Jika Input adalah 3 (Lihat Penumpang), akan dijalankan method toString.
		Line 57-58 : Jika Input adalah 4 (exit), Program akan keluar.
		Line 60    : Jika Input tidak sesuai, akan menampilkan "Pilihan Salah!"
			     

==> CODE Penumpang.java <==

Line 1   : Deklarasi variable class penumpang
Line 6   : Method public Penumpang
Line 12  : Method String getNama
Line 16  : Method int getUmur
Line 20  : Method bolean getHamil

==> CODE Bus.java <==

Line 1-2 : Import Package Java
Line 4   : Deklarasi variable class Bus
Line 10  : Deklarasi variable baru Method Bus
Line 16  : Method ArrayList getPenumpangBiasa, Dimana menggunakan for each untuk memindahkan nama Penumpang Biasa
Line 23  : Method ArrayList getPenumpangPrioritas, Dimana menggunakan for each untuk memindahkan nama Penumpang Prioritas
Line 30  : Method int getJumlahPenumpangBiasa, Menampilkan dan memberikan jumlah pada penumpang di kursi Biasa
Line 36  : Method int getJumlahPenumpangPrioritas, Menampilkan dan memberikan jumlah pada penumpang di kursi Prioritas
Line 42  : Method int getJumlahSemuaPenumpang, Menampilkan dan memberikan jumlah pada penumpang di semua kursi 
Line 48  : Method boolean naikPenumpang, untuk kursi biasa dibatasi 4 dan kursi prioritas dibatasi 2. Pada :
		Line 51-53 : Apabila kursi prioritas tersedia dan umur selain 10-60th atau Hamil, akan ditampilkan "Penumpang prioritas Berhasil Ditambahkan!"
		Line 54-56 : Apabila kursi biasa tersedia dan umur selain 10-60th atau Hamil, akan ditampilkan "Penumpang prioritas Berhasil Ditambahkan!"
		Line 58-60 : Apabila kursi biasa tersedia, akan ditampilkan "Penumpang biasa Berhasil Ditambahkan!"
		Line 61-64 : Apabila kursi tidak tersedia, akan ditampilkan "Mohon Maaf, Kursi Tidak Tersedia!"
Line 68  : Method boolean turunkanPenumpang. Bila :
		Line 70-79 : untuk setiap penumpang Biasa, apabila memiliki nama yang sesuai input, maka akan dihapus dan apabila memiliki nama tidak sesuai maka
			     akan ditampilkan "Tidak ada Penumpang di Bus!"
		Line 81-89 : untuk setiap penumpang Prioritas, apabila memiliki nama yang sesuai input, maka akan dihapus dan apabila memiliki nama tidak sesuai maka
			     akan ditampilkan "Tidak ada Penumpang di Bus!"
Line 93  : Deklarasi variable Method toString, dan 
		Line 97-99   : Memindahkan array penumpang biasa ke result1
		Line 100-102 : Memindahkan array penumpang prioritas ke result2
		Line 104-108 : Bila Array Penumpang Biasa kosong, maka akan ditampilkan "daftar nama penumpang Biasa = <kosong>" dan jika nama penumpang biasa ada, 
			       akan ditampilkan "daftar nama penumpang biasa = ...."
		Line 110-114 : Bila Array Penumpang Prioritas kosong, maka akan ditampilkan "daftar nama penumpang Prioritas = <kosong>" dan jika nama penumpang Prio-
			       ritas ada, akan ditampilkan "daftar nama penumpang Prioritas = ...."
		Line 117     : Memberikan nilai ke method toString






