package com.transaksi.uploadfoto.repository;

import com.transaksi.uploadfoto.model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBFileRepository extends JpaRepository<DBFile, String> {
}
