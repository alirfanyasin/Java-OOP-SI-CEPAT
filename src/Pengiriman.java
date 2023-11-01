class Pengiriman {

  private String tujuanPengiriman;
  private String tipeLayanan;
  private String statusPengiriman;
  private String metodePembayaran;
  private int noResi;

  public Pengiriman(
    String tujuanPengiriman,
    String tipeLayanan,
    String statusPengiriman,
    String metodePembayaran,
    int noResi
  ) {
    this.tujuanPengiriman = tujuanPengiriman;
    this.tipeLayanan = tipeLayanan;
    this.statusPengiriman = statusPengiriman;
    this.metodePembayaran = metodePembayaran;
    this.noResi = noResi;
  }

  public Pengiriman(
    Pelanggan userid,
    Barang brg,
    Object object,
    Object object2,
    Object object3,
    Object object4
  ) {}

  public String getTujuanPengiriman() {
    return tujuanPengiriman;
  }

  public String getTipeLayanan() {
    return tipeLayanan;
  }

  public String getStatusPengiriman() {
    return statusPengiriman;
  }

  public String getMetodePembayaran() {
    return metodePembayaran;
  }

  public int getNoResi() {
    return noResi;
  }

  public Biaya getBiaya() {
    return null;
  }

  public Barang getBarang() {
    return null;
  }

  public Pelanggan getPelanggan() {
    return null;
  }

  public void setTujuanPengiriman(String alt2) {}

  public void setNoResi(int noResi) {
    this.noResi = noResi;
  }

  public void setTipeLayanan(String tipeLayanan) {
    this.tipeLayanan = tipeLayanan;
  }

  public void setStatusPengiriman(String statusPengiriman) {
    this.statusPengiriman = statusPengiriman;
  }

  public void setMetodePembayaran(String metodePembayaran) {
    this.metodePembayaran = metodePembayaran;
  }
}
