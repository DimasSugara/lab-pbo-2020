public class TesSiswa2
{
 	public static void main(String[] ar)
 	{
 		Siswa s = new Siswa();
 		Siswa ss = new Siswa(8030001, "Upin");

 		//ini akan menimbulkan error
 		//Siswa sss = new Siswa(8030002);
 		System.out.println(s.getNrp() + " " + s.getNama());
 		System.out.println(ss.getNrp() + " " + ss.getNama());
 	}
}

/**
 * Terjadi error karena objek s(line 5) menggunakan method constructor tanpa parameter.
sedangkan objek ss(line 6) menggunakan method constructor dengan dua parameter (int dan String).
 */