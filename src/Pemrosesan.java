class Pemrosesan extends Transaction {

  // Atribut private untuk merepresentasikan objek-objek dalam transaksi
  private Barang product;
  private Pengiriman shippingInfo;
  private Biaya costInfo;
  private Pelanggan customerInfo;

  // Constructor untuk pengisian data
  public Pemrosesan(
    Barang product,
    Pengiriman shippingInfo,
    Biaya costInfo,
    Pelanggan customerInfo
  ) {
    this.product = product;
    this.shippingInfo = shippingInfo;
    this.costInfo = costInfo;
    this.customerInfo = customerInfo;
  }
  // Override method sesuai kebutuhan
}
