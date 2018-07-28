package br.com.fateczs.seazs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.fateczs.seazs.utils.TipoUsuario;
import br.com.fateczs.seazs.utils.Turno;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "tb_Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name = "id_usuario")
	private Integer id;

	@NotNull
	@Column(name = "email_usuario", nullable = false)
	private String email;


	@NotNull
	@Column(name = "senha", nullable = false)
	private String senha;

	@NotNull
	@Column(name = "nome_usuario", nullable = false)
	private String nome;

	@NotNull
	@Column(name = "endereco_usuario", nullable = false)
	private String endereco;

	@NotNull
	@Column(name = "celular_usuario", nullable = false)
	private String celular;

	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento", nullable = false)
	private Date dataNasc;

	@Column(name = "semestre", nullable = true)
	private Integer semestre;

	@Column(name = "turno")
	private Character turno;

	@NotNull
	@Column(name = "adm", nullable = false)
	private Boolean adm;

	@NotNull
	@Column(name = "rg_usuario", nullable = false)
	private String rg;

	@NotNull
	@Column(name = "genero_usuario", nullable = false)
	private String genero;

	@Column(name = "matricula_usuario")
	private String matricula;

	@NotNull
	@Column(name = "tipo_usuario", nullable = false)
	private Integer tipoUsuario;

	@ManyToOne(optional = true)
	private Curso curso;

	public Usuario() {	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Turno getTurno() {
		return Turno.getTurno(turno);
	}

	public void setTurno(Turno turno) {
		if (turno == null) {
			this.turno = null;
		}
		else {
			this.turno = turno.getIdTurno();
		};
	}

	public Boolean getAdm() {
		return adm;
	}

	public void setAdm(Boolean adm) {
		this.adm = adm;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoUsuario getTipoUsuario() {
		return TipoUsuario.getTipoUsuario(this.tipoUsuario);
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		if (tipoUsuario == null) {
			this.tipoUsuario = null;
		}
		else {
			this.tipoUsuario = tipoUsuario.getIdTipoUsuario();
		}
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}


}
