package br.com.fateczs.seazs.model.mapper;

import br.com.fateczs.seazs.model.CertificadoAtividade;
import br.com.fateczs.seazs.model.CertificadoStaff;
import br.com.fateczs.seazs.model.Inscricao;
import br.com.fateczs.seazs.model.StaffAgendamento;
import br.com.fateczs.seazs.utils.DataUtils;

public class CertificadoMapper {

    DataUtils dataUtils = new DataUtils();

    public CertificadoAtividade createFromInscricao(Inscricao inscricao){
        return new CertificadoAtividade(
                inscricao.getUsuario().getNome(),
                inscricao.getAtividade().getNome(),
                inscricao.getPapel().getNome(),
                inscricao.getAtividade().getCargaHoraria()
        );
    }

    public CertificadoStaff createFromStaffAgendamento(StaffAgendamento inscricaoStaff){

        String periodoAgendamento = dataUtils.formataDataDiaMesAno(inscricaoStaff.getAgendamento().getInicio())+
                                    " a "+ dataUtils.formataDataDiaMesAno(inscricaoStaff.getAgendamento().getFim());
        int cargaHoraria = dataUtils.calculaCargaHoraria(inscricaoStaff.getAgendamento().getInicio(), inscricaoStaff.getAgendamento().getFim());
        return new CertificadoStaff(
                periodoAgendamento,
                inscricaoStaff.getAgendamento().getEvento().getNome(),
                "Staff",
                dataUtils.calculaCargaHoraria(
                        inscricaoStaff.getAgendamento().getInicio(),
                        inscricaoStaff.getAgendamento().getFim())
                );
    }

}
