package Tugas11;

public class Main {
    public static void main(String[] args) {
        // Membuat pengarang
        Pengarang pengarang1 = new Pengarang("J.K. Rowling");
        Pengarang pengarang2 = new Pengarang("George R.R. Martin");

        // Membuat buku dengan pengarang (agregasi)
        Buku buku1 = new Buku("Harry Potter", pengarang1);
        Buku buku2 = new Buku("Game of Thrones", pengarang2);

        // Membuat perpustakaan dengan kapasitas 5 buku (komposisi)
        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan informasi perpustakaan dan buku
        perpustakaan.infoPerpustakaan();
    }
}