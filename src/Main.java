import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Pelanggan userid = null;
    Barang brg = null;
    Pengiriman kirim = null;
    Biaya bya = null;
    int urut = 0;
    int pilih;
    Random rand = new Random();
    int upperbound = 9999999;

    Scanner keyboard = new Scanner(System.in);
    clrscr();

    while (true) {
      System.out.println("##################################");
      System.out.println("########## SECEPAT DATA ##########");
      System.out.println("##################################");
      System.out.println("1. Masukkan Data Baru");
      System.out.println("2. Tampilkan Semua Data");
      System.out.println("3. Exit");
      System.out.print("Masukkan Pilihan: ");
      pilih = keyboard.nextInt();

      switch (pilih) {
        case 1:
          clrscr();
          keyboard.nextLine();
          urut = urut + 1;

          System.out.println("##########################################");
          System.out.println("########## INPUT DATA PELANGGAN ##########");
          System.out.println("##########################################");
          System.out.print("Nama Pengirim        : ");
          String namaPengirim = keyboard.nextLine();
          System.out.print("Alamat Pengirim      : ");
          String alamatPengirim = keyboard.nextLine();
          System.out.print("No Telp Pengirim     : ");
          String nomorPengirim = keyboard.nextLine();
          System.out.print("Nama Penerima        : ");
          String namaPenerima = keyboard.nextLine();
          System.out.print("Alamat Penerima      : ");
          String alamatPenerima = keyboard.nextLine();
          System.out.print("Nomor Telp Penerima  : ");
          String nomorPenerima = keyboard.nextLine();

          userid =
            new Pelanggan(
              namaPengirim,
              alamatPengirim,
              namaPenerima,
              alamatPenerima,
              nomorPengirim,
              nomorPenerima
            );

          clrscr();
          keyboard.nextLine();

          System.out.println("#######################################");
          System.out.println("########## INPUT DATA BARANG ##########");
          System.out.println("#######################################");
          System.out.print("Nama Barang         : ");
          String namaBarang = keyboard.nextLine();
          System.out.print("Deskripsi Barang    : ");
          String deskripsiBarang = keyboard.nextLine();
          System.out.print("Berat Barang(kg)    : ");
          double beratBarang = keyboard.nextDouble();
          System.out.print("Jumlah Barang       : ");
          int jumlahBarang = keyboard.nextInt();
          System.out.print("Harga Barang        : ");
          double hargaBarang = keyboard.nextDouble();

          brg =
            new Barang(
              namaBarang,
              deskripsiBarang,
              beratBarang,
              jumlahBarang,
              hargaBarang
            );

          clrscr();

          System.out.println("###########################################");
          System.out.println("########## INPUT DATA PENGIRIMAN ##########");
          System.out.println("###########################################");
          System.out.println("Jenis Layanan?");
          System.out.println("1. Regular");
          System.out.println("2. Express");
          System.out.print("Masukkan Pilihan: ");
          pilih = keyboard.nextInt();

          kirim =
            new Pengiriman(
              userid,
              brg,
              namaPengirim,
              namaPengirim,
              namaPengirim,
              namaPengirim
            );

          bya = new Biaya();

          switch (pilih) {
            case 1:
              bya.setBiayaPengiriman(20000);
              bya.setBiayaTambahan(0);
              kirim.setTipeLayanan("Regular");
              break;
            case 2:
              bya.setBiayaPengiriman(50000);
              bya.setBiayaTambahan(0);
              kirim.setTipeLayanan("Express");
              break;
          }

          clrscr();

          System.out.println("###########################################");
          System.out.println("########## INPUT DATA PENGIRIMAN ##########");
          System.out.println("###########################################");
          System.out.println("Status Pengiriman?");
          System.out.println("1. Belum Dikirim");
          System.out.println("2. Sedang Dikirim");
          System.out.println("3. Sudah Diterima");
          System.out.print("Masukkan Pilihan: ");
          pilih = keyboard.nextInt();

          switch (pilih) {
            case 1:
              kirim.setStatusPengiriman("Belum Dikirim");
              break;
            case 2:
              kirim.setStatusPengiriman("Sedang Dikirim");
              break;
            case 3:
              kirim.setStatusPengiriman("Sudah Diterima");
              break;
          }

          clrscr();

          System.out.println("###########################################");
          System.out.println("########## INPUT DATA PENGIRIMAN ##########");
          System.out.println("###########################################");
          System.out.println("Metode Pembayaran?");
          System.out.println("1. CASH");
          System.out.println("2. PAYLATER");
          System.out.print("Masukkan Pilihan: ");
          pilih = keyboard.nextInt();

          switch (pilih) {
            case 1:
              bya.setBiayaTambahan(1000);
              kirim.setMetodePembayaran("CASH");
              break;
            case 2:
              bya.setBiayaTambahan(5000);
              kirim.setMetodePembayaran("PAYLATER");
              break;
          }

          int simpan = rand.nextInt(upperbound);
          kirim.setNoResi(simpan);
          kirim.setTujuanPengiriman(alamatPenerima);

          clrscr();
          break;
        case 2:
          clrscr();
          System.out.println("###################################");
          System.out.println("########## SHOW ALL DATA ##########");
          System.out.println("###################################");
          for (int a = 0; a < urut; a++) {
            System.out.println("nomor : " + (a + 1));
            System.out.println("## PENGIRIM ##");
            System.out.println("Nama      : " + userid.getNamaPengirim());
            System.out.println("Alamat    : " + userid.getAlamatPengirim());
            System.out.println("no HP     : " + userid.getNomorPengirim());
            System.out.println("## PENERIMA ##");
            System.out.println("Nama      : " + userid.getNamaPenerima());
            System.out.println("Alamat    : " + userid.getAlamatPenerima());
            System.out.println("no HP     : " + userid.getNomorPenerima());
            System.out.println();
            System.out.println("## BARANG ##");
            System.out.println("Nama      : " + brg.getNama());
            System.out.println("Deskripsi : " + brg.getDeskripsi());
            System.out.println("Berat     : " + brg.getBerat());
            System.out.println("Jumlah    : " + brg.getJumlah());
            System.out.println("Harga     : " + brg.getHarga());
            System.out.println();
            System.out.println("## DETAIL ##");
            System.out.println(
              "No Resi                   : " + kirim.getNoResi()
            );
            System.out.println(
              "Jenis Layanan             : " + kirim.getTipeLayanan()
            );
            System.out.println(
              "Status Pengiriman         : " + kirim.getStatusPengiriman()
            );
            System.out.println(
              "Metode Pembayaran         : " + kirim.getMetodePembayaran()
            );
            int aa = bya.getBiayaPengiriman();
            int bb = bya.getBiayaTambahan();
            int cc = aa + bb; // total pembayaran
            System.out.println("Total Biaya Pengiriman    : " + cc);
            System.out.println("###################################");
          }
          keyboard.nextLine();
          keyboard.nextLine();
          System.out.println();
          System.out.println("press enter to return back");
          clrscr();
          break;
        case 3:
          System.exit(0);
          break;
      }
    }
  }

  public static void clrscr() {
    try {
      if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder(
        "cmd",
        "/c",
        "cls"
      )
        .inheritIO()
        .start()
        .waitFor(); else new ProcessBuilder("clear")
        .inheritIO()
        .start()
        .waitFor();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
