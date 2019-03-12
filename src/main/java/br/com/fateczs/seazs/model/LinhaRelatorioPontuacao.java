package br.com.fateczs.seazs.model;

public class LinhaRelatorioPontuacao {

    String nomeUsuario;
    String tipoUsuario;
    String cursoUsuario;
    int semestreUsuario;
    int totalDePontos;

    public LinhaRelatorioPontuacao(String nomeUsuario, String tipoUsuario, String cursoUsuario, int semestreUsuario, int totalDePontos) {
        this.nomeUsuario = nomeUsuario;
        this.tipoUsuario = tipoUsuario;
        this.cursoUsuario = cursoUsuario;
        this.semestreUsuario = semestreUsuario;
        this.totalDePontos = totalDePontos;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getCursoUsuario() {
        return cursoUsuario;
    }

    public void setCursoUsuario(String cursoUsuario) {
        this.cursoUsuario = cursoUsuario;
    }

    public int getSemestreUsuario() {
        return semestreUsuario;
    }

    public void setSemestreUsuario(int semestreUsuario) {
        this.semestreUsuario = semestreUsuario;
    }

    public int getTotalDePontos() {
        return totalDePontos;
    }

    public void setTotalDePontos(int totalDePontos) {
        this.totalDePontos = totalDePontos;
    }
}
