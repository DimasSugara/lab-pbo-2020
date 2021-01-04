//Penggunaan Method Overloading

public class Siswa3
{
 	private int nrp;
 	private String nama;

 	public Siswa3()
 	{
 		this.nrp = 12345;
 		this.nama = "nama default";
 	}

 	public Siswa3(int nrp, String nama)
 	{
 		this.nrp = nrp;
 		this.nama = nama;
 	}

 	public void setNrp(int nrp)
 	{
 		this.nrp = nrp;
 	}

 	public int getNrp()
 	{
 		return this.nrp;
 	}

 	public void setNama(String nama)
 	{
 		this.nama = nama;
 	}

 	public String getNama()
 	{
 		return this.nama;
 	}
}

/** 
 * Method overloading adalah beberapa method yang memiliki nama method yang sama namun berbeda
dari jumlah parameter, tipe data parameter dan urutan parameter. Saat objek menggunakan method yang memiliki method
overloading, maka compiler akan mencari padanan yang paling sesuai dengan method overloading yang
ada. Jika tidak ada padanan maka akan muncul error.
 * line 8 & 14 = Method Overloading
 * line 25 = Method Constractor
 * line 30 = Method Mutator
 * line 35 = Method Accessor
 */