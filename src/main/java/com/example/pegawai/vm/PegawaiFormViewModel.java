package com.example.pegawai.vm;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;

import com.example.pegawai.model.Pegawai;

public class PegawaiFormViewModel {

    private Pegawai pegawai;

    @Init
    public void init() {
        // Check if there is a selected employee from the list page
        Pegawai selectedPegawai = (Pegawai) Sessions.getCurrent().getAttribute("selectedPegawai");

        if (selectedPegawai != null) {
            // Edit mode
            pegawai = selectedPegawai;
            Sessions.getCurrent().removeAttribute("selectedPegawai");
        } else {
            // Add mode
            pegawai = new Pegawai();
        }
    }

    // Getter and setter for employee

    @Command
    @NotifyChange("pegawai")
    public void savePegawai() {
        // Call service to save or update employee
        Executions.getCurrent().sendRedirect("/demo.zul");
    }

    @Command
    public void cancel() {
        Executions.getCurrent().sendRedirect("/demo.zul");
    }
}
