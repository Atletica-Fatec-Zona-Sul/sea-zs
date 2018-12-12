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
	
//	@NotNull
	@Column(name = "nome_curso", nullable = false)
	private String nome;
	
//	@NotNull
	@Column(name = "modalidade_curso", nullable = false)
	private Integer modalidade;
	
//	@NotNull
	@Column(name = "qtd_semestre", nullable = false)
	private Integer qtdSemestres;
	
	public Curso() {}
	
	public Curso(String id) {
		this.id = Integer.parseInt(id);
	}
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modalidade == null) ? 0 : modalidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((qtdSemestres == null) ? 0 : qtdSemestres.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modalidade == null) {
			if (other.modalidade != null)
				return false;
		} else if (!modalidade.equals(other.modalidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (qtdSemestres == null) {
			if (other.qtdSemestres != null)
				return false;
		} else if (!qtdSemestres.equals(other.qtdSemestres))
			return false;
		return true;
	}

}
