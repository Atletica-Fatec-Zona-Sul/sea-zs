package br.com.fateczs.seazs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.fateczs.seazs.utils.ModalidadeCurso;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name = "Curso")
@Table(name = "tb_Curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name = "id_curso")
	private Integer id;
	
	@NotNull
	@Column(name = "nome_curso", nullable = false)
	private String nome;
	
	@NotNull
	@Column(name = "modalidade_curso", nullable = false)
	private Integer modalidade;
	
	@NotNull
	@Column(name = "qtd_semestre", nullable = false)
	private Integer qtdSemestres;
	
	public Curso() {}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ModalidadeCurso getModalidade() {
		return ModalidadeCurso.getModalidadeCurso(this.modalidade);
	}
	public void setModalidade(ModalidadeCurso modalidade) {
		this.modalidade = modalidade.getIdModalidadeCurso();
	}
	public Integer getQtdSemestres() {
		return qtdSemestres;
	}
	public void setQtdSemestres(Integer qtdSemestres) {
		this.qtdSemestres = qtdSemestres;
	}

}
