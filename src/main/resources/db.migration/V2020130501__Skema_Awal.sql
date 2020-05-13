create table transaksi {
    idtransaksi int(90) SERIAL PRIMARY KEY,
    username varchar (100),
    nomer varchar (100),
    provider varchar (100),
    paket varchar (100),
    harga float ,
    tanggal date
};