// package com.example.pegawai.model;
// import java.util.*;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.pegawai.repository.PegawaiRepository;

// @Service
// public class PegawaiServiceImpl implements PegawaiService{

//     @Autowired
//     PegawaiRepository pegawaiRepository;

// 	// @Autowired
//     // PegawaiService pegawaiService;

// 	private int id = 1;

// 	List<Pegawai> allPegawai=  new LinkedList<Pegawai>();

// 	// @Override
// 	// public List<Pegawai> getAllPegawai() throws IllegalArgumentException{
//     //     // if(allPegawai != null){
// 	// 		// allPegawai.add(new Pegawai(1,pgw.getNik(),pgw.getName(),pgw.getEmail(),pgw.getAddress(),pgw.getTelp()));
// 	// 		allPegawai = pegawaiRepository.findAll();
// 	// 		System.out.println("all pegawai ==>"+allPegawai);
// 	// 		return allPegawai;
//     //     // }else{
// 	// 		// allPegawai.add(new Pegawai(id++, 1111111,"Primera","Nissan","The Nissan",31222));
// 	// 		// return allPegawai;
// 	// 	// }
// 	// }

// 	@Override
// 	public Optional<Pegawai> getPegawaiById(Integer id){
// 		Optional<Pegawai> pgw = pegawaiRepository.findById(id);
// 		return pgw;
// 	}
	
// 	// public List<Pegawai> search(String keyword){
// 	// 	List<Pegawai> result = new LinkedList<Pegawai>();
// 	// 	if (keyword==null || "".equals(keyword)){
// 	// 		result = pegawaiList;
// 	// 	}else{
// 	// 		for (Pegawai c: pegawaiList){
// 	// 			if (c.getName().toLowerCase().contains(keyword.toLowerCase())
// 	// 				||c.getEmail().toLowerCase().contains(keyword.toLowerCase())){
// 	// 				result.add(c);
// 	// 			}
// 	// 		}
// 	// 	}
// 	// 	return result;
// 	// }
// }
