class Pelanggan {

  private String namaPengirim;
  private String alamatPengirim;
  private String namaPenerima;
  private String alamatPenerima;
  private String nomorPengirim;
  private String nomorPenerima;

  public Pelanggan(
    String namaPengirim,
    String alamatPengirim,
    String namaPenerima,
    String alamatPenerima,
    String nomorPengirim,
    String nomorPenerima
  ) {
    this.namaPengirim = namaPengirim;
    this.alamatPengirim = alamatPengirim;
    this.namaPenerima = namaPenerima;
    this.alamatPenerima = alamatPenerima;
    this.nomorPengirim = nomorPengirim;
    this.nomorPenerima = nomorPenerima;
  }

  public String getNamaPengirim() {
    return namaPengirim;
  }

  public String getAlamatPengirim() {
    return alamatPengirim;
  }

  public String getNamaPenerima() {
    return namaPenerima;
  }

  public String getAlamatPenerima() {
    return alamatPenerima;
  }

  public String getNomorPengirim() {
    return nomorPengirim;
  }

  public String getNomorPenerima() {
    return nomorPenerima;
  }
}
