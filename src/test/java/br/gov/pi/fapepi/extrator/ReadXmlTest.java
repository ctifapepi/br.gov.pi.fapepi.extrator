package br.gov.pi.fapepi.extrator;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


class ReadXmlTest {

	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder;
	Document doc;
	NodeList cvLattes;
	Node node;
	Element el;
	String idLattes, data, hora, nome, resumo;
	String nomeGrandeAreaDoConhecimento;
	String nomeDaAreaDoConhecimento; 
	String nomeDaSubAreaDoConhecimento; 
	String nomeDaEspecialidade;

			@Test
			void read() {

		
			try {
				builder = factory.newDocumentBuilder();
				doc = builder.parse("src/main/webapp/docs/7233477221322177.xml");
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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

			saida();

	}

	public void saida() {
		System.out.println("ID-LATTES: " + idLattes + "\nData de Atualização: " + data + "\nHora: " + hora);
		System.out.println("Nome: " + nome);
		System.out.println("Bolsista: " + resumo);
		System.out.println("Grande área do conhecimiento: " + nomeGrandeAreaDoConhecimento);
		System.out.println("Nome da área do conhecimento: " + nomeDaAreaDoConhecimento);
		System.out.println("Nome da Sub-área do conhecimento: " + nomeDaSubAreaDoConhecimento);
		System.out.println("Nome da Especilidade: " + nomeDaEspecialidade);
	}
}