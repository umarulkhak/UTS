package model;

public class Buku {
    private String id_buku;
    private String judul;
    private String harga;

    public Buku(String id_buku, String judul, String harga) {
        this.id_buku = id_buku;
        this.judul = judul;
        this.harga = harga;
    }

    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public boolean equals(Object object) {
        Buku temp = (Buku) object;
        return id_buku.equals(temp.getId_buku());
    }
}