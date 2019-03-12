package br.com.fateczs.seazs.service.serviceImpl;

import br.com.fateczs.seazs.model.LinhaRelatorioPontuacao;
import br.com.fateczs.seazs.model.RelatorioPontuacao;
import br.com.fateczs.seazs.model.RodapeRelatorioPontuacao;
import br.com.fateczs.seazs.repository.GerenciamentoRepository;
import br.com.fateczs.seazs.service.GerenciamentoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class GerenciamentoServiceImpl implements GerenciamentoService {

    private GerenciamentoRepository repository = new GerenciamentoRepository();

    @Override
    public RelatorioPontuacao consultaPontuacaoSemestre(int ano, int semestre) {
        Date inicio = new Date();
        Date fim = new Date();

        if(semestre == 1){
            inicio = new Date(ano - 1900, 00, 31);
            fim = new Date(ano - 1900, 05, 30);
        }

        List<LinhaRelatorioPontuacao> listaPontuacoes = repository.consultaPontuacaoSemestre(inicio, fim);
        RodapeRelatorioPontuacao rodapeRelatorio = repository.rodapeConsultaPontuacaoSemestre(inicio, fim);
        RelatorioPontuacao relatorioPontuacao = new RelatorioPontuacao(listaPontuacoes, rodapeRelatorio);
        return relatorioPontuacao;
    }
}
