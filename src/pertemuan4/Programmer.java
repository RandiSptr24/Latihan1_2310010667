package pertemuan4;

public class Programmer extends Karyawan {
    private String bahasaPemrograman;
    
    public Programmer(String nama, int gaji, String bahasaPemrograman) {
        super(nama, gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bahasa Pemrograman: " + bahasaPemrograman);
    }
    
}
