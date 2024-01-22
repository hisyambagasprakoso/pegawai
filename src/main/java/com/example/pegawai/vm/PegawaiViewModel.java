package com.example.pegawai.vm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;

import com.example.pegawai.model.Pegawai;
import com.example.pegawai.service.PegawaiService;
import com.example.pegawai.repository.PegawaiRepository;

public class PegawaiViewModel {

    private List<Pegawai> pegawaiList;
    private Pegawai selectedPegawai;
    @Autowired
    private PegawaiService pegawaiService;

    @Init
    public void init() {
        // Initialize data (you might want to retrieve it from the backend)
        pegawaiList = pegawaiService.getAllPegawai();
        // Call service to get employee list
    }

    // Getter and setter for employees and selectedEmployee

    @Command
    public void showPegawaiForm() {
        Executions.getCurrent().sendRedirect("/form.zul");
    }

    @Command
    @NotifyChange("pegawaiList")
    public void editEmployee(@BindingParam("pegawaiList") Pegawai pegawai) {
        Sessions.getCurrent().setAttribute("selectedEmployee", pegawai);
        Executions.getCurrent().sendRedirect("/form.zul");
    }

    @Command
    @NotifyChange("pegawaiList")
    public void deleteEmployee(@BindingParam("pegawai") Pegawai pegawai) {
        // Call service to delete employee
    }
}