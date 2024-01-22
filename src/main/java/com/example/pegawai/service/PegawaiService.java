package com.example.pegawai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pegawai.model.Pegawai;
import com.example.pegawai.repository.PegawaiRepository;

@Service
// public interface PegawaiService {
//     // public List<Pegawai> getAllPegawai();
//     public Optional<Pegawai> getPegawaiById(Integer id);
//     // public List<Pegawai> search(String keywoard);
// }
public class PegawaiService {

    @Autowired
    private PegawaiRepository pegawaiRepository;

    public List<Pegawai> getAllPegawai() {
        return pegawaiRepository.findAll();
    }

    public Optional<Pegawai> getPegawaiById(Integer id) {
        return pegawaiRepository.findById(id);
    }

    public Pegawai savePegawai(Pegawai pegawai) {
        return pegawaiRepository.save(pegawai);
    }

    public Pegawai updatePegawai(Integer id, Pegawai pegawai) {
        Pegawai pegawai1 = pegawaiRepository.findById(id).orElseThrow();
        pegawai1.setNik(pegawai.getNik());
        pegawai1.setName(pegawai.getName());
        pegawai1.setEmail(pegawai.getEmail());
        pegawai1.setAddress(pegawai.getAddress());
        pegawai1.setTelp(pegawai.getTelp());
        pegawaiRepository.save(pegawai1);
        return pegawai;
    }

    public void deletePegawai(Integer id) {
        pegawaiRepository.deleteById(id);
    }
}