package Pertemuan3;

public class main {
    public static void main(String[]args) {
        Mahasiswa mhs1 = new Mahasiswa("Andi,", 20);
        
        mhs1.tampilkanInfo();
        
        mhs1.setNama("Budi");
        mhs1.setUmur(22);
        
        System.out.println("\nSetelah diubah: ");
        mhs1.tampilkanInfo();
        
        System.out.println("\nMengakses menggunakan getter:");
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Umur: " + mhs1.getUmur());
        
        
    }
    
}
