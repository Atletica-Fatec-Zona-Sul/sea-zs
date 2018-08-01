package br.com.fateczs.seazs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "tb_atividade")
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(
			name = "native",
			strategy = "native"
			)
	@Column(name = "id_Atividade")
	private Integer id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_agendamento")
	private Agendamento agendamento;
	
	@NotNull
	@Column(name = "nome_atividade", nullable = false)
	private String nome;
	
	@Column(name = "descricao_atividade", nullable = true)
	private String descricao;
	
	@NotNull
	@Column(name = "categoria_atividade", nullable = false)
	private String categoria;
	
	@NotNull
	@Column(name = "localAtividade", nullable = false)
	private String localAtividade;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_inicio", nullable = false)
	private Date inicioAtividade;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_fim", nullable = false)
	private Date fimAtividade;
	
	@NotNull
	@Column(name = "carga_horaria", nullable = false)
	private Integer cargaHoraria;
	
	@Column(name = "qtd_vagas", nullable = false)
	private Integer qtdVagas;
	
	@NotNull
	@Column(name = "pontuacao_participante", nullable = false)
	private Integer pontuacaoParticipante;
	
	@Column(name = "flag_continua")
	private Boolean flagContinua;
	
	@Column(name = "flag_cumulativa")
	private Boolean flagCumulativa;
	
	@Column(name = "qtd_checkin")
	private Integer qtdCheckIn;

	
	public Atividade () {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getLocalAtividade() {
		return localAtividade;
	}

	public void setLocalAtividade(String localAtividade) {
		this.localAtividade = localAtividade;
	}

	public Date getInicioAtividade() {
		return inicioAtividade;
	}

	public void setInicioAtividade(Date inicioAtividade) {
		this.inicioAtividade = inicioAtividade;
	}

	public Date getFimAtividade() {
		return fimAtividade;
	}

	public void setFimAtividade(Date fimAtividade) {
		this.fimAtividade = fimAtividade;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getQtdVagas() {
		return qtdVagas;
	}

	public void setQtdVagas(Integer qtdVagas) {
		this.qtdVagas = qtdVagas;
	}

	public Integer getPontuacaoParticipante() {
		return pontuacaoParticipante;
	}

	public void setPontuacaoParticipante(Integer pontuacaoParticipante) {
		this.pontuacaoParticipante = pontuacaoParticipante;
	}

	public Boolean getFlagContinua() {
		return flagContinua;
	}

	public void setFlagContinua(Boolean flagContinua) {
		this.flagContinua = flagContinua;
	}

	public Boolean getFlagCumulativa() {
		return flagCumulativa;
	}

	public void setFlagCumulativa(Boolean flagCumulativa) {
		this.flagCumulativa = flagCumulativa;
	}

	public Integer getQtdCheckIn() {
		return qtdCheckIn;
	}

	public void setQtdCheckIn(Integer qtdCheckIn) {
		this.qtdCheckIn = qtdCheckIn;
	}
	
	
}
