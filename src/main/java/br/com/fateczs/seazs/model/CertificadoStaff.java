package br.com.fateczs.seazs.model;

public class CertificadoStaff {

    private String periodoAgendamento;
    private String nomeEvento;
    private String papelUsuario;
    private int cargaHoraria;


    public CertificadoStaff(String periodoAgendamento, String nomeEvento, String papelUsuario, int cargaHoraria) {
        this.periodoAgendamento = periodoAgendamento;
        this.nomeEvento = nomeEvento;
        this.papelUsuario = papelUsuario;
        this.cargaHoraria = cargaHoraria;
    }

    public String getPeriodoAgendamento() {
        return periodoAgendamento;
    }

    public void setPeriodoAgendamento(String periodoAgendamento) {
        this.periodoAgendamento = periodoAgendamento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getPapelUsuario() {
        return papelUsuario;
    }

    public void setPapelUsuario(String papelUsuario) {
        this.papelUsuario = papelUsuario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
