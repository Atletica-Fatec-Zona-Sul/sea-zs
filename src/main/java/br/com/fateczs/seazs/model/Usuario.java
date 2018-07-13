package br.com.fateczs.seazs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	private Integer id;
	@Column(name = "email")
	private String email;
	@Column(name = "senha")
	private String senha;
	@Column(name = "nome")
	private String nome;
	@Column(name = "endereco")
	private String endereco;
	@Column(name = "celular")
	private String celular;
	@Column(name = "dataNasc")
	private Date dataNasc;
	@Column(name = "semestre")
	private Integer semestre;
	@Column(name = "turno")
	private String turno;
	@Column(name = "adm")
	private Boolean adm;
	@Column(name = "rg")
	private String rg;
	@Column(name = "genero")
	private String genero;
	@Column(name = "matricula")
	private String matricula;
	@Column(name = "tipoUsuario")
	private TipoUsuario tipoUsuario;
	
	
	
}
