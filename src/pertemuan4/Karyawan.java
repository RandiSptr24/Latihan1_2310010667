package pertemuan4;

public class Karyawan {
    private String nama;
    private int gaji;
    
    public Karyawan(String nama, int gaji){
        this.nama = nama;
        this.gaji= gaji;
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int Gaji) {
        this.gaji = gaji;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}
