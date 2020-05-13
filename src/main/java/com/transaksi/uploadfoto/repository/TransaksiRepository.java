package com.transaksi.uploadfoto.repository;

import com.transaksi.uploadfoto.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepository extends JpaRepository<Transaksi,Integer> {
}
