public class Manajer extends Pegawai {
	private String departemen;

	public Manajer(String nama, double gaji, String departemen) {
		Pegawai p = new Pegawai(nama, gaji);
		this.departemen = departemen;
	}

	public void setDepartemen(String departemen) {
	this.departemen = departemen;
	}

	public String getDepartemen() {
	return this.departemen;
	}
}

/**
 * terjadi error karena tidak adanya penurunan Method constructor 
ke sub class, nah disini kita mneurunkan parameter method constructor.
 */