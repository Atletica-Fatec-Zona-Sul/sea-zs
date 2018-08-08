package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fateczs.seazs.model.Usuario;
import br.com.fateczs.seazs.model.UsuarioDisciplina;
import br.com.fateczs.seazs.repository.UsuarioDisciplinaRepository;
import br.com.fateczs.seazs.service.UsuarioDisciplinaService;

@Service
public class UsuarioDisciplinaServiceImpl implements UsuarioDisciplinaService {
	
	
	@Autowired
	private UsuarioDisciplinaRepository repository;
	
	@Override
	public UsuarioDisciplina buscar(UsuarioDisciplina usuarioDisciplina) {
		// TODO Auto-generated method stub
		return repository.getOne(usuarioDisciplina.getIdUsuarioDisciplina());
	}

	@Override
	public void inserir(UsuarioDisciplina usuarioDisciplina) {
		// TODO Auto-generated method stub
		repository.save(usuarioDisciplina);
	}

	@Override
	public void alterar(UsuarioDisciplina usuarioDisciplina) {
		// TODO Auto-generated method stub
		repository.save(usuarioDisciplina);
	}

	@Override
	public void excluir(UsuarioDisciplina usuarioDisciplina) {
		// TODO Auto-generated method stub
		repository.delete(usuarioDisciplina);
	}

	@Override
	public List<UsuarioDisciplina> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<UsuarioDisciplina> recuperarDisciplinasDoUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return repository.findByIdUsuarioDisciplinaUsuarioId(usuario.getId());
	}
	
	

}
