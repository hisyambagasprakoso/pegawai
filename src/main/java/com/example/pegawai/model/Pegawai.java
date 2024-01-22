package com.example.pegawai.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor(force = true)
// @Table(name = "pegawai")
// @NamedQuery(name="Pegawai.findAll", query="SELECT p FROM Pegawai p")
public class Pegawai {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer nik;
    private String name;
    private String email;
    private String address;
    private Integer telp;

  //   public Pegawai() {
  //   }

  //   public Pegawai(Integer id, Integer nik, String name, String email, String address, Integer telp) {
	// 	this.id = id;
	// 	this.nik = nik;
	// 	this.name = name;
	// 	this.email = email;
	// 	this.address = address;
	// 	this.telp = telp;
	// }
}
