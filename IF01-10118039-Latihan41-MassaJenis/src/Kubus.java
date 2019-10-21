/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menghitung massa jenis   
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Kubus {

    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int parSisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public int hitungMassaJenis(int parMassa, int volume) {
        return massa / volume;
    }
}
