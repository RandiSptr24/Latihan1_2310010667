package pertemuan2;

public class Mahasiswa {
    String nama;
    int umur;
    String jurusan;
    
public Mahasiswa(String nama, int umur, String jurusan) {
    this.nama = nama;
    this.umur = umur;
    this.jurusan = jurusan;
}

public void tampilkanInfo() {
    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("Umur: " + umur + "tahun");
    System.out.println("Jurusan: " + jurusan);
}
}
