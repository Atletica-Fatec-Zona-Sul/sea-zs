package br.com.fateczs.seazs.model;

public class CrachaUsuario {

    String nomeDoUsuario;
    String tipoDoUsuario;

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getTipoDoUsuario() {
        return tipoDoUsuario;
    }

    public void setTipoDoUsuario(String tipoDoUsuario) {
        this.tipoDoUsuario = tipoDoUsuario;
    }

    public CrachaUsuario(String nomeDoUsuario, String tipoDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.tipoDoUsuario = tipoDoUsuario;
    }
}
