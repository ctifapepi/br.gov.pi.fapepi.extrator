package br.gov.pi.fapepi.extrator.model;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXml {
	
	private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	private DocumentBuilder builder;
	private Document doc;
	private NodeList cvLattes;
	private Node node;
	private Element el;
	private String idLattes, data, hora, nome, resumo;
	private String nomeGrandeAreaDoConhecimento;
	private String nomeDaAreaDoConhecimento; 
	private String nomeDaSubAreaDoConhecimento; 
	private String nomeDaEspecialidade;
	private CvLattes cv;
	private List<CvLattes> cvList; 

	void read() throws ParserConfigurationException, SAXException, IOException {
			
			cv = new CvLattes();
		
			builder = factory.newDocumentBuilder();

			doc = builder.parse("src/main/webapp/docs/7233477221322177.xml");


		cvLattes = doc.getElementsByTagName("CURRICULO-VITAE");
		node = cvLattes.item(0);

		el = (Element) node;
		idLattes = el.getAttribute("NUMERO-IDENTIFICADOR");
		data = el.getAttribute("DATA-ATUALIZACAO");
		hora = el.getAttribute("HORA-ATUALIZACAO");


		cvLattes = doc.getElementsByTagName("DADOS-GERAIS");
		node = cvLattes.item(0);
		el = (Element) node;
		nome = el.getAttribute("NOME-COMPLETO"); //Esse resultado vai povoar o objeto

		cvLattes = doc.getElementsByTagName("RESUMO-CV");
		node = cvLattes.item(0);
		el = (Element) node;
		resumo = el.getAttribute("TEXTO-RESUMO-CV-RH"); //Esse resultado vai povoar o objeto
		if(resumo.contains("Bolsista de Produtividade do CNPq")){
			resumo = "Bolsista de Produtividade do CNPq";
		};

		cvLattes = doc.getElementsByTagName("AREA-DO-CONHECIMENTO-1");
		node = cvLattes.item(0);
		el = (Element) node;
		nomeGrandeAreaDoConhecimento = el.getAttribute("NOME-GRANDE-AREA-DO-CONHECIMENTO");
		nomeDaAreaDoConhecimento = el.getAttribute("NOME-DA-AREA-DO-CONHECIMENTO"); 
		nomeDaSubAreaDoConhecimento = el.getAttribute("NOME-DA-SUB-AREA-DO-CONHECIMENTO"); 
		nomeDaEspecialidade = el.getAttribute("NOME-DA-ESPECIALIDADE");

		
		cv.setIdLattes(idLattes);
		cv.setHora(hora);
		cv.setData(data);
		cv.setNome(nome);
		cv.setResumo(resumo);
		cv.setNomeGrandeAreaDoConhecimento(nomeGrandeAreaDoConhecimento);
		cv.setNomeDaAreaDoConhecimento(nomeDaAreaDoConhecimento);
		cv.setNomeDaSubareaDoConhecimento(nomeDaSubAreaDoConhecimento);
		cv.setNomeDaEspecialidade(nomeDaEspecialidade);
		
		saida();

	}

	public void saida() {
		System.out.println("ID-LATTES: " + cv.getIdLattes() + "\nData de Atualização: " + cv.getData() + "\nHora: " + cv.getHora());
		System.out.println("Nome: " + cv.getNome());
		System.out.println("Bolsista: " + cv.getResumo());
		System.out.println("Grande área do conhecimiento: " + cv.getNomeGrandeAreaDoConhecimento());
		System.out.println("Nome da área do conhecimento: " + cv.getNomeDaAreaDoConhecimento());
		System.out.println("Nome da Sub-área do conhecimento: " + cv.getNomeDaSubareaDoConhecimento());
		System.out.println("Nome da Especilidade: " + cv.getNomeDaEspecialidade());
	}
}
