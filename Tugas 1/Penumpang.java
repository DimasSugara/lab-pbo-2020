/**
 * Nama : Dimas Rendy Sugara
 * NIM  : 1908107010040
 */

public class Penumpang{
    private String nama;
    private int umur;
    private boolean hamil;

    public Penumpang(String nama, int umur, boolean hamil){
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }

    public String getNama(){
        return this.nama; 
    }
    
    public int getUmur(){
        return this.umur;
    }

    public boolean getHamil(){  
        return this.hamil;
    }
}