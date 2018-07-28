package br.com.fateczs.seazs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.fateczs.seazs.util.ModalidadeCurso;

@Entity(name = "Curso")
@Table(name = "tb_Curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_curso")
	private int idCurso;
	
	@NotNull
	@Column(name = "nome_curso", nullable = false)
	private String nome;
	
	@NotNull
	@Column(name = "modalidade_curso", nullable = false)
	private ModalidadeCurso modalidade;
	
	@NotNull
	@Column(name = "qtd_semestre", nullable = false)
	private int qtdSemestres;
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ModalidadeCurso getModalidade() {
		return modalidade;
	}

	public void setModalidade(ModalidadeCurso modalidade) {
		this.modalidade = modalidade;
	}

	public int getQtdSemestres() {
		return qtdSemestres;
	}

	public void setQtdSemestres(int qtdSemestres) {
		this.qtdSemestres = qtdSemestres;
	}

}
