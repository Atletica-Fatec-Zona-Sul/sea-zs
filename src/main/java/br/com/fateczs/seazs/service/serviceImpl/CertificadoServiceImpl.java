package br.com.fateczs.seazs.service.serviceImpl;

import br.com.fateczs.seazs.model.CertificadoAtividade;
import br.com.fateczs.seazs.model.CertificadoStaff;
import br.com.fateczs.seazs.model.Inscricao;
import br.com.fateczs.seazs.model.StaffAgendamento;
import br.com.fateczs.seazs.model.mapper.CertificadoMapper;
import br.com.fateczs.seazs.repository.InscricaoRepository;
import br.com.fateczs.seazs.repository.StaffAgendamentoRepository;
import br.com.fateczs.seazs.service.CertificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificadoServiceImpl implements CertificadoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private StaffAgendamentoRepository staffAgendamentoRepository;

    private CertificadoMapper certificadoMapper = new CertificadoMapper();

    @Override
    public CertificadoAtividade emiteCertificadoAtividade(Inscricao inscricao) {
        Inscricao inscricaoPreenchida = inscricaoRepository.findByUsuarioIdAndAtividadeId(inscricao.getUsuario().getId(), inscricao.getAtividade().getId());
        if (inscricaoPreenchida.validouPresenca()){
            return certificadoMapper.createFromInscricao(inscricaoPreenchida);
        }
        else {
            return null;
        }
    }

    @Override
    public CertificadoStaff emiteCertificadoAgendamento(StaffAgendamento inscricaoStaff) {
        StaffAgendamento inscricaoStaffPreenchida = staffAgendamentoRepository.findByAgendamentoIdAndUsuarioId(inscricaoStaff.getAgendamento().getId(), inscricaoStaff.getUsuario().getId());

        if (inscricaoStaffPreenchida.validouPresenca()) {
            return certificadoMapper.createFromStaffAgendamento(inscricaoStaffPreenchida);
        }
        else {
            return null;
        }
    }
}
