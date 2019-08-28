package jere.example.trafficsigns;

public class ArrayModel {
    String jawaban, pilihan_1, pilihan_2, pilihan_3;
    int gambar;

    public ArrayModel(String jawaban, String pilihan_1, String pilihan_2, String pilihan_3, int gambar) {
        this.jawaban = jawaban;
        this.pilihan_1 = pilihan_1;
        this.pilihan_2 = pilihan_2;
        this.pilihan_3 = pilihan_3;
        this.gambar = gambar;
    }

    public String getJawaban() {
        return jawaban;
    }

    public String getPilihan_1() {
        return pilihan_1;
    }

    public String getPilihan_2() {
        return pilihan_2;
    }

    public String getPilihan_3() {
        return pilihan_3;
    }

    public int getGambar() {
        return gambar;
    }
}