package pertemuan2;

public class Main {
    public static void main(String[]args) {
        Mahasiswa mhs1 = new Mahasiswa("Randi", 20 , "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Budi", 22, "Farmasi");
        
        Dosen dosen1 = new Dosen("Pak Edya", "Pemrograman Berbasis Objek", 12345);
        Dosen dosen2 = new Dosen("Pak Jamanhuri", "Pancasila", 45678);
        
        System.out.println("---- Data Mahasiswa ----");
        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
        
        System.out.println("\n--- Data Dosen ---");
        dosen1.tampilkanInfo();
        System.out.println();
        dosen2.tampilkanInfo();
    }
}
