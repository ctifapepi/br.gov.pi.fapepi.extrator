package br.gov.pi.fapepi.extrator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.junit.Test;

import br.cnpq.repositorio.servico.ws.WSCurriculo;
import br.cnpq.repositorio.servico.ws.WSCurriculo_Service;

public class GetCurriculoCompactadoTest2 {

	@Test
	public void test() {

		WSCurriculo service = new WSCurriculo_Service().getWSCurriculoPort();

		byte[] bytes = service.getCurriculoCompactado("7233477221322177");
		//1730267187915386   
		File file = new File("src/main/webapp/docs/curriculo.zip");
		

		FileOutputStream in;
	
		try {
			in = new FileOutputStream(file);
			in.write(bytes);
			in.close();
		
		//########## A partir daqui descompacta o arquivo ############//
		byte[] buffer = new byte[1024];
		
		//Cria o input do arquivo zip
		ZipInputStream zinstream = new ZipInputStream(new FileInputStream("src/main/webapp/docs/curriculo.zip"));
		
		//Pega a proxima entrada do arquivo
		ZipEntry zentry = zinstream.getNextEntry();
		
		//Enquanto existir entradas no zip
		while(zentry != null) {
			//Pega o nome da entrada
			String entryName = zentry.getName();
			
			//Cria o ouptput do arquivo, sera extra�do no caminho espec�ficado
			FileOutputStream outstream = new FileOutputStream("src/main/webapp/docs/" + entryName);
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
		
		System.out.println("Done");
		}catch(IOException ex) {
            ex.printStackTrace();
        }
	}
}
