package br.gov.pi.fapepi.extrator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.junit.jupiter.api.Test;

import br.cnpq.repositorio.servico.ws.WSCurriculo;
import br.cnpq.repositorio.servico.ws.WSCurriculo_Service;

class BaseUpdateTest {

	WSCurriculo service = new WSCurriculo_Service().getWSCurriculoPort();
	
	@Test
	void test() {

		File file = new File("src/main/webapp/docs/numero_identificador_lattes_20170708.csv");

		String linha = new String();
		Scanner leitor;
		try {
			leitor = new Scanner(file);

			leitor.nextLine();

			while(leitor.hasNext()) {
				linha = leitor.nextLine();
				String[] valoresStrings = linha.split(";");
				System.out.println("IdLattes: " +valoresStrings[0]);
				try {
					pegaCV(valoresStrings[0]);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pegaCV(String id) throws IOException {

		byte[] bytes = service.getCurriculoCompactado(id);
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
				FileOutputStream outstream = new FileOutputStream("src/main/webapp/docs/temp/" + entryName);
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