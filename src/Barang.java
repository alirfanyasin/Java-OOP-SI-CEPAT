class Barang {

  private String nama;
  private String deskripsi;
  private double berat;
  private int jumlah;
  private double harga;

  public Barang(
    String nama,
    String deskripsi,
    double berat,
    int jumlah,
    double harga
  ) {
    this.nama = nama;
    this.deskripsi = deskripsi;
    this.berat = berat;
    this.jumlah = jumlah;
    this.harga = harga;
  }

  public String getNama() {
    return nama;
  }

  public String getDeskripsi() {
    return deskripsi;
  }

  public double getBerat() {
    return berat;
  }

  public int getJumlah() {
    return jumlah;
  }

  public double getHarga() {
    return harga;
  }
}
