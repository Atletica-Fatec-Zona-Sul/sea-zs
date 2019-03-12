package br.com.fateczs.seazs.service;

import br.com.fateczs.seazs.model.RelatorioPontuacao;

public interface GerenciamentoService {

    RelatorioPontuacao consultaPontuacaoSemestre(int ano, int semestre);

}
