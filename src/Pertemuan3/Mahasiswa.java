package Pertemuan3;


public class Mahasiswa {
    private String nama;
    private int umur;
    
    //konstruktur
    public Mahasiswa(String nama, int umur){
    this.nama = nama;
    this.umur = umur;
}
    //mutator
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    //Accessor
    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
