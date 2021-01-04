//Penggunaan Keyword This
public class Siswa2 {
	public int nrp;

	public Siswa2(int nrp){
		nrp = nrp;
	}
	public void setNrp(int nrp) {
		this.nrp = nrp;
	}
	public int getNrp() {
		return nrp;
	}
}

/**
 * nama variabel dari parameter dibuat sama dengan nama atribut agar tidak menimbulkan 
error. Keyword this berguna untuk merujuk kepada data atribut, constructor dan method 
yang ada di class ini. This juga dapat menghilangkan ambigu.
 * line 4 = Method Constractor
 * line 7 = Method Mutator
 * line 10 = Method Accessor
 */