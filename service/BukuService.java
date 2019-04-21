package service;


import  java.util.*;
import model.*;

public class BukuService {

    private static List<Buku> data = new LinkedList<Buku>();

    public void addData(Buku bk) {
        data.add(bk);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Buku bk) {
        int index = data.indexOf(bk);
        if(index >= 0) {
            data.set(index, bk);
            System.out.println("data telah diupdate");
        }
    }

    public void deleteData(String id_buku) {
        int idx = data.indexOf(new Buku(id_buku, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah dihapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(Buku bk : data) {
            System.out.println("-----------------------------");
            System.out.println("data ke-" + i++);
            System.out.println("-----------------------------");
            System.out.println("  ID BUKU    : " + bk.getId_buku());
            System.out.println("  JUDUL BUKU : " + bk.getJudul());
            System.out.println("  HARGA BUKU : " + bk.getHarga());
        }
    }

}