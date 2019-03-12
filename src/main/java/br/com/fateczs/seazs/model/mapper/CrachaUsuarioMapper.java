package br.com.fateczs.seazs.model.mapper;

import br.com.fateczs.seazs.model.CrachaUsuario;
import br.com.fateczs.seazs.model.Usuario;

public class CrachaUsuarioMapper {


    public CrachaUsuario createFrom(Usuario usuario) {

        CrachaUsuario crachaUsuario = new CrachaUsuario(usuario.getNome(), usuario.getTipoUsuario().name());

        return crachaUsuario;
    }
}
