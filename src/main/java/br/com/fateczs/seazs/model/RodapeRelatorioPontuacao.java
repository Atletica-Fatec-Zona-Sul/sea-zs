package br.com.fateczs.seazs.model;

public class RodapeRelatorioPontuacao {

    private int totalDeUsuarios;
    private int totalDeAtividades;

    public RodapeRelatorioPontuacao(int totalDeUsuarios, int totalDeAtividades) {
        this.totalDeUsuarios = totalDeUsuarios;
        this.totalDeAtividades = totalDeAtividades;
    }

    public int getTotalDeUsuarios() {
        return totalDeUsuarios;
    }

    public void setTotalDeUsuarios(int totalDeUsuarios) {
        this.totalDeUsuarios = totalDeUsuarios;
    }

    public int getTotalDeAtividades() {
        return totalDeAtividades;
    }

    public void setTotalDeAtividades(int totalDeAtividades) {
        this.totalDeAtividades = totalDeAtividades;
    }
}
