package br.com.fateczs.seazs.model;

public class CertificadoAtividade {

    String nomeUsuario;
    String atividade;
    String papel;
    int cargaHorariaAtividade;

    public CertificadoAtividade(String nomeUsuario, String atividade, String papel, int cargaHorariaAtividade) {
        this.nomeUsuario = nomeUsuario;
        this.atividade = atividade;
        this.papel = papel;
        this.cargaHorariaAtividade = cargaHorariaAtividade;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public int getCargaHorariaAtividade() {
        return cargaHorariaAtividade;
    }

    public void setCargaHorariaAtividade(int cargaHorariaAtividade) {
        this.cargaHorariaAtividade = cargaHorariaAtividade;
    }
}
