package br.com.fateczs.seazs.service;

import br.com.fateczs.seazs.model.CertificadoAtividade;
import br.com.fateczs.seazs.model.CertificadoStaff;
import br.com.fateczs.seazs.model.Inscricao;
import br.com.fateczs.seazs.model.StaffAgendamento;

public interface CertificadoService {

    CertificadoAtividade emiteCertificadoAtividade(Inscricao inscricao);

    CertificadoStaff emiteCertificadoAgendamento(StaffAgendamento inscricaoStaff);
}
