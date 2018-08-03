package br.com.fateczs.seazs.service.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Inscricao;
import br.com.fateczs.seazs.repository.InscricaoRepository;
import br.com.fateczs.seazs.service.InscricaoService;
import br.com.fateczs.seazs.utils.DataUtils;

@Service
public class InscricaoServiceImpl implements InscricaoService {

	@Override
	public Inscricao buscar(Inscricao inscricao) {
		return repository.getOne(inscricao.getSequencialInscricao());
	}

	@Override
	public void inserir(Inscricao inscricao) {
		// TODO Auto-generated method stub
		repository.save(inscricao);
	}

	@Override
	public void alterar(Inscricao inscricao) {
		// TODO Auto-generated method stub
		repository.save(inscricao);
	}

	@Override
	public void excluir(Inscricao inscricao) {
		// TODO Auto-generated method stub
		repository.delete(inscricao);
	}

	@Override
	public List<Inscricao> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Inscricao> listarPorDataAsc() {
		// TODO Auto-generated method stub
		return repository.findAll(sortByDtInscricaoAsc());
	}
	
	private Sort sortByDtInscricaoAsc() {
		return new Sort(Sort.Direction.ASC, "dtInscricao");
	}
	
	DataUtils operaData = new DataUtils();
	
	@SuppressWarnings("deprecation")
	@Override
	public Inscricao validaPresença(Inscricao inscricao) {
		Date agora = new Date();
		Date inicioEntrada = operaData.somaMinutos(inscricao.getAtividade().getInicioAtividade(), -10);
		Date fimEntrada = operaData.somaMinutos(inscricao.getAtividade().getInicioAtividade(), 30);
		Date inicioSaida = operaData.somaMinutos(inscricao.getAtividade().getFimAtividade(), -10);
		Date fimSaida = operaData.somaMinutos(inscricao.getAtividade().getFimAtividade(), 30);
		
		System.out.println("agora: " + agora.toLocaleString());
		System.out.println("inicioEntrada: " + inicioEntrada.toLocaleString());
		System.out.println("fimEntrada: " + fimEntrada.toLocaleString());
		System.out.println("inicioSaida: " + inicioSaida.toLocaleString());
		System.out.println("fimEntrada: " + fimSaida.toLocaleString());
		
		if(agora.before(fimEntrada)) {
			if(agora.after(inicioEntrada)) {
				System.out.println("Dentro do horário de entrada");
				if (!inscricao.getCheckIn()) {
					System.out.println("Fez Check In");
					inscricao.setCheckIn(true);
					repository.save(inscricao);
				}
			}	
		}
		else if (agora.before(fimSaida)) {
			if(agora.after(inicioSaida)) {
				System.out.println("Dentro do horário de saida");
				if (!inscricao.getCheckOut()) {
					System.out.println("Fez Check Out");
					inscricao.setCheckOut(true);
					repository.save(inscricao);
				}
			}
		}
		if (inscricao.getCheckIn() && inscricao.getCheckOut()) {
					System.out.println("Presença validada, contabilizando pontos");
					inscricao.setPontuacaoRecebida(inscricao.getAtividade().getPontuacaoParticipante());
					repository.save(inscricao);
		}
		return inscricao;
	}

	@Autowired
	private InscricaoRepository repository;

}
