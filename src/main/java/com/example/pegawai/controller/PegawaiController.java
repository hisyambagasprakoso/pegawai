package com.example.pegawai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.pegawai.model.Pegawai;
import com.example.pegawai.service.PegawaiService;

import java.util.List;

@RestController
@RequestMapping("/pegawai")
public class PegawaiController {

    @Autowired
    private PegawaiService pegawaiService;

    @GetMapping("/all")
    public List<Pegawai> getAllPegawai() {
        return pegawaiService.getAllPegawai();
    }

    @GetMapping("/{id}")
    public Pegawai getPegawaiById(@PathVariable Integer id) {
        return pegawaiService.getPegawaiById(id).orElse(null);
    }

    @PostMapping("/add")
    public Pegawai savePegawai(@RequestBody Pegawai pegawai) {
        return pegawaiService.savePegawai(pegawai);
    }

    @PutMapping("/{id}")
    public Pegawai updatePegawai(@PathVariable Integer id, @RequestBody Pegawai pegawai){
        return pegawaiService.updatePegawai(id, pegawai);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePegawai(@PathVariable Integer id) {
        pegawaiService.deletePegawai(id);
    }
}
