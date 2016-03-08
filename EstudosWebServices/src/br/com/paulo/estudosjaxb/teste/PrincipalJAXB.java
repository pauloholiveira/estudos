package br.com.paulo.estudosjaxb.teste;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.com.paulo.estudosjaxb.Cliente;
import br.com.paulo.estudosjaxb.Conta;

public class PrincipalJAXB {
	
	public static void main(String args[]) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Conta.class);
		Marshaller marshaller = context.createMarshaller();
		//Serializando o objeto Conta para o XML.
		Conta conta = new Conta();
		conta.setLimite(2000.00);
		conta.setSaldo(2000.00);
		conta.setNum_conta("73742-5");
		
		Cliente cliente = new Cliente ();
		cliente.setNome("Rafael Cosentino");
		
		conta.setCliente(cliente);
		marshaller.marshal (conta , new File("conta.xml"));
		
		
		//Deserializando o XML para o objeto Conta.
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Conta conta2 = (Conta)unmarshaller.unmarshal(new File("conta.xml"));
		
		System.out.println("Saldo: " + conta2.getSaldo());
		System.out.println("Limite: " + conta2.getLimite());
		System.out.println("Numero Conta:" +conta2.getNum_conta());
		System.out.println("Cliente Conta:" +conta2.getCliente().getNome());
	}
}
