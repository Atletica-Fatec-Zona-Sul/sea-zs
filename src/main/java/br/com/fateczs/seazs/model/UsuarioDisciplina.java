package br.com.fateczs.seazs.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "usuarioDisciplina")
	@Table(name = "tb_Usuario_Disciplina")
	@AssociationOverrides({
		@AssociationOverride(name = "idUsuarioDisciplina.usuario", 
			joinColumns = @JoinColumn(name = "id_usuario")),
		@AssociationOverride(name = "idUsuarioDisciplina.disciplina", 
			joinColumns = @JoinColumn(name = "id_disciplina")) })
	public class UsuarioDisciplina implements Serializable {
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private UsuarioDisciplinaID idUsuarioDisciplina = new UsuarioDisciplinaID();
		
		private Date dtFim;
		
		public UsuarioDisciplina() {
			// TODO Auto-generated constructor stub
		}
		
		@EmbeddedId
		public UsuarioDisciplinaID getIdUsuarioDisciplina() {
			return idUsuarioDisciplina;
		}

		public void setIdUsuarioDisciplina(UsuarioDisciplinaID idUsuarioDisciplina) {
			this.idUsuarioDisciplina = idUsuarioDisciplina;
		}
		
	/*	@Transient
		public Usuario getUsuario() {
			return this.idUsuarioDisciplina.getUsuario();
		}
		
		public void setUsuario(Usuario usuario) {
			this.idUsuarioDisciplina.setUsuario(usuario);
		} */
		
	/*	@Transient
		public Disciplina getDisciplina() {
			return this.idUsuarioDisciplina.getDisciplina();
		}
		
		public void setDisciplina(Disciplina disciplina) {
			this.idUsuarioDisciplina.setDisciplina(disciplina);
		}*/
		
/*		@Transient
		public Date getDtInicio() {
			return this.idUsuarioDisciplina.getDtInicio();
		} 

		public void setDtInicio(Date dtInicio) {
			this.idUsuarioDisciplina.setDtInicio(dtInicio);
		}*/
		
		@Temporal(TemporalType.DATE)
		@Column(name = "data_fimDisciplina", nullable = false)
		public Date getDtFim() {
			return dtFim;
		}

		public void setDtFim(Date dtFim) {
			this.dtFim = dtFim;
		}
}
