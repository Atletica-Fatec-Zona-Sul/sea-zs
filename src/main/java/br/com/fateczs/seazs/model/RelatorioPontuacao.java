package br.com.fateczs.seazs.model;

import java.util.ArrayList;
import java.util.List;

public class RelatorioPontuacao {

    private List<LinhaRelatorioPontuacao> linha;
    private RodapeRelatorioPontuacao rodapeRelatorioPontuacao;

    public RelatorioPontuacao(List<LinhaRelatorioPontuacao> linha, RodapeRelatorioPontuacao rodapeRelatorioPontuacao) {
        this.linha = linha;
        this.rodapeRelatorioPontuacao = rodapeRelatorioPontuacao;
    }

    public List<LinhaRelatorioPontuacao> getLinha() {
        return linha;
    }

    public void setLinha(List<LinhaRelatorioPontuacao> linha) {
        this.linha = linha;
    }

    public RodapeRelatorioPontuacao getRodapeRelatorioPontuacao() {
        return rodapeRelatorioPontuacao;
    }

    public void setRodapeRelatorioPontuacao(RodapeRelatorioPontuacao rodapeRelatorioPontuacao) {
        this.rodapeRelatorioPontuacao = rodapeRelatorioPontuacao;
    }
}
