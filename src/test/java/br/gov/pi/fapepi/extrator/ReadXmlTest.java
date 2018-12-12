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

			saida();

		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}

	}

	public void saida() {
		System.out.println("ID-LATTES: " + idLattes + " Data de Atualização: " + data + " Hora: " + hora);
		System.out.println("Nome: " + nome);
		System.out.println("Bolsista: " + resumo);
	}
}