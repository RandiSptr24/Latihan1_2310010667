package pertemuan2;

public class Dosen {
    String nama;
    String mataKuliah;
    int nip;
    
    public Dosen(String nama, String mataKuliah, int nip) {
        this.nama= nama;
        this.mataKuliah = mataKuliah;
        this.nip = nip;
    }
   public void tampilkanInfo() {
       System.out.println("Nama Dosen: " + nama);
       System.out.println("Mata Kuliah: " + mataKuliah);
       System.out.println("NIP: " + nip);
   }
}
