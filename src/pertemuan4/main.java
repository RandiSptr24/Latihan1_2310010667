package pertemuan4;

public class main {
        public static void main(String[] args) {
            Karyawan k1 = new Karyawan("Budi",5000000);
            Programmer p1 = new Programmer("Ani", 8000000,"java");
            
            System.out.println("=== Data Karyawan ===");
            k1.tampilkanInfo();
            
            System.out.println("\n=== Data Programmer ===");
            p1.tampilkanInfo();
        }
    
}x
