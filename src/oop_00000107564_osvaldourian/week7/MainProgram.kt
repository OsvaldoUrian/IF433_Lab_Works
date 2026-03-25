package oop_00000107564_osvaldourian.week7


    fun main() {
        Koneksi.alamatServer = "localhost";
        println("server:" + Koneksi.alamatServer);
        Koneksi.konek_db();

        println("kampus: " + Hitungan.namaKampus);
        println("NIM: " + Hitungan.noIndukKampus);
        println("tambahan: " + Hitungan.penambahan(a=10, b=20));

        Hitungan.pindah_halaman()

    }
