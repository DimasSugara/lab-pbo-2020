class Buku {
 	int id;
 	String nama, pengarang, publisher;
 	int jumlah;
 
 public Buku(int id, String nama, String pengarang, String publisher, int jumlah) {
 		this.id = id;
 		this.nama = nama;
 		this.pengarang = pengarang;
 		this.publisher = publisher;
 		this.jumlah = jumlah;
 	}
} 

/**
 * terjadi error karena tidak dapat menciptakan objek dari kelas abstrak
 */