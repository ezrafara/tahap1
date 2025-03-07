public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("PT. Inovasi Teknologi");

        Karyawan kar1 = new Karyawan("Ezra", 5000000, perusahaan);
        Karyawan kar2 = new Karyawan("Ojan", 6000000, perusahaan);

        kar1.info();
        System.out.println();
        kar2.info();
    }
}