public class TesSiswa
{
 	public static void main(String[] ar)
 	{
 		Siswa s = new Siswa(12345);

 		System.out.println(s.getNrp());

 		s.setNrp(8030001);
 		System.out.println(s.getNrp());
 	}
}

/**
 * line 3 = Method Main
 * line 5 = mendeklarasi siswa sebagai s
 * line 7 = menampilkan output "12345" dari method accessor
 * line 10 = menampilkan output "8030001" dari method mutator
 */