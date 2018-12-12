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

	@Test
	void read() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("src/main/webapp/docs/7233477221322177.xml");
			NodeList cvLattes = doc.getElementsByTagName("CURRICULO-VITAE");
			Node node = cvLattes.item(0);
			
			Element el = (Element) node;
			String idLattes = el.getAttribute("NUMERO-IDENTIFICADOR");
			String data = el.getAttribute("DATA-ATUALIZACAO");
			String hora = el.getAttribute("HORA-ATUALIZACAO");
			
			System.out.println("ID-LATTES: " + idLattes + " Data de Atualização: " + data + " Hora: " + hora);
			
			cvLattes = doc.getElementsByTagName("DADOS-GERAIS");
			node = cvLattes.item(0);
			el = (Element) node;
			String nome = el.getAttribute("NOME-COMPLETO"); //Esse resultado vai povoar o objeto
			
			System.out.println("Nome: " + nome);
			
			
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		
	}
}