package br.gov.pi.fapepi.extrator;

import org.junit.Test;

import br.cnpq.repositorio.servico.ws.WSCurriculo;
import br.cnpq.repositorio.servico.ws.WSCurriculo_Service;

public class GetOcorrenciaTest {

	@Test
	public void test() {
		WSCurriculo service = new WSCurriculo_Service().getWSCurriculoPort();
		System.out.println(service.getOcorrenciaCV("9181840518743566"));
	}

}
