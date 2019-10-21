/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menghitung massa jenis  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);

        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi \t: " + kubus.getSisi());
        System.out.println("Massa \t: " + kubus.getMassa());
        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("Volume\t\t: " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis\t: " + kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
    }

}
