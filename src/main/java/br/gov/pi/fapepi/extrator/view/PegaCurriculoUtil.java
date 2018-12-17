package br.gov.pi.fapepi.extrator.view;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import br.gov.pi.fapepi.extrator.model.cv.CURRICULOVITAE;
import br.gov.pi.fapepi.extrator.util.GetCurriculoCompactado;

@Named
public class PegaCurriculoUtil {
	
	
	@Inject
	private GetCurriculoCompactado getCV;
	
	private String id;
	
	public void pegaCV() throws IOException {
		getCV.getCV();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
