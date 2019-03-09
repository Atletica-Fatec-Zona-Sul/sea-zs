package br.com.fateczs.seazs.controller;

import br.com.fateczs.seazs.model.CertificadoAtividade;
import br.com.fateczs.seazs.model.CertificadoStaff;
import br.com.fateczs.seazs.model.Inscricao;
import br.com.fateczs.seazs.model.StaffAgendamento;
import br.com.fateczs.seazs.service.CertificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/certificado")
public class CertificadoController {
	
	@PostMapping("/atividade/emitir")
	@ResponseBody
	public CertificadoAtividade emitirCertificadoAtividade(@Valid @RequestBody Inscricao inscricao) {
		return certificadoService.emiteCertificadoAtividade(inscricao);
	}
	@PostMapping("/agendamento/emitir")
	@ResponseBody
	public CertificadoStaff emitirCertificadoAgendamento(@Valid @RequestBody StaffAgendamento inscricaoStaff) {
		return certificadoService.emiteCertificadoAgendamento(inscricaoStaff);
	}
	
	@Autowired
	private CertificadoService certificadoService;
}
