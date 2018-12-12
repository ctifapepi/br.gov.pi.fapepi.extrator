package br.gov.pi.fapepi.extrator.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import br.cnpq.repositorio.servico.ws.WSCurriculo;
import br.cnpq.repositorio.servico.ws.WSCurriculo_Service;

public class GetCurriculoCompactado {
	
	public void getCV() throws IOException {
		//Acessa o servi�o do webservice
		WSCurriculo service = new WSCurriculo_Service().getWSCurriculoPort();
		
		//Busca o curriculo pelo ID Lattes
		byte[] bytes = service.getCurriculoCompactado("1730267187915386");
		//"1730267187915386"
		//Criar o arquivo zip conforme os dados obtidos do service
		File file = new File("/src/main/webapp/docs/curriculo.zip");
	
		FileOutputStream in;
	
		try {
			in = new FileOutputStream(file);
			in.write(bytes);
			in.close();
		
		//########## A partir daqui descompacta o arquivo ############//
		byte[] buffer = new byte[1024];
		
		//Cria o input do arquivo zip
		ZipInputStream zinstream = new ZipInputStream(new FileInputStream("/src/main/webapp/docs/curriculo.zip"));
		
		//Pega a proxima entrada do arquivo
		ZipEntry zentry = zinstream.getNextEntry();
		
		//Enquanto existir entradas no zip
		while(zentry != null) {
			//Pega o nome da entrada
			String entryName = zentry.getName();
			
			//Cria o ouptput do arquivo, sera extra�do onde esta rodando a classe
			FileOutputStream outstream = new FileOutputStream(entryName);
			int n;
			
			//Escreve o arquivo
			while((n = zinstream.read(buffer)) > -1) {
				outstream.write(buffer, 0, n);
			}
			
			//Fecha o arquivo
			outstream.close();
			
			//Fecha entrada e tenta pegar a proxima
			zinstream.closeEntry();
			zentry = zinstream.getNextEntry();
		}
		
		//Fecha o zip como um todo
		zinstream.close();
		
		System.out.println("Processo concluído");
		}catch(IOException ex) {
            ex.printStackTrace();
        }
	}

}
