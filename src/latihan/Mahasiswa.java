package latihan;

public class Mahasiswa {
    int npm;
    String nama;
    String kelas;
    
public Mahasiswa (int npm, String nama, String kelas){
    this.npm = npm;
    this.nama = nama;
    this.kelas = kelas;
}
public void tampilkanInfo (){
    System.out.println("NPM Mahasiswa = " + npm);
    System.out.println("Nama Mahasiswa = " + nama);
    System.out.println("Kelas = " + kelas);
}
}
