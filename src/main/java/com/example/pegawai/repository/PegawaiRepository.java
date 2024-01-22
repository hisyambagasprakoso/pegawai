package com.example.pegawai.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pegawai.model.Pegawai;

@Repository
public interface PegawaiRepository extends JpaRepository<Pegawai,Integer>{
}
