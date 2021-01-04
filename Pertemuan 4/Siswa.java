public class Siswa {
	private int nrp;
		public Siswa(int nrpx) {
		nrp = nrpx;
	}
	public void setNrp(int nrpx) {
		nrp = nrpx;
	}
	public int getNrp() {
		return nrp;
	}
}

/**
 * Memiliki hubungan dengan Class TesSiswa.java
 * Enkapsulasi (encapsulation) merupakan proses untuk menyembunyikan hal-hal yang harus
disembunyikan dan menampakkan hal-hal yang boleh ditampakkan. Hal-hal yang perlu disembunyikan
adalah atribut/ instance variable dan implementasi yang ada dalam method. Sedangkan yang boleh
ditampakkan adalah nama method. 
 * atribut nrp dapat diubah di luar class Siswa. Berarti nilai nrp bisa sangat bebas diubah dimanapun. 
Hal ini sangat berbahaya. Oleh karena itu atribut di-enkapsulasi dengan hak akses private. 
 * Hal ini juga berlaku pada method. Jika method dibuat private maka akan muncul error pada
class Tesiswa. karena itu digantikan hak aksesnya menjadi public. 
 */