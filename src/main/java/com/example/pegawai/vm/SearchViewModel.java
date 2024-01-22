// package com.example.pegawai.vm;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import com.example.pegawai.model.Pegawai;
// import com.example.pegawai.model.PegawaiService;
// // import com.example.pegawai.model.PegawaiServiceImpl;

// public class SearchViewModel {

//     private String keyword;
//     private List<Pegawai> pegawaiList;
//     private Pegawai selectedPegawai;

//     @Autowired
//     private PegawaiService pegawaiService = new PegawaiService();

//     public void setKeyword(String keyword) {
//         this.keyword = keyword;
//     }
//     public String getKeyword() {
//         return keyword;
//     }
 
//     public List<Pegawai> getPegawaiList(){
//         pegawaiList = pegawaiService.getAllPegawai();
//         // Optional pegawaiList = pegawaiService.getPegawaiById(1);
//         System.out.println("pegawaiList==>"+pegawaiList);
//         return pegawaiList;
//     }
         
//     public void setSelectedPegawai(Pegawai selectedPegawai) {
//         this.selectedPegawai = selectedPegawai;
//     }
//     public Pegawai getSelectedPegawai() {
//         return selectedPegawai;
//     }

//     // @Command
//     // @NotifyChange("pegawaiList")
//     // public void search(){
//     //     pegawaiList = pegawaiService.search(keyword);
//     // }
// }
    
