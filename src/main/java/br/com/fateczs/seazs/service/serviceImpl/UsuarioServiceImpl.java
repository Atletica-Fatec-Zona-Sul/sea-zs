package br.com.fateczs.seazs.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fateczs.seazs.model.Usuario;
import br.com.fateczs.seazs.repository.UsuarioRepository;
import br.com.fateczs.seazs.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	@Override
	public Usuario buscar(Usuario usuario) {
		// TODO Auto-generated method stub
		return repository.getOne(usuario.getId());
	}

	@Override
	public void inserir(Usuario usuario) {
		// TODO Auto-generated method stub
		repository.save(usuario);
	}

	@Override
	public void alterar(Usuario usuario) {
		// TODO Auto-generated method stub
		repository.save(usuario);
	}

	@Override
	public void excluir(Usuario usuario) {
		// TODO Auto-generated method stub
		repository.delete(usuario);
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
